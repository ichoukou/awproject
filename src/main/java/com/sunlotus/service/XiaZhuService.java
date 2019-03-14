package com.sunlotus.service;

import java.util.List;

import com.sunlotus.common.model.Opend_log;
import com.sunlotus.common.model.WechatUser;
import com.sunlotus.common.model.XiazhuTable;

public class XiaZhuService {

	/**
	 * 保存下注信息
	 * @param xt
	 * @return
	 */
	public boolean add(XiazhuTable xt){
		return xt.save();
	}
	
	/**
	 * 根据openId获取用户余额
	 */
	public WechatUser getBalance(String openId){
		return WechatUser.dao.findById(openId);
	}
	
	/**
	 * 获取数据库中最新的期号
	 */
	public String getNewQihao(){
		Opend_log newol = Opend_log.dao.findFirst("SELECT create_qihao FROM opennumber_log ORDER BY create_time DESC");
		return newol.getStr("create_qihao");
	}
	
	/**
	 * 获取下注记录
	 */
	public List<XiazhuTable> getBatessLog(String openId){
		List<XiazhuTable> xzlist = XiazhuTable.dao.find("SELECT qihao,number,numType,createTime,domoney,STATUS FROM xiazhu_table WHERE openId = ? ORDER BY createTime DESC LIMIT 150", openId);
		return xzlist;
	}
	
	/**
	 * 获取最近开奖5次的记录
	 */
	public List<Opend_log> getFiveList(){
		List<Opend_log> newol = Opend_log.dao.find("SELECT * FROM opennumber_log ORDER BY create_time ASC LIMIT 5");
		return newol;
	}
	
}
