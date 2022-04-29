package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Core.baseSetUp;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends baseSetUp {
	public static WebDriver driver;

	@Before
	public void selectBrowser() throws Exception {
		String aaa = returnDataFromFile("browser", "\\data.properties");
		if (aaa.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	@After
	public void quitDriver() {
		driver.quit();
	}
}
