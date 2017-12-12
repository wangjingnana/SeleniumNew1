package yuansheng_houtai_action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import dataprovider.NSDataProvider;
import yuansheng_chanzhi.BaseTesth;

public class chanpin_tianjiaTest extends BaseTesth {

	//数据驱动
	@Test
	public void login1() throws InterruptedException{
		login("admin","admin");
	}
	@Test(dataProvider="add",dataProviderClass=NSDataProvider.class,dependsOnMethods="login1")
	public void tianjia(String mingcheng,String xiangqing) throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'产品')]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.className("chosen-choices")).click();
	    driver.findElement(By.className("active-result")).click();
	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys(mingcheng);
	    driver.switchTo().frame(1);
		Actions aa = new Actions(driver);
		for(int i=0;i<9;i++){
			aa.sendKeys(Keys.TAB);
		}
		aa.sendKeys(xiangqing).perform();
		driver.switchTo().defaultContent();
		Thread.sleep(7000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(7000);
		
	
	}
	
}
