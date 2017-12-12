package kuangjia_qiantai_test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import dataprovider.NSDataProvider2;
import dataprovider.NSDataProvider4;
import kuangjia_chanzhi.Login_Action;
import kuangjia_qiantai_action.liuyan;



public class liuyanTest extends BaseTest{
	
	liuyan ll = null;
	Login_Action action = null;
	
	@BeforeClass
	public void setup(){
		action = new Login_Action(webtest);
		ll = new liuyan(webtest);
	}
	
	//前台留言超链接的点击
	@Test
	public void testdianji() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.dianji();
		assertTrue(webtest.getHtmlSource().contains("发表留言"));
	}
	
	//发表留言页面文本框输入的校验
	@Test
	public void testshuru() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.dianji();
		ll.shuru();
		assertTrue(webtest.getHtmlSource().contains("不能为空"));
	}
	
	//内容文本域输入的校验
	@Test
	public void testneirong() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.dianji();
		ll.neirong();
		Thread.sleep(5000);
		assertTrue(webtest.getHtmlSource().contains("aaaa"));
	}
	
	//接收邮件提醒单选框的校验
	@Test
	public void testjieshou() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.dianji();
		ll.jieshou();
	}
	
	//仅管理员可见单选框的校验
	@Test
	public void testkejian() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.dianji();
		ll.kejian();
	}
	
	//使用数据驱动的方式发表留言
	@Test(dataProvider="liuyan",dataProviderClass=NSDataProvider4.class)
	public void testliuyan_sjqd(String a) throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.dianji();
		ll.liuyan_sjqd(a);
	}
	
}
