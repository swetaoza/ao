$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurfile/HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "AO Functional Testing",
  "description": "In Order to check Search Functionality Is Working\r\n\r\nI as a user want to check login functionality for invalid username and password",
  "id": "ao-functional-testing",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7146067400,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Customer can navigate to home page Of Give URL",
  "description": "",
  "id": "ao-functional-testing;customer-can-navigate-to-home-page-of-give-url",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I enter url",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I redirected to HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iEnterUrl()"
});
formatter.result({
  "duration": 229109200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iRedirectedToHomePage()"
});
formatter.result({
  "duration": 62300,
  "status": "passed"
});
formatter.after({
  "duration": 817144300,
  "status": "passed"
});
formatter.before({
  "duration": 6297592900,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Customer can search for required product Successfully",
  "description": "",
  "id": "ao-functional-testing;customer-can-search-for-required-product-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I am  on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I Enter \"Washing machines\" in search input field",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I redirected to washingMachine Page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 174900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Washing machines",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.iEnterInSearchInputField(String)"
});
formatter.result({
  "duration": 4070389700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iRedirectedToWashingMachinePage()"
});
formatter.result({
  "duration": 102750900,
  "status": "passed"
});
formatter.after({
  "duration": 817539900,
  "status": "passed"
});
formatter.before({
  "duration": 6267433200,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Customer can select Brand and navigate to listerPage Successfully",
  "description": "",
  "id": "ao-functional-testing;customer-can-select-brand-and-navigate-to-listerpage-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I Enter \"Washing machines\" in search input field",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I Select Brand Name BeKo",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I navigate to Target Page Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 31700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Washing machines",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.iEnterInSearchInputField(String)"
});
formatter.result({
  "duration": 3033058300,
  "status": "passed"
});
formatter.match({
  "location": "MyBrandStepdefs.iSelectBrandNameBeKo()"
});
formatter.result({
  "duration": 3875409300,
  "status": "passed"
});
formatter.match({
  "location": "MyBrandStepdefs.iNavigateToTargetPageSuccessfully()"
});
formatter.result({
  "duration": 1112504000,
  "status": "passed"
});
formatter.after({
  "duration": 801095000,
  "status": "passed"
});
formatter.before({
  "duration": 5796195600,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Customer can select Brand and Filter products by choice successfully",
  "description": "",
  "id": "ao-functional-testing;customer-can-select-brand-and-filter-products-by-choice-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I Enter \"Washing machines\" in search input field",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I Select Brand Name BeKo",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I Select Energy Rating A++ or Above in ListerPage",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I can see List of given Energy Rating BeKo Products Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 55900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Washing machines",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.iEnterInSearchInputField(String)"
});
formatter.result({
  "duration": 3031836600,
  "status": "passed"
});
formatter.match({
  "location": "MyBrandStepdefs.iSelectBrandNameBeKo()"
});
formatter.result({
  "duration": 3675214800,
  "status": "passed"
});
formatter.match({
  "location": "MyEnergyRatingStepdefs.iSelectEnergyRatingAOrAboveInListerPage()"
});
formatter.result({
  "duration": 8518384600,
  "status": "passed"
});
formatter.match({
  "location": "MyEnergyRatingStepdefs.iCanSeeListOfGivenEnergyRatingBeKoProductsSuccessfully()"
});
formatter.result({
  "duration": 2291312900,
  "status": "passed"
});
formatter.after({
  "duration": 740385700,
  "status": "passed"
});
});