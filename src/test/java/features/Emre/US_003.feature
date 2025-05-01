Feature: US_003

  Scenario: The search engine must be visible and active on the homepage.

    Given Kullanici "url" adresine gider.
    Then Siteye erişebildiğini doğrular.
    And Anasayfada arama motorunun gorunur ve aktif oldugunu dogrular


  Scenario: The Search button must be visible and active on the homepage.

    Given Kullanici "url" adresine gider.
    Then Siteye erişebildiğini doğrular.
    And Anasayfada Search butonunun gorunur ve aktif oldugunu dogrular


