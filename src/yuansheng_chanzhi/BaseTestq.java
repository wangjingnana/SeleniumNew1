//package yuansheng_chanzhi;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.BeforeClass;
//
//public class BaseTestq {
//
//	public WebDriver driver = null;
//	@BeforeClass
//	public void setupBrowser() throws InterruptedException{
//		System.setProperty("webdriver.gecko.driver","C:\\xuexi\\dasanshang\\Selenium\\ruanj\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		driver.get("http://10.7.90.21:8032/chanzhieps/www/index.php/user-login.html");
//		Thread.sleep(3000);
//	}
//	public void login(String name,String password) throws InterruptedException{
////		driver.findElement(By.xpath("//input[@id='account']"));
//		driver.findElement(By.id("account")).sendKeys(name);
//		driver.findElement(By.id("password")).sendKeys(password);
//		driver.findElement(By.id("submit")).click();
//		Thread.sleep(3000);
//}
//}
