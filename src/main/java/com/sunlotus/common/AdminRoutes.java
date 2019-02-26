package com.sunlotus.common;

import com.jfinal.config.Routes;
import com.sunlotus.controller.AdminController;
import com.sunlotus.controller.OpenController;
import com.sunlotus.controller.OpenLogController;
import com.sunlotus.sys.quartz.controller.QuartzController;

/**
 * 前台路由
 */
public class AdminRoutes extends Routes {

	public void config() { 
		addInterceptor(new AdminInterceptor());
		
		add("/adminstr/dfsw/rerw/gfwqwe/fghfghrt", AdminController.class);
		add("/adminstr/userpc/kqskdj/yuiasjx/qwieusk", OpenController.class);
		add("/adminstr/fdgdw/fgfwe/aqwe/qwieusk", OpenLogController.class);
		add("/adminstr/cvncvs/dsfs/wqewq/fcvbxxz", QuartzController.class); 
	}
}
