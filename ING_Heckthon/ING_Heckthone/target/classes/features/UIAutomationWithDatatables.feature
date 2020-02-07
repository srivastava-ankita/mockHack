@UITest
Feature: VerifyTheSavingsAcceslatoryForm
  I want to use this template for my feature file

  @UITest
  Scenario: AccountOpen
    Given I want to Open the Chrome Brow and invoke the URL
    
    When I complete the account open Form details
    |Nationality|GivenName|MiddleName|FamilyName|DateOfBirth|PlaceOfBirth|CountryOfBirth|EmailAddress|Mobile|EnterAddress|MaidenName|tcn|
    |India			|INDIA1		|INDIA2		 |INDIA3		|11/12/2008	|BANGALORE	 |INDIA					|abc123@abc.com|0412234567|65 MARTIN|AMMA|OpenSavingAcc|
   
    Then Submit and validate the details
    