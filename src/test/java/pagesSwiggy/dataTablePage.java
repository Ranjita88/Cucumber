package pagesSwiggy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Core.Utility;
import Core.baseSetUp;

public class dataTablePage extends baseSetUp {

	public dataTablePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickSignIn() {
		Utility.waitForElement(driver, lblSignIn);
		lblSignIn.click();
	}

	public void enterUserName(String un) {
		Utility.waitForElement(driver, txtUsername);
		txtUsername.sendKeys(un);
	}

	public void enterPassword(String pwd) {
		Utility.waitForElement(driver, txtPassword);
		txtPassword.sendKeys(pwd);
	}

	public void clickSubmit() {
		Utility.waitForElement(driver, btnSignIn);
		btnSignIn.click();
	}

	@FindBy(xpath = "//a[@class='login']")
	WebElement lblSignIn;
	@FindBy(xpath = "//input[@id='email']")
	WebElement txtUsername;
	@FindBy(xpath = "//input[@id='passwd']")
	WebElement txtPassword;
	@FindBy(xpath = "//button[@id='SubmitLogin']")
	WebElement btnSignIn;
}
