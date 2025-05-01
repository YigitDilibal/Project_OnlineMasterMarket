Feature: US_003

  Scenario: The search engine must be visible and active on the homepage.

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    And Anasayfada arama motorunun gorunur ve aktif oldugunu dogrular


  Scenario: The Search button must be visible and active on the homepage.

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    And Anasayfada Search butonunun gorunur ve aktif oldugunu dogrular

  Scenario: Quick service links (Full House Cleaning, Carpet Cleaning (per square foot),
            Long Distance Moving) should be visible and active on the homepage. When clicked,
            it should redirect to the relevant page.

    Given the user navigates to the "url" address
    Then Siteye erişebildiğini doğrular.
    Then Anasayfada Full House Cleaning linkinin gorunur ve aktif oldugunu dogrular
    Then Anasayfada Full House Cleaning linkine tiklandiginda ilgili sayfaya yönlendirildigi dogrulanir
    Then Anasayfada Full Service Catering linkinin gorunur ve aktif oldugunu dogrular
    Then Anasayfada Full Service Catering linkine tiklandiginda ilgili sayfaya yönlendirildigi dogrulanir
    Then Anasayfada Personalized Fitness Programs linkinin gorunur ve aktif oldugunu dogrular
    And Anasayfada Personalized Fitness Programs linkine tiklandiginda ilgili sayfaya yönlendirildigi dogrulanir


