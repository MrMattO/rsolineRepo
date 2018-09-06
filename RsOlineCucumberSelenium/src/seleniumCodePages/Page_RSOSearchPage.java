package seleniumCodePages;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import common.RSOPage_BasePage;


public class Page_RSOSearchPage extends RSOPage_BasePage {
	
	RSOSearch_PageFactory rsoPF = new RSOSearch_PageFactory(driver);

// Validate the search box is displayed on the opening page 
	public void searchBoxDisplayed() {
			
		assertTrue(driver.findElement(By.cssSelector("#searchTerm")).isDisplayed());
		System.out.println("Search Box is displayed");
		
	}	
	
	
// Search for an item using Home Page search box
	public void searchForItemHomePage(String searchItem) {
		
	//Enter search item and initiate the search	
		driver.findElement(By.cssSelector("#searchTerm")).sendKeys(searchItem);
		driver.findElement(By.cssSelector("#btnSearch")).click();
		
	}	
	
	
// Validate the correct search results are displayed
	public void correctSearchItemsDisplayed(String searchItem) {
		
	// Get result title 
		String searchResultTitle = driver.findElement(By.xpath("//div[@class='search-matches']//h1")).getText();
	
	//Check the result title is correct	
		if (searchResultTitle.contains(searchItem) && searchResultTitle.contains("7"))
		{
			System.out.println("Search is for correct items: " + searchItem);
		}
		else
		{
			System.out.println("Search is for INCORRECT items");
		}
		
	}	
	
	
// Validate the correct single item search results are displayed
	public void correctSearchSingleItemDisplayed(String searchItem) {
			
	// Get result title and RSO Stock code	
		String searchResultTitleSingle = driver.findElement(By.xpath("//h1[@class='col-xs-12 main-page-header']")).getText();
		String searchResultRSOCodeSingle = driver.findElement(By.xpath("//span[@class='keyValue bold']")).getText();
	
	//Check the result title and RSO stock code is correct	
		if (searchResultTitleSingle.contains(searchItem) && searchResultRSOCodeSingle.contains("739-8405"))
		{
			System.out.println("Search is for correct single item: " + searchItem);
		}
		else
		{
			System.out.println("Search is for INCORRECT single item");
		}
			
	}	


// Navigate to Checkout basket webpage 	
	public void checkoutBasketNavigation() {

	// Select 'checkout basket icon' from Homepage		
		driver.findElement(By.xpath("//div[@class='shBasket js-basket']")).click();	
					
	// Wait for the checkout basket page to load
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
					
	}
		
	
// Perform 'Quick order' search with RSO Stock code and Quantity entered	
	public void quickOrderSearch(String rsoCode, String quantity)  {
		
	//check if 'Quick Order' expanded
		if (driver.findElement(By.xpath("//button[contains(text(),'Enter stock number')]")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[contains(text(),'Enter stock number')]")).click();
		}
				
	//Enter RSO Stock Code and Quantity 
//		driver.findElement(By.xpath("//input[@id='shoppingBasketForm:quickStockNo_0']")).sendKeys(rsoCode);
//		driver.findElement(By.xpath("//input[@id='shoppingBasketForm:quickQty_0']")).sendKeys(quantity); 
//		driver.findElement(By.xpath("//span[@id='quickAddProductBtn']")).click();
		
		rsoPF.RSOStockCode().sendKeys(rsoCode);
		rsoPF.Quantity().sendKeys(quantity);
		rsoPF.AddOrder().click();
	}
	

}
