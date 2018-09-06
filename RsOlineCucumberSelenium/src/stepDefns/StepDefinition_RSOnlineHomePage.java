package stepDefns;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumCodePages.Page_RSOHomePage;

public class StepDefinition_RSOnlineHomePage {
	
	Page_RSOHomePage  rsoHomePage = new Page_RSOHomePage();
	
	@Given("^I launch the Chrome browser$")
	public void i_launch_the_Chrome_browser() throws Exception {
		rsoHomePage.launchChromeBrowser();
	    
	}

	@When("^I open RS-Online hompage$")
	public void i_open_RS_Online_hompage() throws Exception {
		rsoHomePage.RSonlineURL();
	    
	}

	@Then("^I verify that the page displays the Login and Register options$")
	public void i_verify_that_the_page_displays_the_Login_and_Register_options() throws Exception {
		rsoHomePage.loginRegisterButtonsAreDisplayed();
	    
	}

	@Then("^I navigate to the AirDrills page$")
	public void i_navigate_to_the_AirDrills_page() throws Exception {
		rsoHomePage.airdrillsNavigation();
	   
	}

	@Then("^I choose the item to purchase$")
	public void i_choose_the_item_to_purchase() throws Exception {
		rsoHomePage.choosePurchaseItem();
	   
	}

	@Then("^I navigate to the purchase basket page$")
	public void i_navigate_to_the_purchase_basket_page() throws Exception {
		rsoHomePage.navigateToPurchaseBasketPage();
	   
	}

	@Then("^I verify the basket page displays the correct delivery method$")
	public void i_verify_the_basket_page_displays_the_correct_delivery_method() throws Exception {
		rsoHomePage.correctDeliveryMethod();
	   
	}

	@Then("^I verify the basket page displays the correct item to be purchased$")
	public void i_verify_the_basket_page_displays_the_correct_item_to_be_purchased() throws Exception {
	    rsoHomePage.correctItemToPurchase();
	    
	}

	@Then("^I verify the basket page displays the correct purchase total for the item to be purchased$")
	public void i_verify_the_basket_page_displays_the_correct_purchase_total_for_the_item_to_be_purchased() throws Exception {
		rsoHomePage.purchaseTotalCorrect();
	   
	    
	}

	@Then("^I login with the credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_login_with_the_credentials_and(String username, String password) throws Exception {
		rsoHomePage.loginRSonlineHomePage(username, password);
	   
	}

	@Then("^I update the purchase quantity$")
	public void i_update_the_purchase_quantity() throws Exception {
		rsoHomePage.updatePurchaseQuantity();
	  
	}


}
