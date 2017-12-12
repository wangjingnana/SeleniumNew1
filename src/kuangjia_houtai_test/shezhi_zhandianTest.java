package kuangjia_houtai_test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import kuangjia_chanzhi.Login_Action;
import kuangjia_houtai_action.shezhi_zhandian;
import kuangjia_qiantai_action.liuyan;

public class shezhi_zhandianTest extends BaseTest{

	shezhi_zhandian sz = null;
	Login_Action action = null;
	
	@BeforeClass
	public void setup(){
		action = new Login_Action(webtest);
		sz = new shezhi_zhandian(webtest);
	}
	
	//后台设置-备份还原的点击
	@Test
	public void testdianji() throws Exception{
		action.LoginSucessh("admin", "admin");
		sz.dianji();
		assertTrue(webtest.getHtmlSource().contains("备份历史"));
	}
	
	//备份按钮点击的校验
	@Test
	public void testbeifen() throws Exception{
		action.LoginSucessh("admin", "admin");
		sz.dianji();
		sz.beifen();
	}
	
	//备注超链接点击的校验
	@Test
	public void testbeizhu() throws Exception{
		action.LoginSucessh("admin", "admin");
		sz.dianji();
		sz.beizhu();
		assertTrue(webtest.getHtmlSource().contains("保存"));
	}
	
	//备注超链接点击后文本框输入的校验
	@Test
	public void testbeizhushuru() throws Exception{
		action.LoginSucessh("admin", "admin");
		sz.dianji();
		sz.beizhushuru();
		assertTrue(webtest.getHtmlSource().contains("历史"));
	}
	
	//修改超链接点击的校验
	@Test
	public void testxiugai() throws Exception{
		action.LoginSucessh("admin", "admin");
		sz.dianji();
		sz.xiugai();
		assertTrue(webtest.getHtmlSource().contains("修改保存时间"));
	}
	
	//修改超链接点击后文本框输入的校验
	@Test
	public void testxiugaishuru() throws Exception{
		action.LoginSucessh("admin", "admin");
		sz.dianji();
		sz.xiugaishuru();
		assertTrue(webtest.getHtmlSource().contains("10"));
	}
	
}
