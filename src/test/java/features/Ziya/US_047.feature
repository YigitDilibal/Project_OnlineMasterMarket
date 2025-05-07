Feature: As a registered user (User), I want to see the invoices of my completed reservations.
  # As a registered user (User), I want to have a field where I can see the invoices of my completed reservations.

  Background: Log in, go to dashboard and invoices
    Given kullanıcı "url" adresine gider
    When kullanıcı, "ziyaMail" kullanıcı adı ve "userPass" şifresi ile giriş yapar
    Then kullanıcı Dashboard sayfasına yönlendirilmeli
    Then Kullanıcı Invoices'a tıkladığında tamamlanmış rezervasyon faturaları görüntülenir

    @OMM-145
    Scenario: The user should see the Invoices link in the Dashboard sidebar and be redirected to the relevant page when clicked
      When Invoices sayfasına gittiğini doğrular

    @OMM-146
    Scenario: On the Invoices page, the 'Export' button on the invoice for completed reservations should be visible and active.
      And Invoices sayfasına gittiğini doğrular
      When Kullanıcı, listelenen faturalardan Export butonuna tıklar
      And Sistem, kullanıcının ilgili hizmetin detay sayfasına yönlendirildiğini doğrular

    @OMM-147
    Scenario: Search and cross buttons should be visible and active on the Invoices page
      And Invoices sayfasına gittiğini doğrular
      Then Search alanı görünür ve aktif olmalı
      And  Çarpı butonu görünür ve aktif olmalı
      When Kullanıcı tarih aralığı girebilmeli
      Then sadece seçilen tarih aralığındaki faturalar listelenmeli
      When kullanıcı Çarpı butonuna tıklar tüm faturalar yeniden listelenmeli

    @OMM-148
    Scenario:Filtering by Visible and Active From Date and To Date Fields
      And From Date ve To Date kutuları görünür ve aktif olmalı
      When kullanıcı seçtiği tarihi From Date kutusuna girer
      And kullanıcı seçtiği tarihi To Date kutusuna girer
      And kullanıcı Search butonuna tıklar
      Then sadece seçtiği tarihler arasında tamamlanmış rezervasyonlara ait faturalar listelendiğini doğrular

    @OMM-149
    Scenario:User should be able to navigate from the Invoices page to the Home page
      When kullanıcı Home butonuna tıklar
      Then kullanıcı Home sayfasına geçiş yaptığını test eder
