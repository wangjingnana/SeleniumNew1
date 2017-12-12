package kuangjia_qiantai_action;

import static org.testng.Assert.assertTrue;

import com.webtest.core.WebDriverEngine;

public class liuyan {

	WebDriverEngine webtest = null;
	public liuyan(WebDriverEngine webtest){
		this.webtest = webtest;
	}
	
	//前台留言超链接的点击
	public void dianji() throws InterruptedException{
		webtest.click("link=留言");
	}
	
	//发表留言页面文本框输入的校验
	public void shuru(){
		webtest.type("id=phone","18713923868");
		webtest.type("id=mobile","18713923868");
		webtest.type("id=qq","1");
		webtest.type("id=email","727366326@qq.com");
		webtest.click("id=submit");
	}
	
	//内容文本域输入的校验
	public void neirong(){
		webtest.type("id=phone","18713923868");
		webtest.type("id=mobile","18713923868");
		webtest.type("id=qq","1");
		webtest.type("id=email","727366326@qq.com");
		webtest.type("id=content","aaaa");
		webtest.click("id=submit");
	}
	
	//接收邮件提醒单选框的校验
	public void jieshou(){
		webtest.click("name=receiveEmail");
	}
	
	//仅管理员可见单选框的校验
	public void kejian(){
		webtest.click("name=secret");
	}
	
	//使用数据驱动的方式发表留言
	public void liuyan_sjqd(String a){
		webtest.type("id=content",a);
		webtest.click("id=submit");
	}
	
}
