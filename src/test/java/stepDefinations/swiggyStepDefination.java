package stepDefinations;

import org.junit.Assert;

import Core.baseSetUp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagesSwiggy.homePage;

public class swiggyStepDefination extends baseSetUp{
	homePage hp;

	public swiggyStepDefination() {
		this.hp = new homePage();
	}

	@Given("^Go to swiggy website$")
	public void go_to_swiggy_website() throws Exception {
		hp.redirectUrl("url");
		String getExpHeading = returnDataFromFile("swiggyHeading", "\\Data\\expected.properties");
		Assert.assertTrue(hp.getTitle().contains(getExpHeading));
	}

	@When("^Enter search sweets \"([^\"]*)\"$")
	public void enter_search_sweets(String cal) throws Throwable {
		hp.enterDataInSearch(cal);
	}

	@Then("^verify the results$")
	public void verify_the_results() throws Throwable {
		String getExpHeading = returnDataFromFile("result", "\\Data\\expected.properties");
		Assert.assertTrue(hp.getSelectedOption().contains(getExpHeading));
	}

}
