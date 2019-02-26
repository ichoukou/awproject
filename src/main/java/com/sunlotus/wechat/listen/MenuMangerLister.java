package com.sunlotus.wechat.listen;

import com.sunlotus.wechat.until.MenuManger;

public class MenuMangerLister{
	
	private MenuManger uMenuManger;
	
	public void InitWechatMenu(){
		uMenuManger = new MenuManger();
		uMenuManger.CheckMenu();
	}
	
}
