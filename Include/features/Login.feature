#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag
#Feature: Title of your feature
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
      
Feature: Login functionality
  As a user
  I want to be able to log into Bareksa
  
  #Background:
  #Given I open Bareksa
	
	@TC1
  Scenario Outline: Login with valid credentials
    Given I am on the login page
    When I enter a valid <username>
    And a valid <password>
    And I click the login button
    Then I should be logged in successfully

		Examples:
			| username 										| password |
			| delaapriliawibawa@gmail.com | Del13495 |
			
		
	@TC2
  Scenario Outline: Login with valid username and invalid password
    Given I am on the login page
    When I enter a valid <username> 
    And an invalid <password>
    And I click the login button
    Then I should see an error message
    
	
	@TC3
  Scenario Outline: Login with valid username and invalid password
    Given I am on the login page
    When I enter a invalid <username> 
    And an invalid <password>
    And I click the login button
    Then I should see an error message
	
	@TC4
  Scenario Outline: Login with blank email and password
    Given I am on the login page
    When I leave the <username> blank 
    And I leave the <password> blank
    And I click the login button
    Then I should see an error message

	@TC5
  Scenario Outline: Forgot password functionality
    Given I am on the login page
    When I click on the 'Lupa Password' (Forgot Password) link
    Then I should be redirected to the password recovery page

	@TC6
  Scenario Outline: Create account functionality
    Given I am on the login page
    When I click on the 'Buat Akun' (Create Account) link
    Then I should be redirected to the account registration page