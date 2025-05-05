Feature: US_043 User Messaging Functionality

  # As a registered user, I want to be able to message with administrators and providers
  # So that I can communicate effectively

  Background: Login and navigate to Dashboard
    Given the user navigates to the "url" address
    When the user logs in with username "sedaMail" and password "userPass"
    Then the user should be redirected to the Dashboard page

   @OMM-121
  Scenario: TC_01 Access Chat icon from Profile icon

    Given Profil ikonuna tiklanir
    Then "Chat" ikonu gorunur ve aktif olmalidir

   @OMM-122
  Scenario:TC_02 Navigating to Chats page via Chat icon

    Given Profil menusune gidilir
    When "Chat" ikonuna tiklanir
    Then "Chat" sayfasina yonlendirilir

   @OMM-123
  Scenario:TC_03 Chat textbox and submit button should be visible on Chats page

    Given Chat sayfasine gidilir
    Then Chat text box gorunur ve aktif olmalilidir
    And Submit butonu gorunur ve aktif olmalidir

  @OMM-124
  Scenario: TC_04 Person search bar visibility on Chats page

    Given Chat sayfasine gidilir
    Then Kisi arama cubugu gorunur ve aktif olmalidir

  @OMM-125
  Scenario:TC_05 Accessing Chat icon from the top bar on homepage

    Given Anasayfaya gidilir
    Then Ust barda Chat ikonu gorunur ve aktif olmalidir

  @OMM-126
  Scenario:TC_06 Clicking Chat icon reveals sub-links

    Given Ust bardaki chat ikonuna tiklanir
    Then "View All Chat" ve "Clear All" linkleri gorunur ve aktif olmalidir

   @OMM-127
  Scenario:TC_07 Clicking on View All Chat link

    Given Chat menusune gidilir
    When "View All Chat" tiklanir
    Then Chat sayfasina yonlendirilir

   @OMM-128
  Scenario:TC_08 Navigation from Chats page to Home and My Bookings

    Given Chat sayfasina gidilir
    When "Home" linkine tiklanir
    Then Anasayfaya yonlendirilir
    When "My Bookings" linkine tiklanir
    Then My Bookings sayfasina yonlendirilir