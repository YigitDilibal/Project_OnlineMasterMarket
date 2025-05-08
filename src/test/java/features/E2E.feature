@E2E
Feature: Promotional Home Cleaning Service Purchase and Approval Process

  Scenario: User completes payment with valid card details and sees success confirmation
    Given the user navigates to the "url" address
    When the user logs in with username "yigitMail" and password "userPass"
    And the User clicks the Home Services button
    And the User clicks Deep Cleaning Service button
    Then the User clicks the Book Service button
    Given the User selects a Staff from the list
    And the User selects "16-05-2025" as Date
    And the User selects Time Slot as "05:00 PM-05:50 PM"
    And the User clicks the Confirm Booking button
    Then the User should see a confirmation message
    And the User's reservation should be saved
    Then The user is redirected to the Checkout page
    And The user copies the Coupon Code and activates
    Given The user clicks the Stripe option
    Then The Email, Card Number, MMYY, and CVC fields should be visible and enabled
    And The Pay button should be visible and enabled
    When The user enters valid payment details and clicks Pay
    Then The Payment Success text should be displayed

  Scenario: Order request confirmation and filtering options
    Given the user navigates to the "url" address
    When the user logs in with username "providerMail" and password "providerPass"
    And the user clicks on the Profile icon
    Then the provider navigates to the Dashboard page
    Given the provider navigates to the Booking List page
    Then filtering options are visible and clickable
    And the provider completes the service through Complete Request to user

  Scenario: User completes service request.
    Given the user navigates to the "url" address
    When the user logs in with username "yigitMail" and password "userPass"
    Then the user should be redirected to the Dashboard page
    Given the user clicks the Booking List link
    Then the user clicks Complete Request Accept button
    And the user clicks Confirm button
    And the user clicks Okay button

