Feature: RSOnline Purchase
This feature verifies the End to End purchase functionality of an item
 
Scenario: Check that an item can be purchased
Given I launch the Chrome browser
When I open RS-Online hompage
Then I verify that the page displays the Login and Register options
Then I navigate to the AirDrills page
Then I choose the item to purchase
Then I navigate to the purchase basket page 
And I verify the basket page displays the correct delivery method 
And I verify the basket page displays the correct item to be purchased
And I verify the basket page displays the correct purchase total for the item to be purchased

Scenario: Check that for a logged in user an item can be updated and purchased
Given I launch the Chrome browser
When I open RS-Online hompage
Then I verify that the page displays the Login and Register options
Then I login with the credentials "MattoTest" and "MattOTest"
Then I navigate to the AirDrills page
Then I choose the item to purchase
Then I navigate to the purchase basket page 
And I verify the basket page displays the correct delivery method 
And I verify the basket page displays the correct item to be purchased
Then I update the purchase quantity
And I verify the basket page displays the correct purchase total for the item to be purchased