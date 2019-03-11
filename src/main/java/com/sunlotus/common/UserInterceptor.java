package com.sunlotus.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import me.chanjar.weixin.common.exception.WxErrorException;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;
import com.jfinal.core.Controller;
import com.sunlotus.wechat.service.WechatService;

public class UserInterceptor implements Interceptor{
	private WechatService wxMpService = new WechatService().getInstance();
	
	public void intercept(Invocation ai) {
		Controller controller = ai.getController();
		HttpServletRequest request = controller.getRequest();
		String newCode = request.getParameter("code");
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("openId");
		if (obj == null) {
			try {
				String openId = wxMpService.getWxUser(newCode); 
				session.setAttribute("openId", openId);
				System.out.println(openId);
			} catch (WxErrorException e) {
				e.printStackTrace();
			}
		}
		ai.invoke();
	}

}
