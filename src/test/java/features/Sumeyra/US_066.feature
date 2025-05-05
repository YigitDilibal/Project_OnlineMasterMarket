Feature: Manage Review by Provider
  #[US-066] As a registered user (provider), I want to have a field where I can see the payments made

  Background: Common steps for each Scenerio
    Given the user navigates to the "url" address
    When the user logs in with username "providerMail" and password "providerPass"
    And the user accesses the dashboard page from the Avatar menu

  Scenario: Payments link should be visible and active in Provider Dashboard sidebar
    Then the user verifies that the payments link in the Dashboard menu is visible and active

  Scenario: Payment list and payment information should be visible on the Payments page
    And the user clicks on the payments link in the Dashboard
    Then the user verifies that list of customers placing in orders and visible in payments page

  Scenario: Filtering icons should be visible and active for searching the Payments list
    And the user clicks on the payments link in the Dashboard
    Then the user click filtering icon the icon should visible and active in payments page


  Scenario: Search box should be visible and active for searching the Payments list
    And the user clicks on the payments link in the Dashboard
    Then the user click search box it should visible and active in payments page


