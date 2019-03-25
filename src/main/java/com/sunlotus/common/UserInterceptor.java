package com.sunlotus.common;

import java.net.UnknownHostException;
import java.util.Date;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import me.chanjar.weixin.common.exception.WxErrorException;

import com.alibaba.fastjson.JSONObject;
import com.jfinal.aop.Aop;
import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;
import com.jfinal.core.Controller;
import com.jfinal.kit.PathKit;
import com.jfinal.plugin.activerecord.Record;
import com.sunlotus.common.model.WechatUser;
import com.sunlotus.service.WechatUserService;
import com.sunlotus.wechat.service.WechatService;
import com.sunlotus.wechat.until.HttpRequestUntil;

public class UserInterceptor implements Interceptor{
	private final static String access_token_url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wx273ea9b350cea64b&secret=4d9151b5ed5211ebd10948ee36eceee4"; 
	private String wechar_user_info_url = "https://api.weixin.qq.com/cgi-bin/user/info?";
	
	@Inject
	WechatService wxMpService;
	
	WechatUserService wechatUserService = Aop.get(WechatUserService.class);
	
	@SuppressWarnings("static-access")
	public void intercept(Invocation ai) {
		Controller controller = ai.getController();
		String repUrl = ai.getActionKey();
		HttpServletRequest request = controller.getRequest();
		HttpSession session = request.getSession();
		String newCode = request.getParameter("code");
		Object obj = session.getAttribute("openId");
		if(repUrl.indexOf("/homes")>=0||repUrl.indexOf("/members")>=0||repUrl.indexOf("/setups")>=0|repUrl.indexOf("/kefus")>=0){
			if (obj == null) {
				try {
					String openId = wxMpService.getInstance().getWxUser(newCode);
					session.setAttribute("openId", openId);
					Record rec = wechatUserService.getUserById(openId);
					if(rec==null){
						/**
						 * 如果等于空则需要根据openId请求微信接口拿用户数据
						 * 1、需要获取access_token
						 * 2、在根据access_token和opendId即可获取用户信息
						 */
						String jsonResult = HttpRequestUntil.getHttpDate(access_token_url, "UTF-8");
						JSONObject accJsono = JSONObject.parseObject(jsonResult);
						if(null==accJsono.getString("errcode")){
							String acc_token = accJsono.getString("access_token");
							wechar_user_info_url+="access_token="+acc_token+"&openid="+openId+"&lang=zh_CN";
							String userInfo = HttpRequestUntil.getHttpDate(wechar_user_info_url, "UTF-8");
							JSONObject userInfoJson = JSONObject.parseObject(userInfo);
							WechatUser wu = new WechatUser();
							wu.set("id", openId);
							wu.set("balance", 0.00);
							wu.set("create_time", new Date());
							wu.set("nicheng", userInfoJson.getString("nickname"));
							String proJectUrl = PathKit.getWebRootPath()+"/UserHeadImg/";
							String HeadImgName = UUID.randomUUID().toString().replaceAll("-", "");
							proJectUrl+=HeadImgName+".jpg";
							try {
								HttpRequestUntil.DownLoadPages(userInfoJson.getString("headimgurl"), proJectUrl);
							} catch (UnknownHostException e) {
								e.printStackTrace();
							}
							wu.set("head_img", "UserHeadImg/"+HeadImgName+".jpg");
							wu.save();
						}else{
							ai.getController().renderError(404);
						}
					}else{
						session.setAttribute("headimgurl", rec.getStr("head_img"));
						session.setAttribute("nickname", rec.getStr("nicheng"));
					}
				} catch (WxErrorException e) {
					ai.getController().renderError(404);
					e.printStackTrace();
				}
			}
		}
		
		//session.setAttribute("openId", "ocJ1B5moezUBmSJqPw0rJ4JNl3ww");
		
		ai.invoke();
	}

}
