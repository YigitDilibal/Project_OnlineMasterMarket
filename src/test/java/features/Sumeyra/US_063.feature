Feature: Manage Service Coupons for Provider
  #[US-063] As a registered user (provider), I want to have an area where I can see and manage my coupons

  Background: Common steps for each Scenerio
    Given the user navigates to the "url" address
    When the user logs in with username "providerMail" and password "providerPass"
    And the user accesses the dashboard page from the Avatar menu

  Scenario: Coupons link should be visible and active in Provider Dashboard sidebar
    Then the user verifies that the coupon link in the Dashboard menu is visible and active

  Scenario: View Coupon History button should be visible and active on My Coupons page
    When the user clicks on the coupon link in the Dashboard
    Then the user verifies that the View Coupon History button is visible and active

  Scenario: After selecting a service name, the Add Coupon button should be accessible
    When the user clicks on the coupon link in the Dashboard
    And selects the checkbox of the service for which they want to create a coupon
    Then the user verifies that the Add Coupon button is active and accessible

  Scenario: After clicking the Save button, the new coupon should be visible on the My Coupons page
    When the user clicks on the coupon link in the Dashboard
    And selects the checkbox of the service for which they want to create a coupon
    Then the user clicks the Add Coupon button
    And fills in the desired coupon information in the form that appears
    And clicks the Save button
    Then the user verifies that the newly created coupon is visible in the list