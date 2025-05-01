Feature: US_002

  Scenario: Easy links (Shops,Categories, About Us, Contact Us, Become a Professionel,Become a User)
            should be visible and active on the top bar of the site.

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    Then Anasayfada Shops butonunun gorunur ve aktif oldugu dogrulanir
    Then Anasayfada Categories butonunun gorunur ve aktif oldugu dogrulanir
    Then Anasayfada About US butonunun gorunur ve aktif oldugu dogrulanir
    Then Anasayfada Contact US butonunun gorunur ve aktif oldugu dogrulanir
    Then Anasayfada Become a Professional butonunun gorunur ve aktif oldugu dogrulanir
    And Anasayfada Become a User butonunun gorunur ve aktif oldugu dogrulanir



  Scenario: Login button should be visible and active on the top bar of the homepage.

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    Then senkronizasyon icin 2 saniye bekler
    And Anasayfada Login butonunun gorunur aktif oldugu dogrulanir


  Scenario: The site logo should be on the top left of the page and the home page should refresh when clicked.

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    Then Site logosunun sayfanın sol üstünde bulundugunu dogrular
    And Site logosuna tiklaninca anasayfanın yenilendigini dogrular





