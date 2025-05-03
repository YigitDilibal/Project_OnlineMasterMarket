Feature: Manage Rewards for Costumers
  #[US-064] As a registered user (provider), I would like to have an area where I can give rewards to my customers

  Background: Common steps for each Scenerio
    Given the user navigates to the "url" address
    When the user logs in with username "providerMail" and password "providerPass"
    And the user accesses the dashboard page from the Avatar menu

  Scenario: Rewards link should be visible and active in Provider Dashboard sidebar
    Given the user verifies that the Rewards link in the Dashboard menu is visible and active

  Scenario: The list of customers placing orders should be visible on the Rewards page
    Given the user clicks on the rewards link in the Dashboard
    Then the user verifies that list of customers placing in orders and visible

  Scenario: Add Rewards button should be visible and active in the list
    Given the user clicks on the rewards link in the Dashboard
    Then the user verifies that the Add Reward button is visible and active

  Scenario: A gift should be created for the customer by filling in the mandatory fields on the add rewards page
    Given the user clicks on the rewards link in the Dashboard
    When the user click Add Reward button for preferred user
    And fills the reward form that appears for costumer
    And clicks the Add button
    Then the user verifies that the newly created reward is visible in the list