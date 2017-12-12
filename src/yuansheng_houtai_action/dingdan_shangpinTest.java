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
		//商城、订单、待收货超链接点击的校验
		public void testdaish() throws InterruptedException{
			login("admin","admin");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'订单')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'待收货')]")).click();
			assertTrue(driver.getPageSource().contains("退款"));
		}
		@Test
		//详情超链接的点击的校验
		public void testxiangq() throws InterruptedException{
			login("admin","admin");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'订单')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=order&f=view&orderID=2&btnLink=false']")).click();
			Thread.sleep(2000);
			assertTrue(driver.getPageSource().contains("商品信息"));
		}
		@Test
		//删除超链接的点击的校验
		public void testshanc() throws InterruptedException{
			login("admin","admin");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'订单')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("删除")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
			assertTrue(driver.getPageSource().contains("2"));
		}
		@Test
		//改价超链接点击后弹出文本框的校验
		public void testgaij() throws InterruptedException{
			login("admin","admin");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'订单')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("改价")).click();
			Thread.sleep(2000);
			assertTrue(driver.getPageSource().contains("价格"));
		}
		@Test
		//改价超链接点击后文本框输入的校验
		public void testgaijs() throws InterruptedException{
			login("admin","admin");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'订单')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("改价")).click();
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
			assertTrue(driver.getPageSource().contains("改价"));
		}
		@Test
		//商城、订单、待发货超链接点击的校验
		public void testdaif() throws InterruptedException{
			login("admin","admin");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'订单')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'待发货')]")).click();
			assertTrue(driver.getPageSource().contains("类型"));
		}
}
