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
	
	//ǰ̨��̳�����ӵĵ��
	public void dianji() throws InterruptedException{
		webtest.click("link=��̳");
	}

	//ǰ̨��̳�������ݲ�Ϊ�յ�У��
	public void dianji_ht() throws InterruptedException{
	    webtest.click("link=��̳");
	    Thread.sleep(3000);
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread/7.html']");
	    webtest.enterFrame(0);
	    Thread.sleep(3000);
//	    webtest.tapClick();
//	    webtest.tapType("����1"); 
	    webtest.click("xpath=//body");
	    webtest.type("xpath=//body", "����1");
	    webtest.leaveFrame();
	    webtest.click("xpath=//input[@id='submit']");
	    Thread.sleep(3000);
	    webtest.click("xpath=//button[contains(.,'���ڵ�ǰҳ��')]");
	    Thread.sleep(3000); 
	}
	
	//�����������ķ������ǰ̨��̳������У��
	public void dianji_ht_sjqd(String huitie) throws InterruptedException{
		Thread.sleep(2000);
		webtest.click("link=��̳");
		Thread.sleep(2000);
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread/7.html']");
	    webtest.enterFrame(0);
	    Thread.sleep(3000);
//	    webtest.tapClick();
//	    webtest.tapType("����1"); 
	    webtest.click("xpath=//body");
	    webtest.type("xpath=//body", huitie);
	    webtest.leaveFrame();
	    webtest.click("xpath=//input[@id='submit']");
	    Thread.sleep(3000);
	    webtest.click("xpath=//button[contains(.,'���ڵ�ǰҳ��')]");
	    Thread.sleep(3000); 
	   
	}
	
	//ǰ̨��̳��������Ϊ�յ�У��
	public void dianji_ht_k() throws InterruptedException{
	    webtest.click("link=��̳");
	    Thread.sleep(3000);
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread/7.html']");
	    webtest.enterFrame(0);
	    Thread.sleep(3000);
//	    webtest.tapClick();
//	    webtest.tapType("����1"); 
	    webtest.click("xpath=//body");
	    webtest.type("xpath=//body", "");
	    webtest.leaveFrame();
	    webtest.click("xpath=//input[@id='submit']");
	}
	
	//�����ť�����У��
	public void dianji_ll() throws InterruptedException{
	    webtest.click("link=��̳");
	    Thread.sleep(3000);
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread/11.html']");
	    webtest.click("xpath=//input[@class='fileControl']");
	    Thread.sleep(3000);
	}
	
	//����ҳ��༭�����ӵ����У��
	public void huitie_bj() throws InterruptedException{
	    webtest.click("link=��̳");
	    Thread.sleep(3000);
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread/11.html']");
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread-edit-11.html']");
	    Thread.sleep(3000);
	}
	
	//�޸ı����ı����У��
	public void huitie_bt() throws InterruptedException{
	    webtest.click("link=��̳");
	    Thread.sleep(3000);
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread/11.html']");
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread-edit-11.html']");
	    webtest.typeAndClear("id=title", "�����");
	    webtest.click("id=submit");
	}
	
	//��ת��ѡ���У��
	public void huitie_tz() throws InterruptedException{
	    webtest.click("link=��̳");
	    Thread.sleep(3000);
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread/11.html']");
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread-edit-11.html']");
	    webtest.click("id=isLink");
	}
	
	//ֻ��������ģʽ��ѡ���У��
	public void huitie_zdtl() throws InterruptedException{
	    webtest.click("link=��̳");
	    Thread.sleep(3000);
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread/11.html']");
	    webtest.click("xpath=//a[@href='/chanzhieps/www/index.php/thread-edit-11.html']");
	    webtest.click("name=readonly");
	    webtest.click("name=discussion");
	    webtest.click("id=submit");
	}
	
}
