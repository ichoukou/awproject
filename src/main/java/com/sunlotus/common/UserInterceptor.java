package com.sunlotus.common;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import me.chanjar.weixin.common.exception.WxErrorException;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;
import com.jfinal.core.Controller;
import com.sunlotus.wechat.service.WechatService;

public class UserInterceptor implements Interceptor{
	//private WechatService wxMpService = new WechatService().getInstance();
	
	@Inject
	WechatService wxMpService;
	
	public void intercept(Invocation ai) {
		Controller controller = ai.getController();
		HttpServletRequest request = controller.getRequest();
		String newCode = request.getParameter("code");
		/*if(null==newCode){
			ai.getController().renderError(404);
		}*/
		HttpSession session = request.getSession();
		session.setAttribute("openId", "ocJ1B5moezUBmSJqPw0rJ4JNl3ww");
		/*Object obj = session.getAttribute("openId");
		if (obj == null) {
			try {
				String openId = wxMpService.getInstance().getWxUser(newCode); 
				session.setAttribute("openId", openId);
				System.out.println(openId);
			} catch (WxErrorException e) {
				ai.getController().renderError(404);
				e.printStackTrace();
			}
		}*/
		ai.invoke();
	}

}
