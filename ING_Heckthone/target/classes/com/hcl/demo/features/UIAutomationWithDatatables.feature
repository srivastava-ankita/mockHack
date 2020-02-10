@UITest
Feature: SavingsAcceleratorForm
  I want to use this template for my feature file

  @UITest
  Scenario: NewUserRegistration
    Given I Open the ChromeBrowser and invoke the URL
    When I complete the account creation form with below details and click on continue button
      | Nationality |Title| GivenName | MiddleName | FamilyName | DateOfBirth | PlaceOfBirth | CountryOfBirth | EmailAddress   | Mobile     | EnterAddress | MaidenName |
      | India       | Mr  | INDIA1    | INDIA2     | INDIA3     | 11/12/2008  | BANGALORE    | INDIA          | abc123@abc.com | 0412234567 | 65 MARTIN    | AMMA       |
    Then Verify Successful Navigation to next page

  @UITestVerificationAtNationalityInvalidCountry
  Scenario: VerifyErrorMessageInSAFForNationalityInvalidCountryName
    Given I Open the ChromeBrowser and invoke the URL
    When I complete the account creation form with below details and click on continue button
     | Nationality |Title| GivenName | MiddleName | FamilyName | DateOfBirth | PlaceOfBirth | CountryOfBirth | EmailAddress   | Mobile     | EnterAddress | MaidenName |
     | qw          | Mr  | INDIA1    | INDIA2     | INDIA3     | 11/12/2008  | BANGALORE    | INDIA          | abc123@abc.com | 0412234567 | 65 MARTIN    | AMMA       | 
   Then Verify unsuccessful navigation
  #@UITestVerificationAtNationalityBlankCountry
  #Scenario: VerifyErrorMessageInSAF
    #Given I Open the ChromeBrowser and invoke the URL
    #When I complete the account creation form with below details and click on continue button
      #| Nationality |Title| GivenName | MiddleName | FamilyName | DateOfBirth | PlaceOfBirth | CountryOfBirth | EmailAddress   | Mobile     | EnterAddress | MaidenName |
      #|             | Mr  | INDIA1    | INDIA2     | INDIA3     | 11/12/2008  | BANGALORE    | INDIA          | abc123@abc.com | 0412234567 | 65 MARTIN    | AMMA       |
    #Then Verify unsuccessful navigation
