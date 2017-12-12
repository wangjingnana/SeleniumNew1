package dataprovider;

import org.testng.annotations.DataProvider;

public class NSDataProvider2 {

	@DataProvider(name="huitie")
	public Object[][] getData(){
		FileDataProvider fdp = new FileDataProvider();
		return fdp.getTestDataByTxt("data/huitie.txt");
		
	}
}
