Feature:

  Scenario: Login link should be visible and active in the homepage header section.

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    And Anasayfada Login butonunun gorunur aktif oldugu dogrulanir

  Scenario: LOGIN and (Access to our Online Master Market) texts should be visible in the Login modal.

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    Then Anasayfada Login butonuna tiklar
    And Login modalinde bulunan LOGIN ve (Access to our Online Master Market) text'lerinin gorunur oldugu dogrulanir

  Scenario: Email ID textbox should be visible and active in the login modal

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    Then Anasayfada Login butonuna tiklar
    And Login modal'ında Email ID textboxi görünür ve aktif oldugu dogrulanmali
