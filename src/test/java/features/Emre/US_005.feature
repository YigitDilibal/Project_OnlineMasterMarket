Feature:

  Scenario: Login link should be visible and active in the homepage header section.

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    And Anasayfada Login butonunun gorunur aktif oldugu dogrulanir

  Scenario: LOGIN and (Access to our Online Master Market) texts should be visible in the Login modal.

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    Then Anasayfada Login butonuna tiklar
    And Login modalinde bulunan LOGIN ve "Access to our Online Master Market" text'lerinin gorunur oldugu dogrulanir

  Scenario: Email ID textbox should be visible and active in the login modal

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    Then Anasayfada Login butonuna tiklar
    And Login modal'ında Email ID textboxi görünür ve aktif oldugu dogrulanmali

  Scenario: Login button should be visible and active in the Login modal.

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    Then Anasayfada Login butonuna tiklar
    And Login modalinda Login butonu'nun gorunur ve aktif oldugunu dogrular

  Scenario: PASSWORD and 'Verification your account' texts should be visible when you enter an Email ID in the Login modal and login.

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    Then Anasayfada Login butonuna tiklar
    Then Login modalinda bir Email ID girilir
    Then Login modalinda bulunan login butonuna tiklanir
    And  Login olunduğunda PASSWORD ve Verification your account text'leri gorunur oldugu dogrulanir

  Scenario: The password textbox should be visible and active in the login modal

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    Then Anasayfada Login butonuna tiklar
    Then Login modalinda bir Email ID girilir
    Then Login modalinda bulunan login butonuna tiklanir
    Then Login modal'ında password textboxi görünür ve aktif oldugu dogrulanmali

  Scenario: The Enter button should be visible and active in the login modal.

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    Then Anasayfada Login butonuna tiklar
    Then Login modalinda bir Email ID girilir
    Then Login modalinda bulunan login butonuna tiklanir
    Then Login modal'ında Enter butonu gorunur ve aktif oldugu dogrulanmali

  Scenario: The 'Click to Get Link' link should be visible and active in the login modal.

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    Then Anasayfada Login butonuna tiklar
    Then Login modalinda bir Email ID girilir
    Then Login modalinda bulunan login butonuna tiklanir
    And Login modal'ında Click to Get Link linki gorunur ve aktif olmali.


  Scenario: An error message should be displayed when an invalid email is entered in the Email ID textbox in the login modal.

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    Then Anasayfada Login butonuna tiklar
    Then Login modal'ında Email ID textboxina gecersiz email girilir
    Then Login modalinda bulunan login butonuna tiklanir ve hata aldigi dogrulanir

  Scenario: An error message should be displayed when an invalid password is entered in the password textbox in the login modal and the Enter button is clicked.

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    Then Anasayfada Login butonuna tiklar
    Then Login modalinda bir Email ID girilir
    Then Login modalinda bulunan login butonuna tiklanir
    Then Login modala gecersiz password girilir
    And Login modalinda Enter butonuna tiklanir ve hata mesaji alindigi dogrulanir


  Scenario: It should be possible to log in to the system when valid information is entered in the login modal and the Enter button is clicked.

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    Then Anasayfada Login butonuna tiklar
    Then Login modalinda bir Email ID girilir
    Then Login modalinda bulunan login butonuna tiklanir
    Then Login modalinda bulunan PASSWORD box'a gecerli PASSWORD girilir
    And Login modalinda Enter butonuna tiklanir ve sisteme giris yapilabildigi dogrulanir

























