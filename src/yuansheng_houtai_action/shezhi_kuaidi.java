package yuansheng_houtai_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shezhi_kuaidi {
	
	public WebDriver _driver;
	
	@FindBy(xpath="//a[contains(.,'�̳�')]")
	public WebElement shangcheng;
	
	@FindBy(xpath="//a[@href='/chanzhieps/www/admin.php?m=product&f=setting']")
	public WebElement shezhi;
	
	@FindBy(xpath="//a[contains(.,'���')]")
	public WebElement kuaidi;
	
	@FindBy(xpath="//input[@id='submit']")
	public WebElement submit;
	
	@FindBy(xpath=("//input[@name='children[1]']"))
	public WebElement kuang1;

	@FindBy(xpath=("//input[@name='children[2]']"))
	public WebElement kuang2;
	
	@FindBy(xpath=("//input[@name='children[3]']"))
	public WebElement kuang3;
	
	public shezhi_kuaidi(WebDriver driver){
		this._driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void shuru(){
		kuang1.sendKeys("Բͨ");
		kuang2.sendKeys("��ͨ");
		kuang3.sendKeys("��ͨ");
	}

}
