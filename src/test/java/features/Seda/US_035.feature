Feature: US_035 Chat with Providers

  # As a registered user (Provider)
  # I want to be able to send and receive messages with users and administrators
  # So that I can communicate effectively

  Background: Login and click Profile icon
    Given the user navigates to the "url" address
    When the user logs in with username "providerMail" and password "providerPass"
    Then the user clicks on the Profile icon

  @OMM-94
  Scenario:TC_01 Chat link should be visible and active under the Homepage Profile icon.


    Given Sag ustteki profil ikonuna tiklanir
    Then Menude "Chat" ikonu gorunup gorunmedigi kontrol edilir.
    And "Chat" ikonuna tiklanir


  @OMM-95
  Scenario:TC_02 On the Chats page, the contact search bar should be visible and active.

    Given "Chat" sayfasina gidilir
    Then Kisi arama cubugu gorunur ve aktif olmalidir
    And Arama cubuguna kisi yazilarak bulunabilir

  @OMM-96
  Scenario:TC_03 Chat text box should be visible and active.

    Given "Chat" sayfasina gidilir
    Then Chat text box gorunur ve aktif olmalilidir
    And Text box'a yazi yazilabilir

  @OMM-97
  Scenario:TC_04 Submit button should be visible and active.

    Given "Chat" sayfasina gidilir
    Then Submit butonu gorunur ve aktif olmalidir
    And Submit butonuna tiklanarak mesaj gonderilebilir



