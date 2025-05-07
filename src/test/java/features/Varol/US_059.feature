Feature: US_059 View and manage ordered services for Providers
  # User story: As a registered user (provider), I want to be able to view and manage my ordered services

  Background: Login and click Profile icon
    Given the user navigates to the "url" address
    When the user logs in with username "providerMail" and password "providerPass"
    And the user clicks on the Profile icon
    Then the provider navigates to the Dashboard page

  Scenario: Booking List link is visible and clickable on the Dashboard page
    Given booking list button should be visible and clickable

  Scenario: Filtering options are visible and clickable on the Booking List page
    Given the provider navigates to the Booking List page
    Then filtering options are visible and clickable

  Scenario: Order request confirmation, order cancellation and chat with user are available
    Given the provider navigates to the Booking List page
    Then the provider completes the service through Complete Request to user
    Then the provider completes the service through Cancel the Service
    And the provider chats with the user through Chat

  Scenario: Booking List page displays Booking date, User, Location and Staffs information
    Given the provider navigates to the Booking List page
    Then booking date, User, Location and Staffs information should be displayed

