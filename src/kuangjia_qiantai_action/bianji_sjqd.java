package kuangjia_qiantai_action;

import org.openqa.selenium.WebElement;

import com.webtest.core.WebDriverEngine;

public class bianji_sjqd {

	WebDriverEngine webtest = null;
	public bianji_sjqd(WebDriverEngine webtest){
		this.webtest = webtest;
	}
	
	//编辑页面内容修改的数据驱动
	public void neirong(String a) throws InterruptedException{
	    webtest.click("link=论坛");
	    Thread.sleep(3000);
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread/10.html']");
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread-edit-10.html']");
	    webtest.enterFrame(0); 
	    webtest.click("xpath=//body");
	    webtest.type("xpath=//body", a);
	    webtest.leaveFrame();
	    webtest.click("id=submit");
	}
}
