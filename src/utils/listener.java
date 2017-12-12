package utils;

import org.testng.ITestContext;
import org.testng.TestListenerAdapter;

public class listener extends TestListenerAdapter{
	
	public void onFinish (ITestContext content){
		fujianmail m = new fujianmail();
		m.sendMailAttached();
		System.out.println("用例执行完毕，发送邮件");
	}
}
