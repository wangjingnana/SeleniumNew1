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
	//登录后点击商城，产品，维护类目，返回产品列表
	public void testfanhui() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'产品')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'维护类目')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,' 返回产品列表')]")).click();
		assertTrue(driver.getPageSource().contains("维护类目"));
	}
	@Test
	//产品列表页面的搜索框的校验
	public void testsousuo() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'产品')]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='searchWord']")).sendKeys("aaa");
	    driver.findElement(By.xpath("//input[@id='submit']")).click();
	    assertTrue(driver.getPageSource().contains("aaa"));
	}
	@Test
	//添加产品的校验
	public void testchanpin() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'产品')]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.className("chosen-choices")).click();
	    driver.findElement(By.className("active-result")).click();;
	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys("王静楠");
	    Thread.sleep(7000);
	    driver.findElement(By.xpath("//input[@id='submit']")).click();
	    Thread.sleep(5000);
	    assertTrue(driver.getPageSource().contains("不能为空"));  
	}
	@Test
	//产品列表页面的编辑超链接的校验
	public void testbianji() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'产品')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=product&f=edit&productID=2']")).click();
	    assertTrue(driver.getPageSource().contains("编辑产品"));
	}
	@Test
	//产品列表页面的更多超链接的校验
	public void testgengduo() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'产品')]")).click();
		driver.findElement(By.linkText("更多")).click();
	    assertTrue(driver.getPageSource().contains("删除"));
	}
	@Test
	//产品列表页面的更多超链接的删除点击的校验
	public void testgdshanc() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'产品')]")).click();
		driver.findElement(By.linkText("更多")).click();
		driver.findElement(By.linkText("删除")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	    assertTrue(driver.getPageSource().contains("删除"));
	}
	@Test
	//产品列表页面的布局超链接点击的校验
	public void testbuju() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'产品')]")).click();
		driver.findElement(By.linkText("布局")).click();
		Thread.sleep(2000);
	    assertTrue(driver.getPageSource().contains("上部通栏"));
	}
	@Test
	//产品列表页面的布局超链接的上部通栏点击的校验
	public void testbuju_s() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'产品')]")).click();
		driver.findElement(By.linkText("布局")).click();
		driver.findElement(By.linkText("上部通栏")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("blocks")).click();	
		Select s = new Select(driver.findElement(By.id("blocks")));
		Thread.sleep(2000);
		s.selectByValue("2");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
	    assertTrue(driver.getPageSource().contains("产品列表"));
	}
	@Test
	//产品列表页面的附件超链接点击的校验
	public void testfujian() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'产品')]")).click();
		driver.findElement(By.linkText("附件")).click();
		Thread.sleep(2000);
	    assertTrue(driver.getPageSource().contains("添加文件"));
	}
	@Test
	//产品列表页面的图片超链接点击的校验
	public void testtupian() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'产品')]")).click();
		driver.findElement(By.linkText("图片")).click();
		Thread.sleep(2000);
	    assertTrue(driver.getPageSource().contains("图片列表"));
	}
}
