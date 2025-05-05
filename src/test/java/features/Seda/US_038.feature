Feature: US_038 User Dashboard Page

  # As a registered user, I want to have a personal dashboard page
  # So that I can view my bookings, reviews, and notifications

  Background: Login and navigate to Dashboard
    Given the user navigates to the "url" address
    When the user logs in with username "sedaMail" and password "userPass"
    Then the user should be redirected to the Dashboard page

  @OMM-115
  Scenario:TC_01 Profile icon should be visible and active on the homepage

    Given Anasayfaya gidilir
    Then Profil ikonu gorunur ve aktif olmalidir

  @OMM-116
  Scenario:TC_02 Dashboard link should appear after clicking the profile icon

    Given Anasayfaya gidilir
    When Profil ikonuna tiklanir
    Then "Dashboard" linki gorunur ve aktif olmalidir

  @OMM-117
  Scenario:TC_03 Clicking the dashboard icon should redirect to dashboard page

    Given Profil menusune gidilir
    When "Dashboard" ikonuna tiklanir
    Then Dashboard sayfasina yonlendirilir

  @OMM-118
  Scenario:TC_04 Dashboard page should display cards

    Given Dashboard sayfasina gidilir
    Then "Bookings", "Reviews", ve "Notifications" kartlari gorunur olmalidir

  @OMM-119
  Scenario:TC_05 Clicking each card should redirect to the related page
    Given Dashboard sayfasina gidilr
    When "Bookings" kartina tiklanir
    Then "Bookings" kartina yonlendirilir
    When "Reviews" kartina tiklanir
    Then "Reviews" kartina yonlendirilir
    When "Notifications" kartina tiklanir
    Then "Notifications" kartina yonlendirilir

  @OMM-120
  Scenario:TC_06 Navigation to homepage from Dashboard
    Given Dashboard sayfasina gidilir
    When "Home" linki veya logosuna tiklanir
    Then Anasayfaya yonlendirilir
