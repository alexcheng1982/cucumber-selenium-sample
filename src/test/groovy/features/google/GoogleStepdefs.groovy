package features.google;

import geb.Browser;
import test.cucumber.BaseStepdefs;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class GoogleStepdefs extends BaseStepdefs {

	def Browser browser = new Browser();
	
	private String keyword;

	@Given('^I want to search some information using Google$')
	public void I_want_to_search_some_information_using_Google()
	throws Throwable {
		browser.to(GoogleHomePage.class)
		assertTrue browser.at(GoogleHomePage)
	}

	@When('^I input keyword \'(.*?)\'$')
	public void I_input_keyword_New_Zealand(String keyword) throws Throwable {
		this.keyword = keyword;
		browser.search.field.value(keyword)
		browser.search.button.click()
	}

	@Then('^Title of the first search result page should contain the search key word$')
	public void Title_of_the_first_search_result_page_should_contain_the_search_key_word()
	throws Throwable {
		browser.waitFor 30, { browser.at GoogleResultsPage }
		assertTrue browser.firstResultLink.text().indexOf(keyword) != -1
	}
}
