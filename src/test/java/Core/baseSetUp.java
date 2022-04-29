package Core;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import stepDefinations.Hooks;

public class baseSetUp {
	public static WebDriver driver;
	Utility util = new Utility();

	public baseSetUp() {
		this.driver = Hooks.driver;
	}

	public void redirectUrl(String urlName) throws Exception {
		String url = returnDataFromFile(urlName, "\\data.properties");
		driver.get(url);
		Thread.sleep(1000);
	}

	public String returnDataFromFile(String val, String path) throws Exception {
		FileInputStream fileInput = new FileInputStream(System.getProperty("user.dir") + path);
		Properties prop = new Properties();
		prop.load(fileInput);
		return prop.getProperty(val);
	}
	
	public String getTitle(){
		return driver.getTitle().trim();
	}

}
