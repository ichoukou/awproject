package com.sunlotus.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.alibaba.fastjson.JSONObject;
import com.jfinal.aop.Aop;
import com.jfinal.core.Controller;
import com.jfinal.kit.StrKit;
import com.sunlotus.common.model.WechatUser;
import com.sunlotus.common.model.XiazhuTable;
import com.sunlotus.service.XiaZhuService;
import com.sunlotus.sys.until.FormString;

public class XiaZhuController extends Controller{
	private SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	private SimpleDateFormat qihaoDate = new SimpleDateFormat("yyyyMMdd");
	
	static XiaZhuService xiaZhuService = Aop.get(XiaZhuService.class);
	
	public void addNumber(){
		JSONObject jsono = new JSONObject();
		jsono.put("msg", false);
		XiazhuTable xzt = getModel(XiazhuTable.class, "form");
		String openId = (String) getRequest().getSession().getAttribute("openId");
		//判断openId是否为空，为空则说明不是微信客户端来的，直接返回错误
		if(StrKit.isBlank(openId)){
			jsono.put("error", "请使用微信关注公众号之后进行游戏");
			renderJson(jsono);
			return;
		}
		//还需要判断余额是否足够下注
		WechatUser weUs = xiaZhuService.getBalance(openId);
		if(weUs.getFloat("balance")<xzt.getFloat("domoney")){
			jsono.put("error", "余额不足，不能下注");
			renderJson(jsono);
			return;
		}
		//需要用余额减掉下注的金额
		float loadBalan = (weUs.getFloat("balance"))-(xzt.getFloat("domoney"));
		weUs.set("balance", loadBalan);
		weUs.update();//更新余额
		String qihao = xiaZhuService.getNewQihao().getStr("create_qihao");
		xzt.set("qihao", qihaoDate.format(new Date())+FormString.formNum(qihao));
		xzt.set("openId", openId);
		xzt.set("createTime", sf.format(new Date()));
		xzt.set("status", "0");
		if(xiaZhuService.add(xzt)){
			jsono.put("msg", true);
		}
		renderJson(jsono);
	}
	
	//临时接口
	/*public void aa(){
		String jsonStr = getPara("jsonStr");
		JSONObject jsono = JSONObject.parseObject(jsonStr);
		JSONArray jsona = JSONArray.parseArray(jsono.getString("data"));
		List<Opend_log> lol = new ArrayList<Opend_log>();
		for(int i=0; i<jsona.size(); i++){
			JSONObject jsonoch = jsona.getJSONObject(i);
			Opend_log ol = new Opend_log();
			ol.set("create_qihao", jsonoch.getString("expect"));
			ol.set("create_open", jsonoch.getString("opencode"));
			ol.set("create_time", jsonoch.getString("opentime"));
			lol.add(ol);
		}
		Db.batchSave(lol, 100);
		renderJson("{'msg':'false'}");
	}*/
	
}
