package kuangjia_houtai_action;

import com.webtest.core.WebDriverEngine;

public class shezhi_zhandian{

	WebDriverEngine webtest = null;
	public shezhi_zhandian(WebDriverEngine webtest){
		this.webtest = webtest;
	}
	
	//后台设置-备份还原的点击
	public void dianji() throws InterruptedException{
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'备份还原')]");
	}
	
	//备份按钮点击的校验
	public void beifen() throws InterruptedException{
		webtest.click("xpath=//a[@class='btn btn-primary']");
		webtest.click("xpath=//button[@class='btn btn-primary']");
	}
	
	//备注超链接点击的校验
	public void beizhu() throws InterruptedException{
		webtest.click("class=noter");
	}
	
	//备注超链接点击后文本框输入的校验
	public void beizhushuru() throws InterruptedException{
		webtest.click("class=noter");
		webtest.type("id=note", "历史");
		webtest.click("id=submit");
	}

	//修改超链接点击的校验
	public void xiugai() throws InterruptedException{
		webtest.click("xpath=//a[contains(@data-width,'400')]");
	}
	
	//修改超链接点击后文本框输入的校验
	public void xiugaishuru() throws InterruptedException{
		webtest.click("xpath=//a[contains(@data-width,'400')]");
		webtest.typeAndClear("id=holdDays", "10");
		webtest.click("id=submit");
	}
}
