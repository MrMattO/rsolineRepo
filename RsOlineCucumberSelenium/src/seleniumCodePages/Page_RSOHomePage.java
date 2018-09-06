package seleniumCodePages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.RSOPage_BasePage;


public class Page_RSOHomePage extends RSOPage_BasePage {
	
	
// launching the browser and setting driver to Chrome
	public void launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C://Users//M//Selenium_drivers//chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	

// Opening the Rsonline webpage	
	public void RSonlineURL() {
		driver.get("https://uk.rs-online.com/web/");
		driver.manage().window().maximize();
		
	}

	
// Validate the Login and Register buttons are displayed on the opening page 
	public void loginRegisterButtonsAreDisplayed() {
		
	// For Login button	
		assertTrue(driver.findElement(By.xpath("//a[@title='Log In']")).isDisplayed());
		System.out.println("Login Button is displayed");
	
	// For Register button
		assertTrue(driver.findElement(By.xpath("//a[@title='Register']")).isDisplayed());
		System.out.println("Register button is displayed");
		
		System.out.println("** Home Page for RS-Online is displayed **");

	}
	
	
// Navigate to Airdrills webpage by selecting various choices	
	public void airdrillsNavigation() {

	// Select 'Tools and Storage' from Homepage		
		driver.findElement(By.xpath("//a[@title='Tools & Storage']")).click();	
				
	// Wait for the next page to load
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.findElement(By.xpath("//a[@title='Air Power Tools']")).click();	
				
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//a[@title='Air Drills']")).click();	
				
	}
	
	
// Choosing the item to purchase 
	public void choosePurchaseItem() {

	// Initialise Explicit wait time
		WebDriverWait wait = new WebDriverWait(driver, 10);	
				
	// Wait for the item page to load
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'RS Pro 10mm Angled Air Drill, 1/4in, 1700rpm (APT4')]")));
			
	// Add item to basket 'RS Pro 10mm Angled Air Drill, 1/4in, 1700rpm (APT402)'     ......alternative is to use parameters for different items	
		driver.findElement(By.cssSelector("#atbBtn-2")).click();
			
	}
	

// Navigate to the purchase basket page
	public void navigateToPurchaseBasketPage() {

	// Initialise Explicit wait time
		WebDriverWait wait = new WebDriverWait(driver, 10);	
		
	// Select the basket
		driver.findElement(By.cssSelector("#js-basketAmt")).click();	
					
	// Wait for the basket page to load where 'My Basket' will be displayed
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='pageTitleBlack']")));

	}
	
	
// Validate the correct delivery method is chosen
	public void correctDeliveryMethod() {

	// Check Next Working delivery is selected	
		assertTrue(driver.findElement(By.xpath("//input[@value='5']")).isSelected());
		System.out.println("Next Working delivery is selected");
			
	}
		
	
// Validate the correct item to be purchased is displayed on the Basket page
	public void correctItemToPurchase() {
		
	//get the item title and RS stock number
		String drillTitle = driver.findElement(By.xpath("//a[contains(text(),'RS Pro 10mm Angled Air Drill, 1/4in, 1700rpm (APT402')]")).getText();
		String drillRSCode = driver.findElement(By.xpath("//span[@class='textTitle']")).getText();
		
	// Check if previously selected item is displayed by checking title and stock number
		
		assertEquals("RS Pro 10mm Angled Air Drill, 1/4in, 1700rpm (APT402)", drillTitle);
		System.out.println("Correct Drill Name:  " + drillTitle);
		
		assertEquals("739-8405", drillRSCode);
		System.out.println("Correct Drill RS Code:  " + drillRSCode);
		
		System.out.println("** Drill Name & Drill RS Code are Correct **");
				
	}	
	
	
// Validate the correct total is displayed
	public void purchaseTotalCorrect() {
		
	//get the item purchase total
		String actualItemPurchaseTotal = driver.findElement(By.xpath("//div[@class='costColumn']")).getText();
		String expectedOverallPurchaseTotal = driver.findElement(By.xpath("//td[@class='orderValueCell']")).getText();
			
	// Check if the purchase total is correct			
		assertEquals(actualItemPurchaseTotal, expectedOverallPurchaseTotal);
		System.out.println("Correct Total for the ordered items");
					
	}	
	
	
// Update the quantity to be purchased
	public void updatePurchaseQuantity() {
			
	//Select the quantity box, clear old value and type in new value 
		driver.findElement(By.xpath("//input[@class=\"inputText costColumn floatLeft\"]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		driver.findElement(By.xpath("//input[@class=\"inputText costColumn floatLeft\"]")).sendKeys("3");
		
	//update the total for the item
		driver.findElement(By.xpath("//a[@class='link2']//span[contains(text(),'Update')]")).click();
							
	}	
	
	
// Login with correct username and password	
	public void loginRSonlineHomePage(String username, String password) throws InterruptedException {
		
	//Select Login button	
		driver.findElement(By.xpath("//a[@title='Log In']")).click();
		
	//Enter username and password details to login	
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='j_password']")).sendKeys(password); 
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	
	//Check for a successful login	
		try {
			driver.findElement(By.xpath("//div[@class='welcome']")).isDisplayed();
			System.out.println("Successful Login");
		}
		
		catch (Exception e) {
			System.out.println("Unsuccessful Login");
		}
			
	}
	

}
