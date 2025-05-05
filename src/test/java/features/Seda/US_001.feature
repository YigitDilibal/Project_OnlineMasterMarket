Feature: US_001 Homepage Access

  # As a user I want to access the homepage
  # So that I can see the main content of the site

  @OMM-84
  Scenario:TC_01 / TC_02 URL should be accessable, title should be visible

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    And Title'in OnlineMasterMarket oldugunu dogrular.
