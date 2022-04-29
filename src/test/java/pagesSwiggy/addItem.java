package pagesSwiggy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Core.baseSetUp;

public class addItem extends baseSetUp {

	public addItem() {
		PageFactory.initElements(driver, this);
	}

	public String getResturantName() {
		return itemFirstResturantName.getText().trim();
	}

	public void clickFirstResturant() {
		itemFirstResturant.click();
	}

	public String getRedirectResturantName() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return redirectResturantName.getText().trim();
	}

	public String getItemName() {
		return itemNameThatAdd.getText().trim();
	}

	public void clickAddButton() {
		driver.findElement(By.xpath("(//div[contains(@class,'_2wg_t')])[1]//div[@class='_1RPOp']")).click();
	}

	public boolean isCardSectionDisplay() {
		return cartSection.isDisplayed();
	}

	public String getCardItemName() {
		return lstCardItemName.getText().trim();
	}

	@FindBy(xpath = "(//div[@class='_1HEuF'])[2]")
	WebElement itemFirstResturant;
	@FindBy(xpath = "(//div[@class='_1HEuF'])[2]//div[@class='nA6kb']")
	WebElement itemFirstResturantName;
	@FindBy(xpath = "//div[contains(@class,'_8MlDE')]//h1")
	WebElement redirectResturantName;
	@FindBy(xpath = "(//div[contains(@class,'_2wg_t')])[1]//h3")
	WebElement itemNameThatAdd;
	@FindBy(xpath = "//div[@class='_1WKwn']")
	WebElement cartSection;
	@FindBy(xpath = "//div[@class='_2bXOy']//div[@class='_33KRy']")
	WebElement lstCardItemName;
	@FindBy(xpath = "(//div[contains(@class,'_2wg_t')])")
	List<WebElement> lstItems;
}
