package yuansheng_houtai_action;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import yuansheng_chanzhi.BaseTesth;


public class shezhi_shezhiTest extends BaseTesth{
	//��¼�����̳ǡ�����
	
	@Test
	//����Ϸ��ĺ�����ID��������KEY��֧��������
	public void shezhiTestsuccess() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=product&f=setting']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("pid")).sendKeys("2088111123453432");
		driver.findElement(By.id("key")).sendKeys("aaa111364h6jd8fkaaa111364h6jd8fk");
		driver.findElement(By.id("email")).sendKeys("727366326@qq.com");
		driver.findElement(By.id("submit")).click();
	}
	@Test
	//����Ƿ��ĺ�����ID,�Ϸ�������KEY��֧��������
	public void shezhiTestfail() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=product&f=setting']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("pid")).sendKeys("20881");
		driver.findElement(By.id("key")).sendKeys("aaa111364h6jd8fkaaa111364h6jd8fk");
		driver.findElement(By.id("email")).sendKeys("727366326@qq.com");
		driver.findElement(By.id("submit")).click();
		assertTrue(driver.getPageSource().contains("2088"));
	}
	@Test
	//�޸�ȷ���ջ�����Ϊ2��
	public void time() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=product&f=setting']")).click();
		Thread.sleep(3000);
		WebElement time = driver.findElement(By.id("confirmLimit"));
		if(time!=null){
			time.click();
			Actions action = new Actions(driver);
			action.sendKeys(Keys.BACK_SPACE);
			action.sendKeys("2").perform();
		}
		driver.findElement(By.id("submit")).click();
	}
	@Test
	//�޸Ļ���ΪŷԪ
	public void money() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=product&f=setting']")).click();
		Thread.sleep(3000);
		WebElement money = driver.findElement(By.className("chosen-single"));
		money.click();
		money.sendKeys("ŷԪ");
		Thread.sleep(3000);
		money.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id("submit")).click();
	}
	@Test
	//��濪����ť�����У��
	public void kucunopen() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=product&f=setting']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("stock2")).click();
		driver.findElement(By.id("submit")).click();
	}
	@Test
	//���رհ�ť�����У��
	public void kucunclose() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=product&f=setting']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("stock1")).click();
		driver.findElement(By.id("submit")).click();
	}
	@Test
	//���׷�ʽ��ѡ������У��
	public void method() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=product&f=setting']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("payment1")).click();
		driver.findElement(By.id("payment2")).click();
		driver.findElement(By.id("payment3")).click();
		driver.findElement(By.id("submit")).click();
	}
}
