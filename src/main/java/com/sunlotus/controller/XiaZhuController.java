package com.sunlotus.controller;

import com.alibaba.fastjson.JSONObject;
import com.jfinal.core.Controller;
import com.sunlotus.common.model.XiazhuTable;

public class XiaZhuController extends Controller{

	public void addNumber(){
		XiazhuTable xzt = getModel(XiazhuTable.class, "form");
		System.out.println(xzt);
		JSONObject jsono = new JSONObject();
		jsono.put("msg", true);
		renderJson(jsono);
	}
	
}
