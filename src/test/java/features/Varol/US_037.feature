Feature: US_037 Manage My Services page for Providers
  # User story: As a registered user, I want to have a page where I can manage my services

  Background: Login and click Profile icon
    Given the user navigates to the "url" address
    When the user logs in with username "providerMail" and password "providerPass"
    And the user clicks on the Profile icon
    Then the provider navigates to the Dashboard page

  Scenario: My Services link is visible and clickable on Dashboard page
    Given My services button should be visible and clickable