package com.sunlotus.controller;


import com.jfinal.core.Controller;

public class IndexController extends Controller {

	/**
	 * 主页
	 */
	public void index(){
		/*List<Opend_log> opendlog = Opend_log.dao.find("SELECT * FROM opennumber_log ORDER BY create_time DESC LIMIT 200");
		TaskConfig tc = TaskConfig.dao.findById(1);
		if(tc.getInt("second")==-1){
			setAttr("tc", -1);
		}else{
			setAttr("tc", tc.getInt("second")*1000);
		}
		setAttr("opendlog", opendlog);*/
		render("/page/front/index.html");
	}
	
	/**
	 * 开奖记录
	 */
	public void openlog(){
		render("/page/front/log.html");
	}
	
	/**
	 * 成员
	 */
	public void members(){
		render("/page/front/member.html");
	}
	
	/**
	 * 客服
	 */
	public void kefus(){
		render("/page/front/kefu.html");
	}
	
	/**
	 * 设置
	 */
	public void setups(){
		render("/page/front/setup.html");
	}
	
	/**
	 * 个人信息
	 */ 
	public void selfInfos(){
		render("/page/front/selfInfo.html");
	}
	
	/**
	 * 上传二维码
	 */
	public void uperweimas(){
		render("/page/front/uperweima.html");
	}
	
	/**
	 * 下级拉人
	 */
	public void xiajilarens(){
		render("/page/front/xiajilaren.html");
	}
	
	/**
	 * 房主信息
	 */
	public void housers(){
		render("/page/front/houser.html");
	}
	
	/**
	 * 充值记录
	 */
	public void rechs(){
		render("/page/front/rech.html");
	}
	
	/**
	 * 退款记录
	 */
	public void refunds(){
		render("/page/front/refund.html");
	}
	
	/**
	 * 交易明细
	 */
	public void transs(){
		render("/page/front/trans.html");
	}
	
	/**
	 * 赔率查看
	 */
	public void oddss(){
		render("/page/front/odds.html");
	}
	
	/**
	 * 下注查看
	 */
	public void betss(){
		render("/page/front/bets.html");
	}
	
	/**
	 * 下级查看
	 */
	public void xiajisees(){
		render("/page/front/xiajisee.html");
	}
	
	/**
	 * 玩法说明
	 */
	public void plays(){
		render("/page/front/play.html");
	}
	
	/**
	 * 下注首页
	 */
	public void XiazhuHomes(){
		render("/page/front/xiazhuHome.html");
	}
	
	/**
	 * 上线页面
	 */
	public void onlines(){
		render("/page/front/online.html");
	}
}
