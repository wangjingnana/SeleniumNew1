package yuansheng_houtai_action;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;

import yuansheng_chanzhi.BaseTesth;

public class dingdan_shangpinTest extends BaseTesth{

		@Test
		//�̳ǡ����������ջ������ӵ����У��
		public void testdaish() throws InterruptedException{
			login("admin","admin");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'����')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'���ջ�')]")).click();
			assertTrue(driver.getPageSource().contains("�˿�"));
		}
		@Test
		//���鳬���ӵĵ����У��
		public void testxiangq() throws InterruptedException{
			login("admin","admin");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'����')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=order&f=view&orderID=2&btnLink=false']")).click();
			Thread.sleep(2000);
			assertTrue(driver.getPageSource().contains("��Ʒ��Ϣ"));
		}
		@Test
		//ɾ�������ӵĵ����У��
		public void testshanc() throws InterruptedException{
			login("admin","admin");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'����')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("ɾ��")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
			assertTrue(driver.getPageSource().contains("2"));
		}
		@Test
		//�ļ۳����ӵ���󵯳��ı����У��
		public void testgaij() throws InterruptedException{
			login("admin","admin");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'����')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("�ļ�")).click();
			Thread.sleep(2000);
			assertTrue(driver.getPageSource().contains("�۸�"));
		}
		@Test
		//�ļ۳����ӵ�����ı��������У��
		public void testgaijs() throws InterruptedException{
			login("admin","admin");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'����')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("�ļ�")).click();
			Thread.sleep(2000);
			WebElement amount = driver.findElement(By.id("amount"));
			amount.click();
			amount.sendKeys(Keys.BACK_SPACE);
			amount.sendKeys(Keys.BACK_SPACE);
			amount.sendKeys(Keys.BACK_SPACE);
			amount.sendKeys(Keys.BACK_SPACE);
			amount.sendKeys("0.2");
			driver.findElement(By.id("submit")).click();
			Thread.sleep(2000);
			assertTrue(driver.getPageSource().contains("�ļ�"));
		}
		@Test
		//�̳ǡ������������������ӵ����У��
		public void testdaif() throws InterruptedException{
			login("admin","admin");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'����')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'������')]")).click();
			assertTrue(driver.getPageSource().contains("����"));
		}
}
