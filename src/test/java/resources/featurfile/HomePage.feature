Feature:AO Functional Testing
  In Order to check Search Functionality Is Working

  I as a user want to check login functionality for invalid username and password

  @smoke
  Scenario: Customer can navigate to home page Of Give URL
    When I enter url
    Then I redirected to HomePage

    @smoke
    Scenario:  Customer can search for required product Successfully
      Given I am  on homepage
      When I Enter "Washing machines" in search input field
      Then I redirected to washingMachine Page

      @smoke
      Scenario: Customer can select Brand and navigate to listerPage Successfully
        Given I am on home page
        When I Enter "Washing machines" in search input field
        And I Select Brand Name BeKo
        Then I navigate to Target Page Successfully

  @smoke
  Scenario: Customer can select Brand and Filter products by choice successfully
    Given I am on home page
    When I Enter "Washing machines" in search input field
    And I Select Brand Name BeKo
    And I Select Energy Rating A++ or Above in ListerPage
    Then I can see List of given Energy Rating BeKo Products Successfully

  @smoke
  Scenario: Customer can select Brand and Filter products by Load successfully
    Given I am on home page
    When I Enter "Washing machines" in search input field
    And I Select Brand Name BeKo
    And I Select wash Load Large in ListerPage
    Then I can see List of given Wash Load BeKo Products Successfully

