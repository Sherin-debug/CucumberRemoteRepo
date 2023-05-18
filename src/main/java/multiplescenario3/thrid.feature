Feature: petstore

Scenario: submit the follwoing order and validate whether submitted or not
Given Launch the Application

When I click Birds
And I clicked AV-CB-01
And I clicked EST-18
And I clicked Add to Cart
And I clicked Proceed to Checkout
And I clicked Continue 
And I clicked Confirm
Then I clicked Return to Main Menu