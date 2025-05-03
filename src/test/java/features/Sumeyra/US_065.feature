Feature: Manage Review by Provider
  #[US-065] As a registered user (provider), I would like to have an area where I can view and manage my service points

  Background: Common steps for each Scenerio
    Given the user navigates to the "url" address
    When the user logs in with username "providerMail" and password "providerPass"
    And the user accesses the dashboard page from the Avatar menu

  Scenario: Reviews link should be visible and active in Provider Dashboard sidebar
    Then the user verifies that the reviews link in the Dashboard menu is visible and active

  Scenario: On the Reviews page, the list of customers who have reviewed the product should be visible.
    Given the user clicks on the reviews link in the Dashboard
    Then the user verifies that list of customers placing in orders and visible in reviews page