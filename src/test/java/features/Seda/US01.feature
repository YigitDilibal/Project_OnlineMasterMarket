Feature: Homepage Access

  # As a user I want to access the homepage
  # So that I can see the main content of the site

  Scenario: URL should be accessable, title should be visible

    Given Kullanici "url" adresine gider.
    Then Siteye erişebildiğini doğrular.
    And Title'in OnlineMasterMarket oldugunu dogrular.
