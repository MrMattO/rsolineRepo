Feature: RSOnline Product Search
This feature verifies the search functionality for an item 
 
Scenario: Check that Home Page main search displays correct results for general search criteria
Given I launch the Chrome browser
When I open RS-Online hompage
Then I verify that the page displays the main search box
Then I use item "10 mm angled drill" to initiate a search
And I verify the the correct results for "10 mm angled drill" are displayed on the page 

Scenario: Check that Home Page main search displays correct results for specific search criteria
Given I launch the Chrome browser
When I open RS-Online hompage
Then I verify that the page displays the main search box
Then I use item "RS Pro 10mm Angled Air Drill, 1/4in, 1700rpm (APT402)" to initiate a search
And I verify the the correct results for single item "RS Pro 10mm Angled Air Drill, 1/4in, 1700rpm (APT402)" are displayed on the page 

Scenario: Check that on Checkout Page the 'Quick Order' search displays correct item
Given I launch the Chrome browser
When I open RS-Online hompage
Then I navigate to the purchase basket page from Home Page
Then I use the Quick Order to find an item entering stock code "874-1119" and quantity "2"
And I verify the basket page displays the correct item to be purchased after Quick Order search
And I verify the basket page displays the correct purchase total for the item to be purchased