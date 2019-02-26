package com.sunlotus.wechat.until;

import com.sunlotus.wechat.service.WechatService;

import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.bean.WxMenu;
import me.chanjar.weixin.common.bean.WxMenu.WxMenuButton;
import me.chanjar.weixin.common.exception.WxErrorException;

public class MenuManger {

	private WechatService wxMpService = new WechatService().getInstance();

	/**
	 * 
	 * @Title: CheckMenu
	 * @return: void
	 */
	public void CheckMenu() {
		try {
			// 1.获取公众号自定义菜单
			// 2.判断是否已经存在自定义菜单
			WxMenu wxMenuOld = wxMpService.menuGet();
			if (wxMenuOld == null) {
				WxMenu wxMenuNew = new WxMenu();
				WxMenuButton businessButton = new WxMenuButton();
				businessButton.setName("业务办理2");
				businessButton.setType(WxConsts.BUTTON_VIEW);
				businessButton.setUrl(buildAuthorizationUrl(
						"http://kgextj.natappfree.cc",
						WxConsts.OAUTH2_SCOPE_BASE, null));

				WxMenuButton mineButton = new WxMenuButton();
				mineButton.setType(WxConsts.BUTTON_VIEW);
				mineButton.setName("我的订单去");
				mineButton.setUrl(
						buildAuthorizationUrl("http://kgextj.natappfree.cc",
								WxConsts.OAUTH2_SCOPE_BASE, null));

				WxMenuButton yhButton = new WxMenuButton();
				yhButton.setName("Y是H");

				wxMenuNew.getButtons().add(businessButton);
				wxMenuNew.getButtons().add(mineButton);
				wxMenuNew.getButtons().add(yhButton);

				WxMenuButton newsButton = new WxMenuButton();
				newsButton.setType(WxConsts.BUTTON_CLICK);
				newsButton.setName("最新资讯");
				newsButton.setKey("news");

				WxMenuButton luButton = new WxMenuButton();
				luButton.setType(WxConsts.BUTTON_VIEW);
				luButton.setName("联系我们");
				luButton.setUrl(
						buildAuthorizationUrl("http://kgextj.natappfree.cc",
								WxConsts.OAUTH2_SCOPE_BASE, null));

				WxMenuButton auButton = new WxMenuButton();
				auButton.setType(WxConsts.BUTTON_VIEW);
				auButton.setName("关于我们");
				auButton.setUrl(
						buildAuthorizationUrl("http://kgextj.natappfree.cc",
								WxConsts.OAUTH2_SCOPE_BASE, null));

				yhButton.getSubButtons().add(newsButton);
				yhButton.getSubButtons().add(luButton);
				yhButton.getSubButtons().add(auButton);

				wxMpService.menuCreate(wxMenuNew);
				
				System.out.println("初始化自定义按钮成功1！");

			} else {
				wxMpService.menuDelete();
				WxMenu wxMenuNew = new WxMenu();
				WxMenuButton businessButton = new WxMenuButton();
				businessButton.setName("业务办理3");
				businessButton.setType(WxConsts.BUTTON_VIEW);
				businessButton.setUrl(buildAuthorizationUrl(
						"http://kgextj.natappfree.cc",
						WxConsts.OAUTH2_SCOPE_BASE, null));

				WxMenuButton mineButton = new WxMenuButton();
				mineButton.setType(WxConsts.BUTTON_VIEW);
				mineButton.setName("我的订单去");
				mineButton.setUrl(
						buildAuthorizationUrl("http://kgextj.natappfree.cc",
								WxConsts.OAUTH2_SCOPE_BASE, null));

				WxMenuButton yhButton = new WxMenuButton();
				yhButton.setName("Y就H");

				wxMenuNew.getButtons().add(businessButton);
				wxMenuNew.getButtons().add(mineButton);
				wxMenuNew.getButtons().add(yhButton);
				
				WxMenuButton newsButton = new WxMenuButton();
				newsButton.setType(WxConsts.BUTTON_CLICK);
				newsButton.setName("最新资讯");
				newsButton.setKey("news");

				WxMenuButton luButton = new WxMenuButton();
				luButton.setType(WxConsts.BUTTON_VIEW);
				luButton.setName("联系我们");
				luButton.setUrl(
						buildAuthorizationUrl("http://kgextj.natappfree.cc",
								WxConsts.OAUTH2_SCOPE_BASE, null));

				WxMenuButton auButton = new WxMenuButton();
				auButton.setType(WxConsts.BUTTON_VIEW);
				auButton.setName("关于我们");
				auButton.setUrl(
						buildAuthorizationUrl("http://kgextj.natappfree.cc",
								WxConsts.OAUTH2_SCOPE_BASE, null));
				
				yhButton.getSubButtons().add(newsButton);
				yhButton.getSubButtons().add(luButton);
				yhButton.getSubButtons().add(auButton);

				wxMpService.menuCreate(wxMenuNew);
				System.out.println("启动自定义按钮成功2！");
			}

		} catch (WxErrorException e) {
			e.printStackTrace();
			System.out.println("自定义菜单创建失败！");
			
		}
	}

	/**
	 * 
	 * @Title: buildAuthorizationUrl
	 * @param redirectURI
	 * @param scope
	 * @param state
	 * @return
	 * @return: String
	 */
	private String buildAuthorizationUrl(String redirectURI, String scope, String state) {
		return wxMpService.oauth2buildAuthorizationUrl(redirectURI, scope, state);
	}

	/**
	 * 
	 * @Title: main
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		MenuManger mm = new MenuManger();
		String url = mm.buildAuthorizationUrl("http://kgextj.natappfree.cc",
				WxConsts.OAUTH2_SCOPE_BASE, null);
		System.out.println(url);
	}
}
