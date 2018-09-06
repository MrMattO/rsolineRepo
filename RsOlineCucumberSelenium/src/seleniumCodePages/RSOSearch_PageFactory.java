package seleniumCodePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RSOSearch_PageFactory {

		WebDriver driver;
		
		public RSOSearch_PageFactory(WebDriver driver)
		{

		// use this so that you can use the same name for driver locally
			this.driver = driver;				
			PageFactory.initElements(driver, this);
		}
		
	// For RSO Stock Code 
		@FindBy(xpath="//input[@id='shoppingBasketForm:quickStockNo_0']")
		WebElement rsoCode;

	// For purchase quantity	
		@FindBy(xpath="//input[@id='shoppingBasketForm:quickQty_0']")
		WebElement quantity;
		
	// For pressing adding to order button	
		@FindBy(xpath="//span[@id='quickAddProductBtn']")
		WebElement addOrder;
		
		
		public WebElement RSOStockCode()
		{
			return rsoCode;
		}
		
		public WebElement Quantity()
		{
			return quantity;
		}
		
		public WebElement AddOrder()
		{
			return addOrder;
		}
		
		
}
	
	

