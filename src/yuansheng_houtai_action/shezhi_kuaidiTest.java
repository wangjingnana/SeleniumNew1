package yuansheng_houtai_action;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import yuansheng_chanzhi.BaseTesth;


public class shezhi_kuaidiTest extends BaseTesth{
	@Test
	//����̳ǡ����á���ݣ���ݵ����
	public void kuaidi() throws InterruptedException{
		login("admin","admin");
		shezhi_kuaidi aa = new shezhi_kuaidi(driver);
		Thread.sleep(3000);
		aa.shangcheng.click();
		Thread.sleep(3000);
		aa.shezhi.click();
		aa.kuaidi.click();
		Thread.sleep(3000);
		aa.shuru();
		aa.submit.click();
		assertTrue(driver.getPageSource().contains("Բͨ"));
	}
	
}
