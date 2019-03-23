package com.sunlotus.service;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

public class WechatUserService {

	/**
	 * 根据openId获取数据库原先存的用户数据
	 * @param idstr
	 * @return
	 */
	public Record getUserById(String idstr){
		return Db.findById("wechat_user", idstr);
	}
	
}
