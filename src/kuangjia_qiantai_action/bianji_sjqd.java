package kuangjia_qiantai_action;

import org.openqa.selenium.WebElement;

import com.webtest.core.WebDriverEngine;

public class bianji_sjqd {

	WebDriverEngine webtest = null;
	public bianji_sjqd(WebDriverEngine webtest){
		this.webtest = webtest;
	}
	
	//�༭ҳ�������޸ĵ���������
	public void neirong(String a) throws InterruptedException{
	    webtest.click("link=��̳");
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
