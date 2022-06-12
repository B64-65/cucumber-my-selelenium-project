#What is a feature file?
#Feature file is used for creating test scenarios/test cases
#Gherkin language is used in a feature file
#All feature files must start with Feature keyword
#Each feature file can ONLY have 1 Feature keyword
Feature: First Feature File
#  Scenario = Test Case = Test Scenario
#  Each scenario has Gherkin keyword : Given, And, When, Then, But, *
#  Given -> should be used at eth beginning as preconditions
#  Then -> should be used for verification steps. Then steps are used to describe an expected outcome, or result.
#  When -> should be used in the middle steps. When steps are used to describe an event, or an action.
#  And -> should be used in the middle steps
#  I can use more than one Scenario: in a feature file
  Scenario: TC01_Google_Search
#  Each step must begin with a Gherkin keyword
    Given user is on the google page
    When user search for iPhone on google
    Then verify the page title contains iPhone
    And close the application

#  1. created a new step
#  2. Run to generate missing step definition




