package utils;

import org.testng.ITestContext;
import org.testng.TestListenerAdapter;

public class listener extends TestListenerAdapter{
	
	public void onFinish (ITestContext content){
		fujianmail m = new fujianmail();
		m.sendMailAttached();
		System.out.println("����ִ����ϣ������ʼ�");
	}
}
