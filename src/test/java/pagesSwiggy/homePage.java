package pagesSwiggy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Core.baseSetUp;

public class homePage extends baseSetUp {

	public homePage() {
		PageFactory.initElements(driver, this);
	}

	public void enterDataInSearch(String res) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		txtSearch.sendKeys(res);
		ddFirstOptions.click();
	}

	public String getSelectedOption() {
		return optionSelected.getText().trim();
	}

	@FindBy(xpath = "//input[@id='location']")
	WebElement txtSearch;
	@FindBy(xpath = "//a[@class='_3iFC5']//span")
	WebElement btnSearch;
	@FindBy(xpath = "//div[@tabindex='2']")
	WebElement ddFirstOptions;
	@FindBy(xpath = "(//div[@class='BZR3j'])[1]")
	WebElement optionSelected;
}
