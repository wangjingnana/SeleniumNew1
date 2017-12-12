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
	
	//ǰ̨��̳�����ӵĵ��
	@Test
	public void testdianji() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.dianji();
//		check.verifyHtmlSource("��������");
//		webtest.getHtmlSource().contains("��������");
		assertTrue(webtest.getHtmlSource().contains("��������"));
	}
	
	//ǰ̨��̳�������ݲ�Ϊ�յ�У��
	@Test
	public void testdianji_ht() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.dianji_ht();
		assertTrue(webtest.getHtmlSource().contains("����"));
	}
	
	//�����������ķ������ǰ̨��̳������У��
	@Test(dataProvider="huitie",dataProviderClass=NSDataProvider2.class)
	public void testdianji_ht_sjqd(String a) throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.dianji_ht_sjqd(a);
		assertTrue(webtest.getHtmlSource().contains(a));
	}

	//ǰ̨��̳��������Ϊ�յ�У��
	@Test
	public void testdianji_ht_k() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.dianji_ht_k();
		assertTrue(webtest.getHtmlSource().contains("����Ϊ��"));
	}
	
	//ǰ̨��̳��������Ϊ�յ�У��
	@Test
	public void testdianji_ll() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.dianji_ll();
	}
	
	//����ҳ��༭�����ӵ����У��
	@Test
	public void testhuitie_bj() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.huitie_bj();
		assertTrue(webtest.getHtmlSource().contains("�༭����"));
	}
	
	//�޸ı����ı����У��
	@Test
	public void testhuitie_bt() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.huitie_bt();
		assertTrue(webtest.getHtmlSource().contains("�����"));
	}
	
	//��ת��ѡ���У��
	@Test
	public void testhuitie_tz() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.huitie_tz();
		assertTrue(webtest.getHtmlSource().contains("����"));
	}
	
	//ֻ��������ģʽ��ѡ���У��
	@Test
	public void testhuitie_zdtl() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.huitie_zdtl();
	}
	
	
}
