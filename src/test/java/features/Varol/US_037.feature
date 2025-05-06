Feature: US_037 Manage My Services page for Providers
  # User story: As a registered user, I want to have a page where I can manage my services

  Background: Login and click Profile icon
    Given the user navigates to the "url" address
    When the user logs in with username "providerMail" and password "providerPass"
    And the user clicks on the Profile icon
    Then the provider navigates to the Dashboard page

  Scenario: "My Services" link is visible and clickable on the Dashboard page
    Given My services button should be visible and clickable

  Scenario: "Active Services" and "Inactive Services" buttons are visible and clickable on My Services page
    Given the provider navigates to the My Services page
    Then the "Active Services" button is visible and clickable
    And the "Inactive Services" button is visible and clickable

  Scenario: Active services should be visible and editable
    Given the provider navigates to the My Services page
    Then the list of active services should be displayed
    When the provider selects a service
    Then the selected service should be editable
    And the provider should be able to change the status to active or inactive
    And the provider should be able to create a discount for the service

  Scenario: Service details should be displayed for the selected service
    Given the provider navigates to the My Services page
    Given the provider selects a service
    Then the service detail is visible
    And the edit service button is visible
    And the price information is visible
    And the service provider name is visible
    And the service availability is visible
    And the additional services section is visible
    And the reviews section is visible
    And the service gallery is visible
    Then the related services section is visible