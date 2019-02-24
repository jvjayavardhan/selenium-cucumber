package stepDefinitions;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DemoPageObject;

public class DemoStepDefinition{
	DemoPageObject pageObject = new DemoPageObject();
	@Given("^user launches google URL in the browser$")
	public void user_launches_google_URL_in_the_browser() throws Throwable {
		DemoPageObject.launchURL("https://www.google.com");
	}

	@When("^the user search for the keyword \"([^\"]*)\"$")
	public void the_user_search_for_the_keyword(String arg1) throws Throwable {
		DemoPageObject.searchText(arg1);
	}

	@Then("^the google should return the page results for \"([^\"]*)\"$")
	public void the_google_should_return_the_page_results_for(String arg1) throws Throwable {
		assertEquals("Title text does not match",true,DemoPageObject.getTitle().contains(arg1));
	}
}