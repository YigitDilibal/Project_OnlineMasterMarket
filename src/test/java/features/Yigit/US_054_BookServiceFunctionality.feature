Feature: US_054 Book Service functionality
  # As a registered user, I want to have an Appointment page where I can confirm my reservation for the service I want.

  Background: Login and book service
    Given the user navigates to the "url" address
    When the user logs in with username "yigitMail" and password "userPass"
    And the User clicks the Home Services button
    And the User clicks Deep Cleaning Service button
    Then the User clicks the Book Service button

  Scenario: Redirect to Appointment page on clicking Book Service
    Then the User should be redirected to the Appointment page

  Scenario: Confirm Booking and Cancel Booking buttons should be visible and active
    Given Confirm Booking button should be visible and active
    And Cancel booking button should be visible and active

  Scenario: Mandatory fields should not be left blank
    When the User tries to click the Confirm Booking button without selecting Staff, Date, or Time Slot
    Then the User should see validation messages for required fields

  Scenario: Booking should be confirmed when all required fields are filled
    Given the User selects a Staff from the list
    And the User selects a Date
    And the User selects a Time Slot
    And the User clicks the Confirm Booking button
    Then the User should see a confirmation message
    And the User's reservation should be saved