package kuangjia_qiantai_action;

import static org.testng.Assert.assertTrue;

import com.webtest.core.WebDriverEngine;

public class liuyan {

	WebDriverEngine webtest = null;
	public liuyan(WebDriverEngine webtest){
		this.webtest = webtest;
	}
	
	//ǰ̨���Գ����ӵĵ��
	public void dianji() throws InterruptedException{
		webtest.click("link=����");
	}
	
	//��������ҳ���ı��������У��
	public void shuru(){
		webtest.type("id=phone","18713923868");
		webtest.type("id=mobile","18713923868");
		webtest.type("id=qq","1");
		webtest.type("id=email","727366326@qq.com");
		webtest.click("id=submit");
	}
	
	//�����ı��������У��
	public void neirong(){
		webtest.type("id=phone","18713923868");
		webtest.type("id=mobile","18713923868");
		webtest.type("id=qq","1");
		webtest.type("id=email","727366326@qq.com");
		webtest.type("id=content","aaaa");
		webtest.click("id=submit");
	}
	
	//�����ʼ����ѵ�ѡ���У��
	public void jieshou(){
		webtest.click("name=receiveEmail");
	}
	
	//������Ա�ɼ���ѡ���У��
	public void kejian(){
		webtest.click("name=secret");
	}
	
	//ʹ�����������ķ�ʽ��������
	public void liuyan_sjqd(String a){
		webtest.type("id=content",a);
		webtest.click("id=submit");
	}
	
}
