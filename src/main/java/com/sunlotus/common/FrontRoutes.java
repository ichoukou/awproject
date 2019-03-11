package com.sunlotus.common;

import com.jfinal.config.Routes;
import com.sunlotus.controller.IndexController;

/**
 * 前台路由
 */
public class FrontRoutes extends Routes {

	public void config() {
		addInterceptor(new UserInterceptor());
		
		add("/", IndexController.class);
	}
}
