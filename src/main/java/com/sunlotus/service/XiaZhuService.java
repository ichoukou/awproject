package com.sunlotus.service;

import com.sunlotus.common.model.XiazhuTable;

public class XiaZhuService {

	public boolean add(XiazhuTable xt){
		return xt.save();
	}
	
}
