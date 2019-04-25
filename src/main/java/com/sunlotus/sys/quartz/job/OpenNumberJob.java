package com.sunlotus.sys.quartz.job;

import java.util.ArrayList;
import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.sunlotus.common.model.OpenNumber;
import com.sunlotus.common.model.Opend_log;
import com.sunlotus.common.model.TaskConfig;
import com.sunlotus.common.model.WechatUser;
import com.sunlotus.common.model.XiazhuTable;
import com.sunlotus.sys.until.BuildNumber;
import com.sunlotus.wechat.until.HttpRequestUntil;

public class OpenNumberJob implements Job{
	/*private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static final String token = "t10e9c565ded1e473k";
	private static final String code = "bjpk10";
	private static final String rows = "1";
	private static final String format = "json";*/
	
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		//System.out.println("这个定时器需要8秒执行一次，用于获取接口数据");
		/*String url = "http://ho.apiplus.net/newly.do?";
		url += "token="+token+"&";
		url += "code="+code+"&";
		url += "rows="+rows+"&";
		url += "format="+format;*/
		String url = "http://t.apiplus.net/newly.do?code=cqssc&format=json&rows=1";
		String urlAll = new StringBuffer(url).toString();
		String charset = "UTF-8";
		String jsonResult = HttpRequestUntil.getHttpDate(urlAll, charset);
		JSONObject jsonObject = JSONObject.parseObject(jsonResult);
		String dataStr = jsonObject.getString("data");
		JSONArray jsonArray = JSONArray.parseArray(dataStr);
		for(int i=0; i<jsonArray.size(); i++){
			JSONObject obj = jsonArray.getJSONObject(i);
			Opend_log on = Opend_log.dao.findFirst("SELECT id FROM opennumber_log WHERE create_qihao = '"+obj.getString("expect")+"'");
			if(null==on){ //如果这个为空，就说明还没开过的号码
				String openNumStr = obj.getString("opencode");
				String qihao = obj.getString("expect");
				openNumStr = openNumStr.substring(1, openNumStr.length()-2);
				openNumStr = "1"+openNumStr;
				System.out.println("===================================开奖号码："+openNumStr);
				Opend_log openNum = new Opend_log();
				openNum.set("create_qihao", qihao);
				openNum.set("create_open", openNumStr);
				openNum.set("create_time", obj.getString("opentime"));
				boolean yessave = openNum.save();
				if(yessave){
					TaskConfig st = TaskConfig.dao.findById("1");
					st.set("second", 1200);//重新更新秒数
					st.update();
					
					//开始统计中奖号码
					//IsWin(obj.getString("expect"),obj.getString("opencode"));
				}
				
				/**
				 * 1、根据中奖的号码
				 * 2、查找下注表里面是否有中奖的号码
				 */
				//计算二字现中奖
				List<String> x1 = BuildNumber.GetErZiXian(openNumStr);
				for(String s:x1){
					List<XiazhuTable> xt = XiazhuTable.dao.find("SELECT * FROM xiazhu_table WHERE numType = 4 AND status = 0 AND number = ? AND qihao = ? ", s, qihao);
					List<Record> lr = new ArrayList<Record>();
					for(XiazhuTable winxt : xt){
						Record wu = Db.findById("wechat_user", winxt.getStr("openId"));
						double winMoney = winxt.getFloat("domoney")*9.7;
						wu.set("balance", wu.getFloat("balance")+winMoney);
						lr.add(wu);
					}
					Db.batchUpdate("wechat_user", lr, 200); //批量更新
				}
				//计算三字现中奖
				List<String> x2 = BuildNumber.GetSanZiXian(openNumStr);
				for(String s:x2){
					List<XiazhuTable> xt = XiazhuTable.dao.find("SELECT * FROM xiazhu_table WHERE numType = 5 AND status = 0 AND number = ? AND qihao = ? ", s, qihao);
					List<Record> lr = new ArrayList<Record>();
					for(XiazhuTable winxt : xt){
						Record wu = Db.findById("wechat_user", winxt.getStr("openId"));
						double winMoney = winxt.getFloat("domoney")*46;
						wu.set("balance", wu.getFloat("balance")+winMoney);
						lr.add(wu);
					}
					Db.batchUpdate("wechat_user", lr, 200); //批量更新
				}
				//计算四字现中奖
				List<String> x3 = BuildNumber.GetSiZiXian(openNumStr);
				for(String s:x3){
					List<XiazhuTable> xt = XiazhuTable.dao.find("SELECT * FROM xiazhu_table WHERE numType = 6 AND status = 0 AND number = ? AND qihao = ? ", s, qihao);
					List<Record> lr = new ArrayList<Record>();
					for(XiazhuTable winxt : xt){
						Record wu = Db.findById("wechat_user", winxt.getStr("openId"));
						double winMoney = winxt.getFloat("domoney")*360;
						wu.set("balance", wu.getFloat("balance")+winMoney);
						lr.add(wu);
					}
					Db.batchUpdate("wechat_user", lr, 200); //批量更新
				}
				//计算一字定中奖
				List<String> d1 = BuildNumber.GetYiZiDing(openNumStr);
				for(String s:d1){
					List<XiazhuTable> xt = XiazhuTable.dao.find("SELECT * FROM xiazhu_table WHERE numType = 0 AND status = 0 AND number = ? AND qihao = ? ", s, qihao);
					List<Record> lr = new ArrayList<Record>();
					for(XiazhuTable winxt : xt){
						Record wu = Db.findById("wechat_user", winxt.getStr("openId"));
						double winMoney = winxt.getFloat("domoney")*9.7;
						wu.set("balance", wu.getFloat("balance")+winMoney);
						lr.add(wu);
					}
					Db.batchUpdate("wechat_user", lr, 200); //批量更新
				}

				//计算二字定中奖
				List<String> d2 = BuildNumber.GetErZiDing(openNumStr);
				for(String s:d2){
					List<XiazhuTable> xt = XiazhuTable.dao.find("SELECT * FROM xiazhu_table WHERE numType = 1 AND status = 0 AND number = ? AND qihao = ? ", s, qihao);
					List<Record> lr = new ArrayList<Record>();
					for(XiazhuTable winxt : xt){
						Record wu = Db.findById("wechat_user", winxt.getStr("openId"));
						double winMoney = winxt.getFloat("domoney")*97;
						wu.set("balance", wu.getFloat("balance")+winMoney);
						lr.add(wu);
					}
					Db.batchUpdate("wechat_user", lr, 200); //批量更新
				}

				//计算三字定中奖
				List<String> d3 = BuildNumber.GetSanZiDing(openNumStr);
				for(String s:d3){
					List<XiazhuTable> xt = XiazhuTable.dao.find("SELECT * FROM xiazhu_table WHERE numType = 1 AND status = 0 AND number = ? AND qihao = ? ", s, qihao);
					List<Record> lr = new ArrayList<Record>();
					for(XiazhuTable winxt : xt){
						Record wu = Db.findById("wechat_user", winxt.getStr("openId"));
						double winMoney = winxt.getFloat("domoney")*970;
						wu.set("balance", wu.getFloat("balance")+winMoney);
						lr.add(wu);
					}
					Db.batchUpdate("wechat_user", lr, 200); //批量更新
				}

				//计算四字定中奖
				List<String> d4 = BuildNumber.GetSiZiDing(openNumStr);
				for(String s:d4){
					List<XiazhuTable> xt = XiazhuTable.dao.find("SELECT * FROM xiazhu_table WHERE numType = 1 AND status = 0 AND number = ? AND qihao = ? ", s, qihao);
					List<Record> lr = new ArrayList<Record>();
					for(XiazhuTable winxt : xt){
						Record wu = Db.findById("wechat_user", winxt.getStr("openId"));
						double winMoney = winxt.getFloat("domoney")*9700;
						wu.set("balance", wu.getFloat("balance")+winMoney);
						lr.add(wu);
					}
					Db.batchUpdate("wechat_user", lr, 200); //批量更新
				}
				//更新不中奖的人员的金额
				List<Record> lose = Db.find("SELECT * FROM xiazhu_table WHERE status = 0 AND qihao = ?");
				List<Record> loseUp = new ArrayList<Record>();
				for(Record losr : lose){
					Record wu = Db.findById("wechat_user", losr.getStr("openId"));
					wu.set("balance", wu.getFloat("balance")-losr.getFloat("domoney"));
					loseUp.add(wu);
				}
				Db.batchUpdate("wechat_user", loseUp, 200); //批量更新
				//更新档期全部的下注号码为“已开奖”
				Db.update("UPDATE xiazhu_table SET status = 1 WHERE status = 0 AND qihao = ?", qihao);
				
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
