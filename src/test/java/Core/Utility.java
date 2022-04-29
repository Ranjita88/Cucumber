package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Utility {

	public static WebDriver driver;
	public ExtentReports extent;
	public static ExtentTest scenarioDef;
	public static ExtentTest features;
	public static String reportLocation = "/Users/ajain/extent";

	public static void waitForElement(WebDriver driver, WebElement element) {
		new WebDriverWait(driver, 2000).until(ExpectedConditions.elementToBeClickable(element));
	}

}
