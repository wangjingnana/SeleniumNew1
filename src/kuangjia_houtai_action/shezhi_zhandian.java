package kuangjia_houtai_action;

import com.webtest.core.WebDriverEngine;

public class shezhi_zhandian{

	WebDriverEngine webtest = null;
	public shezhi_zhandian(WebDriverEngine webtest){
		this.webtest = webtest;
	}
	
	//��̨����-���ݻ�ԭ�ĵ��
	public void dianji() throws InterruptedException{
		webtest.click("xpath=//a[contains(.,'����')]");
		webtest.click("xpath=//a[contains(.,'���ݻ�ԭ')]");
	}
	
	//���ݰ�ť�����У��
	public void beifen() throws InterruptedException{
		webtest.click("xpath=//a[@class='btn btn-primary']");
		webtest.click("xpath=//button[@class='btn btn-primary']");
	}
	
	//��ע�����ӵ����У��
	public void beizhu() throws InterruptedException{
		webtest.click("class=noter");
	}
	
	//��ע�����ӵ�����ı��������У��
	public void beizhushuru() throws InterruptedException{
		webtest.click("class=noter");
		webtest.type("id=note", "��ʷ");
		webtest.click("id=submit");
	}

	//�޸ĳ����ӵ����У��
	public void xiugai() throws InterruptedException{
		webtest.click("xpath=//a[contains(@data-width,'400')]");
	}
	
	//�޸ĳ����ӵ�����ı��������У��
	public void xiugaishuru() throws InterruptedException{
		webtest.click("xpath=//a[contains(@data-width,'400')]");
		webtest.typeAndClear("id=holdDays", "10");
		webtest.click("id=submit");
	}
}
