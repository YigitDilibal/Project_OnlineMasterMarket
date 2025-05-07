Feature: US_058 View and manage discounted services for Providers
  # User story: As a registered user (provider), I want to be able to view and manage my discounted services

  Background: Login and click Profile icon
    Given the user navigates to the "url" address
    When the user logs in with username "providerMail" and password "providerPass"
    And the user clicks on the Profile icon
    Then the provider navigates to the Dashboard page

  Scenario: Service Offer History link is visible and clickable on the Dashboard page
    Given service offer history button should be visible and clickable

  Scenario: Service Offer History displays discounted service information and edit and delete actions are available
    Given the provider navigates to the Service Offer History page
    Then service name, amount, offer, start date, end date, time range, created date information are visible
    And the provider should be able to edit discount for a service
    And the provider should be able to delete a discounted service