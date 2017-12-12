package dataprovider;

import org.testng.annotations.DataProvider;

public class NSDataProvider1 {

	@DataProvider(name="lianjie")
	public Object[][] getData(){
		FileDataProvider fdp = new FileDataProvider();
		return fdp.getTestDataByTxt("data/lianjie.txt");
		
	}
}
