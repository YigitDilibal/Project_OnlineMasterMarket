Feature: US_003

  Scenario: The search engine must be visible and active on the homepage.

    Given Kullanici "url" adresine gider.
    Then Siteye erişebildiğini doğrular.
    And Anasayfada arama motorunun gorunur ve aktif oldugunu dogrular
