Feature: US_036 Logout function for registered Providers
  # User story: As a registered user (Provider) I should be able to exit the page safely

  Background: Login and click Profile icon
    Given the user navigates to the "url" address
    When the user logs in with username "providerMail" and password "providerPass"
    Then the user clicks on the Profile icon

  Scenario: Logout link is visible and clickable under the Profile icon on the homepage
    Given the Logout button should be visible and clickable

  Scenario: User logs out successfully after clicking the Logout link
    When the user clicks on the Logout link
    Then the user should be redirected to the login page