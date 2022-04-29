package stepDefinations;

import org.junit.Assert;

import Core.baseSetUp;
import cucumber.api.java.en.Then;
import pagesSwiggy.deleteItem;

public class deleteItemStepDefination extends baseSetUp {

	deleteItem di;

	public deleteItemStepDefination() {
		this.di = new deleteItem();
	}

	@Then("^Delete Item and Verify card section$")
	public void delete_item_and_verify_card_section() throws Throwable {
		di.deleteItemFromList();
		String getExpCard = returnDataFromFile("expCard", "\\Data\\expected.properties");
		Assert.assertEquals(di.isCardSectionDisplay(), getExpCard);
	}

}
