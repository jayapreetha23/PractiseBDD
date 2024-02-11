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
@tagSDLogin
Feature: SauceDemo Ecomm Website
  I want to use this template for my SauceDemo Ecomm Website

  @tagValidLogin @tagLogin
  Scenario Outline: Valid Login
    Given User is landed in Login Screen
    When User enters "<UN>" , "<PW>" and clicks on Login button
    Then User should be navigated to Product Listing Page

    Examples: 
      | UN            | PW           |
      | standard_user | secret_sauce |
      | error_user    | secret_sauce |
      | problem_user  | secret_sauce |

  @tagInvalidLogin @tagLogin
  Scenario Outline: InValid Login
    Given User is landed in Login Screen
    When User enters "<UN>" , "<PW>" and clicks on Login button
    Then Error message should be displayed

    Examples: 
      | UN              | PW           |
      | admin           | secret_sauce |
      | locked_out_user | password     |
      | problem_user    | secret_sauc  |

  @tagAddToCart
  Scenario Outline: Select a product and add to cart
    Given Login by entering "<UN>" and "<PW>"
    When User selects the product and add it to cart
    And User clicks on Cart link
    Then Product is added to Cart

    Examples: 
      | UN            | PW           |
      | standard_user | secret_sauce |

  @tagCheckout @flow
  Scenario Outline: Checkout page
    Given Login by entering "<UN>" and "<PW>"
    When User selects the product and add it to cart
    And User clicks on Cart link
    And User clicks on Checkout button
    And User enters "<FirstName>", "<LastName>" and "<PostalCode>"
    And User clicks on Continue button
    And User clicks on Finish button
    Then Order will be placed successfully

    Examples: 
      | UN            | PW           | FirstName | LastName | PostalCode |
      | standard_user | secret_sauce | Welcome   | Sauce    |     098765 |
