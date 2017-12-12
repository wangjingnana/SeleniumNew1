package yuansheng_houtai_action;

import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import yuansheng_chanzhi.BaseTesth;

public class chanpinTest extends BaseTesth{

	@Test
	//��¼�����̳ǣ���Ʒ��ά����Ŀ�����ز�Ʒ�б�
	public void testfanhui() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'��Ʒ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'ά����Ŀ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,' ���ز�Ʒ�б�')]")).click();
		assertTrue(driver.getPageSource().contains("ά����Ŀ"));
	}
	@Test
	//��Ʒ�б�ҳ����������У��
	public void testsousuo() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'��Ʒ')]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='searchWord']")).sendKeys("aaa");
	    driver.findElement(By.xpath("//input[@id='submit']")).click();
	    assertTrue(driver.getPageSource().contains("aaa"));
	}
	@Test
	//��Ӳ�Ʒ��У��
	public void testchanpin() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'��Ʒ')]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.className("chosen-choices")).click();
	    driver.findElement(By.className("active-result")).click();;
	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys("�����");
	    Thread.sleep(7000);
	    driver.findElement(By.xpath("//input[@id='submit']")).click();
	    Thread.sleep(5000);
	    assertTrue(driver.getPageSource().contains("����Ϊ��"));  
	}
	@Test
	//��Ʒ�б�ҳ��ı༭�����ӵ�У��
	public void testbianji() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'��Ʒ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=product&f=edit&productID=2']")).click();
	    assertTrue(driver.getPageSource().contains("�༭��Ʒ"));
	}
	@Test
	//��Ʒ�б�ҳ��ĸ��೬���ӵ�У��
	public void testgengduo() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'��Ʒ')]")).click();
		driver.findElement(By.linkText("����")).click();
	    assertTrue(driver.getPageSource().contains("ɾ��"));
	}
	@Test
	//��Ʒ�б�ҳ��ĸ��೬���ӵ�ɾ�������У��
	public void testgdshanc() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'��Ʒ')]")).click();
		driver.findElement(By.linkText("����")).click();
		driver.findElement(By.linkText("ɾ��")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	    assertTrue(driver.getPageSource().contains("ɾ��"));
	}
	@Test
	//��Ʒ�б�ҳ��Ĳ��ֳ����ӵ����У��
	public void testbuju() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'��Ʒ')]")).click();
		driver.findElement(By.linkText("����")).click();
		Thread.sleep(2000);
	    assertTrue(driver.getPageSource().contains("�ϲ�ͨ��"));
	}
	@Test
	//��Ʒ�б�ҳ��Ĳ��ֳ����ӵ��ϲ�ͨ�������У��
	public void testbuju_s() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'��Ʒ')]")).click();
		driver.findElement(By.linkText("����")).click();
		driver.findElement(By.linkText("�ϲ�ͨ��")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("blocks")).click();	
		Select s = new Select(driver.findElement(By.id("blocks")));
		Thread.sleep(2000);
		s.selectByValue("2");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
	    assertTrue(driver.getPageSource().contains("��Ʒ�б�"));
	}
	@Test
	//��Ʒ�б�ҳ��ĸ��������ӵ����У��
	public void testfujian() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'��Ʒ')]")).click();
		driver.findElement(By.linkText("����")).click();
		Thread.sleep(2000);
	    assertTrue(driver.getPageSource().contains("����ļ�"));
	}
	@Test
	//��Ʒ�б�ҳ���ͼƬ�����ӵ����У��
	public void testtupian() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'��Ʒ')]")).click();
		driver.findElement(By.linkText("ͼƬ")).click();
		Thread.sleep(2000);
	    assertTrue(driver.getPageSource().contains("ͼƬ�б�"));
	}
}
