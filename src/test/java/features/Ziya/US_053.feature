Feature: Access services and create reservations as a registered user
  # As a registered user, I should be able to access the services page and click on the Shops menu,
  # the Book Service button or the Categories submenu to create a reservation for the service I want.

    Scenario:The user should see the Shops menu title on the home page and click on it to be redirected to the companies page
      Given kullanıcı "url" adresine gider
      Then üst barda Shops menü başlığı görünür ve aktif olmalı
      When kullanıcı Shops menü başlığına tıklar
      Then kullanıcı şirketler ve şirketlere ait hizmetlerin listelendiği sayfaya yönlendirildiği doğrulanmalı

    Scenario Outline: All service categories in the “Categories” menu in the top bar of the home page are visible and clickable
      Given kullanıcı "url" adresine gider
      When Sayfanın üst barındaki "Categories" menüsü tıklanır
      Then "<Title>" aşağıdaki kategoriler görünür olmalıdır:
      And "<Title>" her bir kategori bağlantısı tıklanabilir olmalı ve doğru sayfaya yönlendirmelidir:

      Examples:
        | Title                   |
        | Business Services       |
        | Repairs & Maintenance   |
        | Moving & Transportation |
        | Events                  |
        | Personal Services       |
        | Home Services           |

    Scenario:When the profile icon is clicked, the Book Service icon appears and becomes active. Clicking this icon redirects the user to the companies and services page
      Given kullanıcı "url" adresine gider
      When kullanıcı, "ziyaMail" kullanıcı adı ve "userPass" şifresi ile giriş yapar
      Then Profil ikonuna tıklanır
      And Book Service ikonu görünür ve aktif olmalıdır
      When Book Service ikonuna tıklanır
      Then Kullanıcı, şirketler ve hizmetleri sayfasına yönlendirilmelidir.

    Scenario: Displaying and Activating the “Book Service” Button on the Service Detail Page
      Given kullanıcı "url" adresine gider
      When kullanıcı, "ziyaMail" kullanıcı adı ve "userPass" şifresi ile giriş yapar
      Then Profil ikonuna tıklanır
      When Book Service ikonuna tıklanır
      And Service ikonuna tıklanır
      And Deep Cleanin Service hizmetine tıklanır
      Then Açılan Deep Cleanin Service sayfasında Book Service ikonu görünür ve aktif olmalıdır
