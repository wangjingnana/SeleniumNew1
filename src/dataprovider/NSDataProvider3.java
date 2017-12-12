package dataprovider;

import org.testng.annotations.DataProvider;

public class NSDataProvider3 {

	@DataProvider(name="neirong")
	public Object[][] getData(){
		FileDataProvider fdp = new FileDataProvider();
		return fdp.getTestDataByTxt("data/neirong.txt");
		
	}
}
