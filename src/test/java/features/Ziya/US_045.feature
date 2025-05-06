Feature: View user reviews
  #As a registered user, there should be a Reviews section where I can view the comments I've made on services.

Scenario: Appearance of Reviews link and redirect
  Given kullanıcı "url" adresine gider
  When kullanıcı, "ziyaMail" kullanıcı adı ve "userPass" şifresi ile giriş yapar
  Then kullanıcı Dashboard sayfasına yönlendirilmeli
  And Reviews ikonu görünür ve aktif olmalıdır
  And Reviews ikonuna tıklandığında ilgili sayfaya gittiğini test eder

Scenario: On the Reviews page, the user should see all the comment details
  Given kullanıcı "url" adresine gider
  When kullanıcı, "ziyaMail" kullanıcı adı ve "userPass" şifresi ile giriş yapar
  Then kullanıcı Dashboard sayfasına yönlendirilmeli
  And Reviews ikonuna basar
  And Her bir yorum için yorum metni, tarih ve puan görünür olmalı

Scenario:It should be possible to navigate from the Reviews page to the Home page
  Given kullanıcı "url" adresine gider
  When kullanıcı, "ziyaMail" kullanıcı adı ve "userPass" şifresi ile giriş yapar
  Then kullanıcı Dashboard sayfasına yönlendirilmeli
  And Reviews ikonuna basar
  When kullanıcı Home butonuna tıklar
  Then kullanıcı Home sayfasına geçiş yaptığını test eder