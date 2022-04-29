package pagesSwiggy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Core.baseSetUp;

public class deleteItem extends baseSetUp {

	public deleteItem() {
		PageFactory.initElements(driver, this);
	}

	public String isCardSectionDisplay() throws Exception {
		return cartSection.getText().trim();
	}

	public void deleteItemFromList() {
		itemDelete.click();
	}

	@FindBy(xpath = "//div[@class='_2bXOy']//div[@class='_29Y5Z']")
	WebElement itemDelete;
	@FindBy(xpath = "//div[@class='_1pKFz Tqef9']")
	WebElement cartSection;

}
