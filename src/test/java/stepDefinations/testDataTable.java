package stepDefinations;

import java.util.List;

import org.junit.Assert;

import Core.baseSetUp;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagesSwiggy.dataTablePage;

public class testDataTable extends baseSetUp {
	dataTablePage dT;
	String expFile = "\\Data\\expected.properties";

	public testDataTable() {
		this.dT = new dataTablePage();
	}

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Exception {
		dT.redirectUrl("url2");
		Assert.assertTrue(dT.getTitle().contains(returnDataFromFile("homeTitle", expFile)));
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Exception {
		dT.clickSignIn();
		Assert.assertTrue(dT.getTitle().contains(returnDataFromFile("title", expFile)));
	}

	@When("^User enters Credentials to LogIn$")
	public void user_enters_Credentials_to_LogIn(DataTable dataTable) {
		List<List<String>> data = dataTable.raw();
		dT.enterUserName(data.get(0).get(0));
		dT.enterPassword(data.get(0).get(1));
		dT.clickSubmit();

	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Exception {
		Assert.assertTrue(dT.getTitle().contains(returnDataFromFile("sucessMessage", expFile)));
	}

}
