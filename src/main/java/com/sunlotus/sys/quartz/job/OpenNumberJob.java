package com.sunlotus.sys.quartz.job;

import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sunlotus.common.model.OpenNumber;
import com.sunlotus.common.model.Opend_log;
import com.sunlotus.common.model.TaskConfig;
import com.sunlotus.common.model.WechatUser;
import com.sunlotus.common.model.XiazhuTable;
import com.sunlotus.wechat.until.KaiCaiDateUntil;

public class OpenNumberJob implements Job{
	/*private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static final String token = "t10e9c565ded1e473k";
	private static final String code = "bjpk10";
	private static final String rows = "1";
	private static final String format = "json";*/
	
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println("这个定时器需要8秒执行一次，用于获取接口数据");
		/*String url = "http://ho.apiplus.net/newly.do?";
		url += "token="+token+"&";
		url += "code="+code+"&";
		url += "rows="+rows+"&";
		url += "format="+format;*/
		String url = "http://t.apiplus.net/newly.do?code=cqssc&format=json&rows=1";
		String urlAll = new StringBuffer(url).toString();
		String charset = "UTF-8";
		String jsonResult = KaiCaiDateUntil.getHttpDate(urlAll, charset);
		JSONObject jsonObject = JSONObject.parseObject(jsonResult);
		String dataStr = jsonObject.getString("data");
		JSONArray jsonArray = JSONArray.parseArray(dataStr);
		for(int i=0; i<jsonArray.size(); i++){
			JSONObject obj = jsonArray.getJSONObject(i);
			Opend_log on = Opend_log.dao.findFirst("SELECT id FROM opennumber_log WHERE create_qihao = '"+obj.getString("expect")+"'");
			if(null==on){ //如果这个为空，就说明还没开过的号码
				Opend_log openNum = new Opend_log();
				openNum.set("create_qihao", obj.getString("expect"));
				openNum.set("create_open", obj.getString("opencode"));
				openNum.set("create_time", obj.getString("opentime"));
				boolean yessave = openNum.save();
				if(yessave){
					TaskConfig st = TaskConfig.dao.findById("1");
					st.set("second", 1200);//重新更新秒数
					st.update();
					
					//开始统计中奖号码
					//IsWin(obj.getString("expect"),obj.getString("opencode"));
				}
			}
		}
	}
	
	//验证下注号码中是否有中奖
	public static boolean IsWin(String qiNum,String openumber){
		List<XiazhuTable> blog = XiazhuTable.dao.find("SELECT * FROM xiazhu_table WHERE fd_qishu = '"+qiNum+"'");
		String openum[] = openumber.split(",");
		for(XiazhuTable bd : blog){
			WechatUser uif = WechatUser.dao.findById(bd.getStr("openId"));
			int s = Integer.parseInt(bd.getStr("fd_type"));
			String sd = openum[s-1];
			String sds = bd.getStr("fd_num");
			if(sd.equals(sds)){
				bd.set("fd_iswin", "1");//赢
				uif.set("fd_money", uif.getDouble("fd_money")+(bd.getDouble("fd_tatol")*9.7)); //倍率
			}else{
				bd.set("fd_iswin", "0");//输
				//uif.set("fd_money", uif.getDouble("fd_money")-bd.getDouble("fd_tatol")); //输没有倍率
			}
			if(bd.update()){
				uif.update();//更新用户余额
			}
		}
		return true;
	}

}
