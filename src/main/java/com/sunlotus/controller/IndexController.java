package com.sunlotus.controller;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jfinal.aop.Aop;
import com.jfinal.core.Controller;
import com.jfinal.kit.StrKit;
import com.sunlotus.common.model.Opend_log;
import com.sunlotus.common.model.TaskConfig;
import com.sunlotus.common.model.WechatUser;
import com.sunlotus.common.model.XiazhuTable;
import com.sunlotus.service.XiaZhuService;
import com.sunlotus.sys.until.FormString;

public class IndexController extends Controller {
	static XiaZhuService xiaZhuService = Aop.get(XiaZhuService.class);
	private SimpleDateFormat qihaoDate = new SimpleDateFormat("yyyyMMdd");
	
	/**
	 * 主页
	 */
	public void index(){
		/*List<Opend_log> opendlog = Opend_log.dao.find("SELECT * FROM opennumber_log ORDER BY create_time DESC LIMIT 200");
		
		if(tc.getInt("second")==-1){
			setAttr("tc", -1);
		}else{
			setAttr("tc", tc.getInt("second")*1000);
		}
		setAttr("opendlog", opendlog);*/
		String openId = (String) getRequest().getSession().getAttribute("openId");
		//判断openId是否为空，为空则说明不是微信客户端来的，直接返回错误
		if(StrKit.isBlank(openId)){
			setAttr("usInfo", new WechatUser());
			render("/page/front/index.html");
			return;
		}
		WechatUser wech = xiaZhuService.getBalance(openId);
		setAttr("usInfo", wech);
		render("/page/front/index.html");
	}
	
	/**
	 * 开奖记录（已解决）
	 */
	public void openlog(){
		List<Opend_log> logList = xiaZhuService.getLogList("200", "DESC");
		setAttr("logList", logList);
		render("/page/front/log.html");
	}
	
	/**
	 * 成员（未解决）
	 */
	public void members(){
		render("/page/front/member.html");
	}
	
	/**
	 * 客服（已解决）
	 */
	public void kefus(){
		render("/page/front/kefu.html");
	}
	
	/**
	 * 设置（未解决）
	 */
	public void setups(){
		render("/page/front/setup.html");
	}
	
	/**
	 * 个人信息（未解决）
	 */ 
	public void selfInfos(){
		render("/page/front/selfInfo.html");
	}
	
	/**
	 * 上传二维码（未解决）
	 */
	public void uperweimas(){
		render("/page/front/uperweima.html");
	}
	
	/**
	 * 下级拉人（未解决）
	 */
	public void xiajilarens(){
		render("/page/front/xiajilaren.html");
	}
	
	/**
	 * 房主信息（已解决）
	 */
	public void housers(){
		render("/page/front/houser.html");
	}
	
	/**
	 * 充值记录（未解决）
	 */
	public void rechs(){
		render("/page/front/rech.html");
	}
	
	/**
	 * 退款记录（未解决）
	 */
	public void refunds(){
		render("/page/front/refund.html");
	}
	
	/**
	 * 交易明细（未解决）
	 */
	public void transs(){
		render("/page/front/trans.html");
	}
	
	/**
	 * 赔率查看（已解决）
	 */
	public void oddss(){
		render("/page/front/odds.html");
	}
	
	/**
	 * 下注查看（已解决）
	 */
	public void betss(){
		String openId = (String) getRequest().getSession().getAttribute("openId");
		//判断openId是否为空，为空则说明不是微信客户端来的，直接返回错误
		if(StrKit.isBlank(openId)){
			setAttr("listXZ", null);
			render("/page/front/bets.html");
			return;
		}
		List<XiazhuTable> listXZ = xiaZhuService.getBatessLog(openId);
		setAttr("listXZ", listXZ);
		render("/page/front/bets.html");
	}
	
	/**
	 * 下级查看（未解决）
	 */
	public void xiajisees(){
		render("/page/front/xiajisee.html");
	}
	
	/**
	 * 玩法说明（已解决）
	 */
	public void plays(){
		render("/page/front/play.html");
	}
	
	/**
	 * 下注首页（已解决）
	 */
	public void XiazhuHomes(){
		String openId = (String) getRequest().getSession().getAttribute("openId");
		//判断openId是否为空，为空则说明不是微信客户端来的，直接返回错误
		if(StrKit.isBlank(openId)){
			setAttr("closetime", 0);
			render("/page/front/xiazhuHome.html");
			return;
		}
		
		Opend_log ol = xiaZhuService.getNewQihao();
		String qihao = ol.getStr("create_qihao");
		setAttr("openLog", ol);
		setAttr("qihao", qihaoDate.format(new Date())+FormString.formNum(qihao));
		
		TaskConfig tc = TaskConfig.dao.findById(1);
		setAttr("sec",tc.getInt("second")*1000);
		setAttr("close",tc.getStr("close"));
		setAttr("closetime",tc.getInt("closetime")*1000);
		render("/page/front/xiazhuHome.html");
	}
	
	/**
	 * 上线页面（已解决）
	 */
	public void onlines(){
		//系统倒计时开奖完之后，调用这个方法即可把结果推送到前端
		//new MyWebSocket().onMessageTAll();
		String openId = (String) getRequest().getSession().getAttribute("openId");
		//判断openId是否为空，为空则说明不是微信客户端来的，直接返回错误
		if(StrKit.isBlank(openId)){
			setAttr("logList", null);
			render("/page/front/online.html");
			return;
		}
		Opend_log ol = xiaZhuService.getNewQihao();
		String qihao = ol.getStr("create_qihao");
		setAttr("openLog", ol);
		setAttr("qihao", qihaoDate.format(new Date())+FormString.formNum(qihao));
		TaskConfig tc = TaskConfig.dao.findById(1);
		setAttr("sec",tc.getInt("second")*1000);
		setAttr("close",tc.getStr("close"));
		setAttr("closetime",tc.getInt("closetime")*1000);
		List<Opend_log> logList = xiaZhuService.getLogList("5","DESC");
		List<Opend_log> logl = new ArrayList<Opend_log>();
		for(int i=logList.size()-1; i>=0; i--){
			logl.add(logList.get(i));
		}
		setAttr("logList", logl);
		render("/page/front/online.html");
	}
}
