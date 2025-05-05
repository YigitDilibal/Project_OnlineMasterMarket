Feature: US_018

  Scenario:  Anasayfada bulunan slider'da Repairs & Maintenance basligi gorunur ve aktif olmalidir.

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    Then Kullanici anasayfada bulunan Categories basliginin üstüne gelir
    Then Kullanici Repairs & Maintenance basliginin gorunur oldugunu dogrular
    And Kullanici Repairs & Maintenance basliginin aktif oldugunu dogrular







