$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/UIAutomation.feature");
formatter.feature({
  "line": 1,
  "name": "Verify the saving accelatery page",
  "description": "",
  "id": "verify-the-saving-accelatery-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Title of your scenario",
  "description": "",
  "id": "verify-the-saving-accelatery-page;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I want to open the browser and navigate to ING URL",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 5,
      "value": "#When Navigate to savings accelatory page"
    }
  ],
  "line": 6,
  "name": "Fill up the the details and contiue",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I validate the outcomes",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.i_want_to_open_the_browser_and_navigate_to_ING_URL()"
});
formatter.result({
  "duration": 49663570370,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.fill_up_the_the_details_and_contiue()"
});
formatter.result({
  "duration": 9173128855,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.i_validate_the_outcomes()"
});
formatter.result({
  "duration": 1198391728,
  "status": "passed"
});
});