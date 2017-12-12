package kuangjia_qiantai_action;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.webtest.core.WebDriverEngine;

import dataprovider.NSDataProvider2;

public class luntan {

	WebDriverEngine webtest = null;
	public luntan(WebDriverEngine webtest){
		this.webtest = webtest;
	}
	
	//前台论坛超链接的点击
	public void dianji() throws InterruptedException{
		webtest.click("link=论坛");
	}

	//前台论坛回帖内容不为空的校验
	public void dianji_ht() throws InterruptedException{
	    webtest.click("link=论坛");
	    Thread.sleep(3000);
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread/7.html']");
	    webtest.enterFrame(0);
	    Thread.sleep(3000);
//	    webtest.tapClick();
//	    webtest.tapType("回帖1"); 
	    webtest.click("xpath=//body");
	    webtest.type("xpath=//body", "测试1");
	    webtest.leaveFrame();
	    webtest.click("xpath=//input[@id='submit']");
	    Thread.sleep(3000);
	    webtest.click("xpath=//button[contains(.,'留在当前页面')]");
	    Thread.sleep(3000); 
	}
	
	//用数据驱动的方法完成前台论坛回帖的校验
	public void dianji_ht_sjqd(String huitie) throws InterruptedException{
		Thread.sleep(2000);
		webtest.click("link=论坛");
		Thread.sleep(2000);
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread/7.html']");
	    webtest.enterFrame(0);
	    Thread.sleep(3000);
//	    webtest.tapClick();
//	    webtest.tapType("回帖1"); 
	    webtest.click("xpath=//body");
	    webtest.type("xpath=//body", huitie);
	    webtest.leaveFrame();
	    webtest.click("xpath=//input[@id='submit']");
	    Thread.sleep(3000);
	    webtest.click("xpath=//button[contains(.,'留在当前页面')]");
	    Thread.sleep(3000); 
	   
	}
	
	//前台论坛回帖内容为空的校验
	public void dianji_ht_k() throws InterruptedException{
	    webtest.click("link=论坛");
	    Thread.sleep(3000);
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread/7.html']");
	    webtest.enterFrame(0);
	    Thread.sleep(3000);
//	    webtest.tapClick();
//	    webtest.tapType("回帖1"); 
	    webtest.click("xpath=//body");
	    webtest.type("xpath=//body", "");
	    webtest.leaveFrame();
	    webtest.click("xpath=//input[@id='submit']");
	}
	
	//浏览按钮点击的校验
	public void dianji_ll() throws InterruptedException{
	    webtest.click("link=论坛");
	    Thread.sleep(3000);
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread/11.html']");
	    webtest.click("xpath=//input[@class='fileControl']");
	    Thread.sleep(3000);
	}
	
	//回帖页面编辑超链接点击的校验
	public void huitie_bj() throws InterruptedException{
	    webtest.click("link=论坛");
	    Thread.sleep(3000);
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread/11.html']");
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread-edit-11.html']");
	    Thread.sleep(3000);
	}
	
	//修改标题文本框的校验
	public void huitie_bt() throws InterruptedException{
	    webtest.click("link=论坛");
	    Thread.sleep(3000);
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread/11.html']");
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread-edit-11.html']");
	    webtest.typeAndClear("id=title", "王静楠");
	    webtest.click("id=submit");
	}
	
	//跳转单选框的校验
	public void huitie_tz() throws InterruptedException{
	    webtest.click("link=论坛");
	    Thread.sleep(3000);
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread/11.html']");
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread-edit-11.html']");
	    webtest.click("id=isLink");
	}
	
	//只读、讨论模式复选框的校验
	public void huitie_zdtl() throws InterruptedException{
	    webtest.click("link=论坛");
	    Thread.sleep(3000);
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread/11.html']");
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread-edit-11.html']");
	    webtest.click("name=readonly");
	    webtest.click("name=discussion");
	    webtest.click("id=submit");
	}
	
}
