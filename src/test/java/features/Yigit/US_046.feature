Feature: US_046 Payment History Page Functionality (User)
  # User story: As a registered user (User), I want to have a field where I can see my payment history.

  Background: Login and navigate to Dashboard
    Given Kullanici "url" adresine gider.
    When the user logs in with username "yigitMail" and password "userPass"
    Then the user should be redirected to the Dashboard page

    Scenario: Payment link is visible and navigates to Payment History
      Given the Payment link should be visible and clickable in the sidebar
      Then the user clicks the Payment link
      And the user should be navigated to the Payment History page