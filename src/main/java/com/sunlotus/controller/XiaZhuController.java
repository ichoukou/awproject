package com.sunlotus.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;

import com.alibaba.fastjson.JSONObject;
import com.jfinal.aop.Aop;
import com.jfinal.core.Controller;
import com.sunlotus.common.model.XiazhuTable;
import com.sunlotus.service.XiaZhuService;

public class XiaZhuController extends Controller{
	private SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	static XiaZhuService xiaZhuService = Aop.get(XiaZhuService.class);
	
	public void addNumber(){
		XiazhuTable xzt = getModel(XiazhuTable.class, "form");
		String openId = (String) getRequest().getSession().getAttribute("openId");
		//还需要判断余额是否足够下注

		xzt.set("qihao", "222");
		xzt.set("openId", openId);
		xzt.set("createTime", sf.format(new Date()));
		JSONObject jsono = new JSONObject();
		jsono.put("msg", false);
		if(xiaZhuService.add(xzt)){
			jsono.put("msg", true);
		}
		renderJson(jsono);
	}
	
}
