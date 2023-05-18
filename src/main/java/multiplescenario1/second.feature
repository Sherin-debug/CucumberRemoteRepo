@login

Scenario Outline: Login Page with valid Credentials

 

Given Launch the application

When I click Enter the store

When I click on Sign In

When I entered the Username "<Username>"

And I entered the password "<Password>"

And I clicked on Login button

Then I verified that user got logged in successfully.

Then I close the application

Examples:

|Username|Password|

|weaver@123|123456789|

|whistler@123|j2ee|