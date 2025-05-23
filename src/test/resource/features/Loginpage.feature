Feature: Login Functionality for OpenCart E-commerce Website

  As a user of the OpenCart website
  I want to be able to log in with my account
  So that I can access my account-related features and manage my orders

  Background:
    Given I am on the OpenCart login page or create object

  Scenario: Successful login with valid credentials
  #Preconditions
    Given I have entered a valid username and password
  #Step Action
    When I click on the Submit button
  #Expected result
    Then I should be logged in successfully

    Given Logout done


#1) Feature file need to create >Created from Gherkin keywords (Define scenario and scenario outline)
#2) Step definition file >Java code and map with feature file (Example : Login.Feature file map with login step definition file)
#>Step definition file is .java file
#3) Test runner file use TestNG
