

Feature: ChromeBrowser Launching
  

  @tag1
  Scenario: Open browser and launch new customerpage and enter the details 
    Given : Launch ChromeBrowser
    
   When  :Clicking the Savings Accelerator option
    
   
   Then : Enter the details and close the browser
  

  #Scenario Outline: Enter the details of the NewCustomer and submit
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step