package com.sunlotus.wechat.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jfinal.core.Controller;
import com.sunlotus.wechat.service.WechatService;

import me.chanjar.weixin.common.util.StringUtils;
import me.chanjar.weixin.mp.bean.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.WxMpXmlOutMessage;

public class WechatController extends Controller{
	
	private WechatService wxMpService =  WechatService.getInstance();
	/**
     * 
     * @Title: wechatGet 
     * @Description: 微信GET请求
     * @param request
     * @param response
     * @throws IOException
     * @return: void
     */
	public void wechatGet() throws IOException {
		System.out.println("chenxz28");
		HttpServletRequest request = getRequest();
		HttpServletResponse response = getResponse();
		response.setContentType("text/html;charset=utf-8");
		response.setStatus(HttpServletResponse.SC_OK); 

		String signature = request.getParameter("signature");
		String nonce = request.getParameter("nonce");
		String timestamp = request.getParameter("timestamp");

		if (!wxMpService.checkSignature(timestamp, nonce, signature)) {
			// 消息签名不正确，说明不是公众平台发过来的消息
			response.getWriter().println("非法请求");
			return;
		}

		String echostr = request.getParameter("echostr");
		
		/*System.out.println("signature："+signature);
		System.out.println("nonce："+nonce);
		System.out.println("timestamp："+timestamp);
		System.out.println("echostr："+echostr);*/
		
		if (StringUtils.isNotBlank(echostr)) {
			// 说明是一个仅仅用来验证的请求，回显echostr
			renderText(echostr);
			return;
		}
		render("关注成功！");
		
	}
	
	/**
	 * 
	 * @Title: wechatPost 
	 * @Description: 微信POST请求
	 * @param request
	 * @param response
	 * @throws IOException
	 * @return: void
	 */
	public void wechatPost() throws IOException {
		System.out.println("chenxz52");
		HttpServletRequest request = getRequest();
		HttpServletResponse response = getResponse();
		response.setContentType("text/html;charset=utf-8");
		response.setStatus(HttpServletResponse.SC_OK);
		String signature = request.getParameter("signature");
		String nonce = request.getParameter("nonce");
		String timestamp = request.getParameter("timestamp");

		if (!wxMpService.checkSignature(timestamp, nonce, signature)) {
			// 消息签名不正确，说明不是公众平台发过来的消息
			response.getWriter().println("非法请求");
			return;
		}

		String encryptType = StringUtils.isBlank(request.getParameter("encrypt_type")) ? "raw"
				: request.getParameter("encrypt_type");

		if ("raw".equals(encryptType)) {
			// 明文传输的消息
			WxMpXmlMessage inMessage = WxMpXmlMessage.fromXml(request.getInputStream());
			System.out.println(inMessage.toString());
			WxMpXmlOutMessage outMessage = wxMpService.route(inMessage);
			if(outMessage != null) {
				response.getWriter().write(outMessage.toXml());
			} else {
				response.getWriter().write("");
			}
			
			return;
		}

		if ("aes".equals(encryptType)) {
			// 是aes加密的消息
			String msgSignature = request.getParameter("msg_signature");
			WxMpXmlMessage inMessage = WxMpXmlMessage.fromEncryptedXml(request.getInputStream(),
					wxMpService.getWxMpInMemoryConfigStorage(), timestamp, nonce, msgSignature);
			WxMpXmlOutMessage outMessage = wxMpService.route(inMessage);
			response.getWriter().write(outMessage.toEncryptedXml(wxMpService.getWxMpInMemoryConfigStorage()));
			return;
		}

		response.getWriter().println("不可识别的加密类型");
		return;
	}
	
}
