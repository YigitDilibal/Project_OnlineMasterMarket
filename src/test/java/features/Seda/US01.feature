Feature: Website Access

  Scenario: URL should be accessable, title should be visible

    Given Kullanici "url" adresine gider.
    Then Siteye erişebildiğini doğrular.
    And Title'in OnlineMasterMarket oldugunu dogrular.
