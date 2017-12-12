package kuangjia_qiantai_test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebDriverEngine;

import dataprovider.NSDataProvider2;
import kuangjia_chanzhi.Login_Action;
import kuangjia_qiantai_action.luntan;

public class luntanTest extends BaseTest{
	
	luntan ll = null;
	Login_Action action = null;
	
	@BeforeClass
	public void setup(){
		action = new Login_Action(webtest);
		ll = new luntan(webtest);
	}
	
	//前台论坛超链接的点击
	@Test
	public void testdianji() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.dianji();
//		check.verifyHtmlSource("最新帖子");
//		webtest.getHtmlSource().contains("最新帖子");
		assertTrue(webtest.getHtmlSource().contains("最新帖子"));
	}
	
	//前台论坛回帖内容不为空的校验
	@Test
	public void testdianji_ht() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.dianji_ht();
		assertTrue(webtest.getHtmlSource().contains("测试"));
	}
	
	//用数据驱动的方法完成前台论坛回帖的校验
	@Test(dataProvider="huitie",dataProviderClass=NSDataProvider2.class)
	public void testdianji_ht_sjqd(String a) throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.dianji_ht_sjqd(a);
		assertTrue(webtest.getHtmlSource().contains(a));
	}

	//前台论坛回帖内容为空的校验
	@Test
	public void testdianji_ht_k() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.dianji_ht_k();
		assertTrue(webtest.getHtmlSource().contains("不能为空"));
	}
	
	//前台论坛回帖内容为空的校验
	@Test
	public void testdianji_ll() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.dianji_ll();
	}
	
	//回帖页面编辑超链接点击的校验
	@Test
	public void testhuitie_bj() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.huitie_bj();
		assertTrue(webtest.getHtmlSource().contains("编辑主题"));
	}
	
	//修改标题文本框的校验
	@Test
	public void testhuitie_bt() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.huitie_bt();
		assertTrue(webtest.getHtmlSource().contains("王静楠"));
	}
	
	//跳转单选框的校验
	@Test
	public void testhuitie_tz() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.huitie_tz();
		assertTrue(webtest.getHtmlSource().contains("链接"));
	}
	
	//只读、讨论模式复选框的校验
	@Test
	public void testhuitie_zdtl() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.huitie_zdtl();
	}
	
	
}
