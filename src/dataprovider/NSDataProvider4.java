package dataprovider;

import org.testng.annotations.DataProvider;

public class NSDataProvider4 {

	@DataProvider(name="liuyan")
	public Object[][] getData(){
		FileDataProvider fdp = new FileDataProvider();
		return fdp.getTestDataByTxt("data/liuyan.txt");
		
	}
}
