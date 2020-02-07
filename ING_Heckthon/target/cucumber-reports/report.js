$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/hcl/demo/features/UIAutomationWithDatatables.feature");
formatter.feature({
  "line": 2,
  "name": "VerifyTheSavingsAcceslatoryForm",
  "description": "I want to use this template for my feature file",
  "id": "verifythesavingsacceslatoryform",
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
  "name": "AccountOpen",
  "description": "",
  "id": "verifythesavingsacceslatoryform;accountopen",
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
  "line": 9,
  "name": "I complete the account creation form with below details",
  "rows": [
    {
      "cells": [
        "Nationality",
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
      "line": 10
    },
    {
      "cells": [
        "India",
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
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Submit and validate the details",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionWithDataTable.i_want_to_Open_the_Chrome_Brow_and_invoke_the_URL()"
});
formatter.result({
  "duration": 38885785303,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionWithDataTable.i_complete_the_account_open_Form_details(DataTable)"
});
formatter.result({
  "duration": 7598529248,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionWithDataTable.submit_and_validate_the_details()"
});
formatter.result({
  "duration": 933558296,
  "status": "passed"
});
});