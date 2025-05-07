Feature: Tests that users can securely log out of the system
  # As a registered user (User), I must be able to securely exit the page.

  @OMM-136
  Scenario: Logout icon should be visible and active when profile icon is clicked
    Given kullanıcı "url" adresine gider
    When kullanıcı, "ziyaMail" kullanıcı adı ve "userPass" şifresi ile giriş yapar
    Then kullanıcı profil ikonuna tıklar
    Then logout ikonu görünür ve tıklanabilir olmalı

  @OMM-137
  Scenario:A successful logout should be possible by clicking the Logout link
    Given kullanıcı "url" adresine gider
    When kullanıcı, "ziyaMail" kullanıcı adı ve "userPass" şifresi ile giriş yapar
    Then kullanıcı profil ikonuna tıklar
    Then logout ikonuna tıklar
    And login butonu görünürlüğü ile çıkış doğrulanır