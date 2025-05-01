Feature: US_036 Logout function for registered Providers
  # User story: As a registered user (Provider) I should be able to exit the page safely

  Scenario: : Logout link is visible and clickable under the Profile icon on the homepage
    Given the user navigates to the "url" address
    When the user logs in with username "yigitMail" and password "userPass"
    Then the user should be redirected to the Dashboard page

  Scenario: User logs out successfully after clicking the Logout link
    Given the Payment link should be visible and clickable in the sidebar
    Then the user clicks the Payment link
    And the user should be navigated to the Payment History page