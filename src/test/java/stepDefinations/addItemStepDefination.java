package stepDefinations;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import pagesSwiggy.addItem;

public class addItemStepDefination {
	addItem ai;

	public addItemStepDefination() {
		this.ai = new addItem();
	}

	@Then("^Select item and Verify$")
	public void select_item_and_add() {
		String getResturantname = ai.getResturantName();
		ai.clickFirstResturant();
		Assert.assertEquals(getResturantname, ai.getRedirectResturantName());
	}

	@Then("^Add Item and Verify card section$")
	public void add_item_and_verify_card_section() throws Throwable {
		String getItemName = ai.getItemName();
		ai.clickAddButton();
		Assert.assertTrue(ai.isCardSectionDisplay());
		Assert.assertEquals(getItemName, ai.getCardItemName());
	}

}
