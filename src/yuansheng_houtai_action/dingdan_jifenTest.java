package yuansheng_houtai_action;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import yuansheng_chanzhi.BaseTesth;

public class dingdan_jifenTest extends BaseTesth{

	@Test
	//�̳ǡ����������ֳ����ӵ����У��
	public void jifen() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'����')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'����')]")).click();
		assertTrue(driver.getPageSource().contains("��Ʒ��Ϣ"));
	}
	@Test
	//�̳ǡ����������֡������������ӵ����У��
	public void daifahuo() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'����')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'����')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'������')]")).click();
		assertTrue(driver.getPageSource().contains("����"));
	}
}