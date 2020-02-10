$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/hcl/demo/features/UIAutomationWithDatatables.feature");
formatter.feature({
  "line": 2,
  "name": "SavingsAcceleratorForm",
  "description": "I want to use this template for my feature file",
  "id": "savingsacceleratorform",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@UITest"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "NewUserRegistration",
  "description": "",
  "id": "savingsacceleratorform;newuserregistration",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@UITest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I Open the ChromeBrowser and invoke the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I complete the account creation form with below details and click on continue button",
  "rows": [
    {
      "cells": [
        "Nationality",
        "Title",
        "GivenName",
        "MiddleName",
        "FamilyName",
        "DateOfBirth",
        "PlaceOfBirth",
        "CountryOfBirth",
        "EmailAddress",
        "Mobile",
        "EnterAddress",
        "MaidenName"
      ],
      "line": 9
    },
    {
      "cells": [
        "India",
        "Mr",
        "INDIA1",
        "INDIA2",
        "INDIA3",
        "11/12/2008",
        "BANGALORE",
        "INDIA",
        "abc123@abc.com",
        "0412234567",
        "65 MARTIN",
        "AMMA"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Verify Successful Navigation to next page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionWithDataTable.i_want_to_Open_the_Chrome_Brow_and_invoke_the_URL()"
});
formatter.result({
  "duration": 46359175696,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionWithDataTable.i_complete_the_account_open_Form_details(DataTable)"
});
formatter.result({
  "duration": 9391369718,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionWithDataTable.verify_successful_navigation_to_next_page()"
});
formatter.result({
  "duration": 1315769800,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "VerifyErrorMessageInSAFForNationalityInvalidCountryName",
  "description": "",
  "id": "savingsacceleratorform;verifyerrormessageinsaffornationalityinvalidcountryname",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@UITestVerificationAtNationalityInvalidCountry"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I Open the ChromeBrowser and invoke the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I complete the account creation form with below details and click on continue button",
  "rows": [
    {
      "cells": [
        "Nationality",
        "Title",
        "GivenName",
        "MiddleName",
        "FamilyName",
        "DateOfBirth",
        "PlaceOfBirth",
        "CountryOfBirth",
        "EmailAddress",
        "Mobile",
        "EnterAddress",
        "MaidenName"
      ],
      "line": 17
    },
    {
      "cells": [
        "qw",
        "Mr",
        "INDIA1",
        "INDIA2",
        "INDIA3",
        "11/12/2008",
        "BANGALORE",
        "INDIA",
        "abc123@abc.com",
        "0412234567",
        "65 MARTIN",
        "AMMA"
      ],
      "line": 18
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Verify unsuccessful navigation",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionWithDataTable.i_want_to_Open_the_Chrome_Brow_and_invoke_the_URL()"
});
formatter.result({
  "duration": 49163413433,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionWithDataTable.i_complete_the_account_open_Form_details(DataTable)"
});
formatter.result({
  "duration": 9937552342,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionWithDataTable.verify_unsuccessful_navigation_to_next_page()"
});
formatter.result({
  "duration": 1432078180,
  "status": "passed"
});
});