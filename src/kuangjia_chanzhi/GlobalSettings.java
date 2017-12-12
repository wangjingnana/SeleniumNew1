package kuangjia_chanzhi;

import java.io.FileInputStream;
import java.util.Properties;

public class GlobalSettings {

	public static Properties prop = getProperties();
	
	public static String firefoxDriver=prop.getProperty("Firefox_Driver");
//	public static String firefoxPath=prop.getProperty("Firefox_Path");
	public static String timeout = prop.getProperty("Timeout");
	public static String url=prop.getProperty("baseUrl");
	public static String screenShotPath=prop.getProperty("screenShotPath");
	
//	public static int browserCoreType = Integer.parseInt(prop.getProperty("BrowserCoreType","2"));
//	public static String FirefoxDriverPath = prop.getProperty("FirefoxDriverPath","C:\\xuexi\\dasanshang\\Selenium\\ruanj\\geckodriver.exe");

	public static String getProperty(String property) {
		return prop.getProperty(property);
	}
	
	public static Properties getProperties() {
		Properties prop = new Properties();
		try {
			FileInputStream file = new FileInputStream("conf/prop.properties");
			prop.load(file);
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}
}
