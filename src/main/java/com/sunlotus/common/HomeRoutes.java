package com.sunlotus.common;

import com.jfinal.config.Routes;
import com.sunlotus.controller.LoginController;
import com.sunlotus.controller.XiaZhuController;
import com.sunlotus.wechat.controller.WechatController;

/**
 * 前台路由
 */
public class HomeRoutes extends Routes {

	public void config() { 
		add("/adsdowekd/fsddw/hgjgw/bnmrty/wertgfsd", LoginController.class);
		add("/wechatController", WechatController.class);
		add("/str/userpc/kqskdj/yuiasjx/qwieusk", XiaZhuController.class);
	}
}
