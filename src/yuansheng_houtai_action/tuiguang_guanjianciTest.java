package yuansheng_houtai_action;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import dataprovider.NSDataProvider1;
import yuansheng_chanzhi.BaseTesth;

public class tuiguang_guanjianciTest extends BaseTesth{

	    //�ƹ�-�ؼ���-�༭���ӵ���������
		@Test
		public void login1() throws InterruptedException{
			login("admin","admin");
		}
		@Test(dataProvider="lianjie",dataProviderClass=NSDataProvider1.class,dependsOnMethods="login1")
		public void tianjia(String lianjie) throws InterruptedException{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(.,'�ƹ�')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'�ؼ���')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=tag&f=link&id=2']")).click();
			Thread.sleep(3000);
			WebElement link1 = driver.findElement(By.xpath("//input[@name='link']"));
		    Thread.sleep(3000);
		    link1.click();
		    Thread.sleep(3000);
		    for(int i=0;i<22;i++){
		    	link1.sendKeys(Keys.BACK_SPACE);
		    }
		    link1.sendKeys(lianjie);
		    Thread.sleep(9000);
		    driver.findElement(By.xpath("//input[@value='����']")).click();
		    Thread.sleep(4000);
		}
		//�ƹ㡢�ؼ��ʵ����У��
		@Test
		public void dianji() throws InterruptedException{
			login("admin","admin");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(.,'�ƹ�')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'�ؼ���')]")).click();
			Thread.sleep(2000);
			assertTrue(driver.getPageSource().contains("Ȩ��"));
		}
}
