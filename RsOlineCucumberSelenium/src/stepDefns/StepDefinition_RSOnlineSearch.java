package stepDefns;


import cucumber.api.java.en.Then;


import seleniumCodePages.Page_RSOSearchPage;

public class StepDefinition_RSOnlineSearch {
	
	Page_RSOSearchPage  rsoSearchPage = new Page_RSOSearchPage();
	
		
	@Then("^I verify that the page displays the main search box$")
	public void i_verify_that_the_page_displays_the_main_search_box() throws Exception {
		rsoSearchPage.searchBoxDisplayed();
	   
	}

	@Then("^I use item \"([^\"]*)\" to initiate a search$")
	public void i_use_item_to_initiate_a_search(String searchItem) throws Exception {
		rsoSearchPage.searchForItemHomePage(searchItem);
	    
	}

	@Then("^I verify the the correct results for \"([^\"]*)\" are displayed on the page$")
	public void i_verify_the_the_correct_results_for_are_displayed_on_the_page(String searchItem) throws Exception {
		rsoSearchPage.correctSearchItemsDisplayed(searchItem);
	    
	}
	   
	
	@Then("^I verify the the correct results for single item \"([^\"]*)\" are displayed on the page$")
	public void i_verify_the_the_correct_results_for_single_item_are_displayed_on_the_page(String searchItem) throws Exception {
		rsoSearchPage.correctSearchSingleItemDisplayed(searchItem);
	    
	}

	@Then("^I navigate to the purchase basket page from Home Page$")
	public void i_navigate_to_the_purchase_basket_page_from_Home_Page() throws Exception {
		rsoSearchPage.checkoutBasketNavigation();
	    
	}

	@Then("^I use the Quick Order to find an item entering stock code \"([^\"]*)\" and quantity \"([^\"]*)\"$")
	public void i_use_the_Quick_Order_to_find_an_item_entering_stock_code_and_quantity(String rsoCode, String quantity) throws Exception {
		rsoSearchPage.quickOrderSearch(rsoCode, quantity);
	    
	}

	@Then("^I verify the basket page displays the correct item to be purchased after Quick Order search$")
	public void i_verify_the_basket_page_displays_the_correct_item_to_be_purchased_after_Quick_Order_search() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	 
	}
	
	
}
