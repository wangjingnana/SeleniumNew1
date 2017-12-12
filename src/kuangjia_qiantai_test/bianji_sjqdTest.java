package kuangjia_qiantai_test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import dataprovider.NSDataProvider3;
import kuangjia_chanzhi.Login_Action;
import kuangjia_qiantai_action.bianji_sjqd;
import kuangjia_qiantai_action.luntan;

public class bianji_sjqdTest extends BaseTest{

	bianji_sjqd ll = null;
	Login_Action action = null;
	
	@BeforeClass
	public void setup(){
		action = new Login_Action(webtest);
		ll = new bianji_sjqd(webtest);
	}
	
	//编辑页面内容修改的数据驱动
	@Test(dataProvider="neirong",dataProviderClass=NSDataProvider3.class)
	public void testhuitie_bt(String a) throws Exception{
		Boolean flag = webtest.getHtmlSource().contains("退出");
		if(!(flag)){
			action.LoginSucessq("admin", "admin");
		}
		ll.neirong(a);
	}
}
