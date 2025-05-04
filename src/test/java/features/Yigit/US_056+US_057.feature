Feature: Service Booking and Payment Flow
  # As a registered user, I want to have a check page before I pay for the services I have booked.
  # As a registered user (User), I want to have a payment page where I can make the payment of my service reservations that I control.

  Background: Login and book service
    Given the user navigates to the "url" address
    When the user logs in with username "yigitMail" and password "userPass"
    And the User clicks the Home Services button
    And the User clicks Deep Cleaning Service button
    Then the User clicks the Book Service button
    Given the User selects a Staff from the list



  Scenario: User should access the checkout page and view selected services and prices
    And the User selects "29-05-2025" as Date
    And the User selects Time Slot as "07:00 AM-07:50 AM"
    And the User clicks the Confirm Booking button
    Then the User should see a confirmation message
    And the User's reservation should be saved
    Then The user is redirected to the Checkout page
    Then The checkout page should be displayed successfully
    And The reserved service name and price should be clearly visible

  Scenario: User must select a payment type and be able to open the service booking modal
    And the User selects "29-05-2025" as Date
    And the User selects Time Slot as "08:40 AM-09:30 AM"
    And the User clicks the Confirm Booking button
    Then the User should see a confirmation message
    And the User's reservation should be saved
    Then The user is redirected to the Checkout page
    Then The system should prompt the user to select a payment type
    When The user clicks the Stripe option
    Then The Service Booking window should open

  Scenario: User completes payment with valid card details and sees success confirmation
    And the User selects "29-05-2025" as Date
    And the User selects Time Slot as "10:20 AM-11:10 AM"
    And the User clicks the Confirm Booking button
    Then the User should see a confirmation message
    And the User's reservation should be saved
    Then The user is redirected to the Checkout page
    Given The user clicks the Stripe option
    Then The Email, Card Number, MMYY, and CVC fields should be visible and enabled
    And The Pay button should be visible and enabled
    When The user enters valid payment details and clicks Pay
    Then The Payment Success text should be displayed