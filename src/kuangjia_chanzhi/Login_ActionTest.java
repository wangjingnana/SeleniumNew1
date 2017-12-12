package kuangjia_chanzhi;

import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Login_ActionTest extends BaseTest{

		Login_Action action = null;
		
//		@BeforeSuite
//		public void addListener(ITestContext context)throws Exception {
//			TestRunner runner = (TestRunner) context;

//		    runner.addListener(new WebtestListener());
//		}
		
		@BeforeClass
		public void setup(){
			action = new Login_Action(webtest);
		}

		@Test
		public void testLogin_Actionh() throws InterruptedException{
			action.LoginSucessh("admin", "admin");
		}
		
		@Test
		public void testLogin_Actionq() throws InterruptedException{
			action.LoginSucessh("admin", "admin");
		}
}
