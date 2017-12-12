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
	
	//ǰ̨���Գ����ӵĵ��
	@Test
	public void testdianji() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.dianji();
		assertTrue(webtest.getHtmlSource().contains("��������"));
	}
	
	//��������ҳ���ı��������У��
	@Test
	public void testshuru() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.dianji();
		ll.shuru();
		assertTrue(webtest.getHtmlSource().contains("����Ϊ��"));
	}
	
	//�����ı��������У��
	@Test
	public void testneirong() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.dianji();
		ll.neirong();
		Thread.sleep(5000);
		assertTrue(webtest.getHtmlSource().contains("aaaa"));
	}
	
	//�����ʼ����ѵ�ѡ���У��
	@Test
	public void testjieshou() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.dianji();
		ll.jieshou();
	}
	
	//������Ա�ɼ���ѡ���У��
	@Test
	public void testkejian() throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.dianji();
		ll.kejian();
	}
	
	//ʹ�����������ķ�ʽ��������
	@Test(dataProvider="liuyan",dataProviderClass=NSDataProvider4.class)
	public void testliuyan_sjqd(String a) throws Exception{
		action.LoginSucessq("admin", "admin");
		ll.dianji();
		ll.liuyan_sjqd(a);
	}
	
}
