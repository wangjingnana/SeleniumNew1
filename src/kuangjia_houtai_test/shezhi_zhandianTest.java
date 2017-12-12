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
	
	//��̨����-���ݻ�ԭ�ĵ��
	@Test
	public void testdianji() throws Exception{
		action.LoginSucessh("admin", "admin");
		sz.dianji();
		assertTrue(webtest.getHtmlSource().contains("������ʷ"));
	}
	
	//���ݰ�ť�����У��
	@Test
	public void testbeifen() throws Exception{
		action.LoginSucessh("admin", "admin");
		sz.dianji();
		sz.beifen();
	}
	
	//��ע�����ӵ����У��
	@Test
	public void testbeizhu() throws Exception{
		action.LoginSucessh("admin", "admin");
		sz.dianji();
		sz.beizhu();
		assertTrue(webtest.getHtmlSource().contains("����"));
	}
	
	//��ע�����ӵ�����ı��������У��
	@Test
	public void testbeizhushuru() throws Exception{
		action.LoginSucessh("admin", "admin");
		sz.dianji();
		sz.beizhushuru();
		assertTrue(webtest.getHtmlSource().contains("��ʷ"));
	}
	
	//�޸ĳ����ӵ����У��
	@Test
	public void testxiugai() throws Exception{
		action.LoginSucessh("admin", "admin");
		sz.dianji();
		sz.xiugai();
		assertTrue(webtest.getHtmlSource().contains("�޸ı���ʱ��"));
	}
	
	//�޸ĳ����ӵ�����ı��������У��
	@Test
	public void testxiugaishuru() throws Exception{
		action.LoginSucessh("admin", "admin");
		sz.dianji();
		sz.xiugaishuru();
		assertTrue(webtest.getHtmlSource().contains("10"));
	}
	
}
