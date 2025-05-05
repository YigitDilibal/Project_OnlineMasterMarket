Feature: US_018

  Scenario:  Anasayfada bulunan slider'da Repairs & Maintenance basligi gorunur ve aktif olmalidir.

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    Then Kullanici anasayfada bulunan Categories basliginin üstüne gelir
    Then Kullanici Repairs & Maintenance basliginin gorunur oldugunu dogrular
    Then Kullanici Repairs & Maintenance basligina tiklar
    And Kullanici Repairs & Maintenance basliginin aktif oldugunu dogrular

  Scenario: Repairs & Maintenance sayfasına gidildiginde Shops ve Service butonları gorunur ve aktif olmalidir.

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    Then Kullanici anasayfada bulunan Categories basliginin üstüne gelir
    Then Kullanici Repairs & Maintenance basligina tiklar
    Then Gidilen sayfada Shops butonunun gorunur ve aktif oldugu dogrulanir
    Then Gidilen sayfada Service butonunun gorunur ve aktif oldugu dogrulanir













