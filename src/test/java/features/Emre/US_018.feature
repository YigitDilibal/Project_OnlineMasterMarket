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


  Scenario: Sayfada filtreleme ikonlari gorunur ve aktif olmalidir.

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    Then Kullanici anasayfada bulunan Categories basliginin üstüne gelir
    Then Kullanici Repairs & Maintenance basligina tiklar
    Then Gidilen sayfada filtreleme butonuna tiklanir
    Then Kullanici Location butonunun gorunur ve aktif oldugunu dogrular
    Then Kullanici Sort By butonunun gorunur ve aktif oldugunu dogrular
    Then Kullanici Keyword butonunun gorunur ve aktif oldugunu dogrular
    Then Kullanici Categories butonunun gorunur ve aktif oldugunu dogrular
    Then Kullanici Sub Category butonunun gorunur ve aktif oldugunu dogrular
    Then Kullanici Price Range butonunun gorunur ve aktif oldugunu dogrular


  Scenario: Repairs & Maintenance sayfasında bulunan servisler görüntülenmeli ve ilerleyen sayfalara gecilebilmelidir.

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    Then Kullanici anasayfada bulunan Categories basliginin üstüne gelir
    Then Kullanici Repairs & Maintenance basligina tiklar
    Then Kullanici gidilen sayfada bulunan Service butonuna tiklar
    Then Kullanici Flooring Reapir servisinin goruntulendigini ve aktif oldugunu dogrular
    Then Kullanici Window and Door Repair servisinin goruntulendigini ve aktif oldugunu dogrular
    Then Kullanici Smart Home Installation servisinin goruntulendigini ve aktif oldugunu dogrular
    Then Kullanici Locksmith Services (Service Call Fee) servisinin goruntulendigini ve aktif oldugunu dogrular
    Then Kullanici Refrigerator Repair (Service Call Fee) servisinin goruntulendigini ve aktif oldugunu dogrular
    Then Kullanici Washing Machine Repair (Service Call Fee) servisinin goruntulendigini ve aktif oldugunu dogrular
    Then Kullanici Oven Repair servisinin goruntulendigini ve aktif oldugunu dogrular

  Scenario: Shops ikonuna tıklandıgında ilgili servisler görüntülenmeli ve Servis kartında Visit Store ikonu gorunur ve aktif olmalidir.
            İstenilen servis secildiginde (Shop Detail,Shop Availability,Services) servis adedi ve genel bilgilere erişilebilmelidir.

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    Then Kullanici anasayfada bulunan Shops basliginin üstüne gelir
    Then Kullanici Shops & Services butonunun gorunur oldugunu dogrular
    Then Kullanici Products butonunun gorunur oldugunu dogrular
    Then Kullanici Shops & Service butonuna tiklar
    Then Kullanici gidilen sayfada Visit Store ikonunun gorunur ve aktif oldugunu dogrular
    Then Kullanici Miracle Maid servisini secer
    Then Kullanici gidilen sayfada servis adedeni ve genel bilgilerin goruldugunu dogrular




















