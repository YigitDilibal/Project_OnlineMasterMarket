package stepdefinitions;

import config.DataReader;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import lombok.extern.log4j.Log4j;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import pages.HomePage;
import pages.UserPage;
import runners.TestRunner;
import utils.JSUtilities;
import utils.LoggerHelper;
import utils.ReusableMethods;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserSteps {



    private static final Logger logger = LogManager.getLogger(UserSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    BasePage basePage = new BasePage(driver);
    UserPage userPage = new UserPage(driver);
    HomePage homePage = new HomePage(driver);

    @Then("the user should be redirected to the Dashboard page")
    public void the_user_should_be_redirected_to_the_dashboard_page() {
        basePage.click(userPage.sagUstProfilButonu);
        basePage.click(userPage.dropdownDashboardButonu);
    }

    @Given("the Payment link should be visible and clickable in the sidebar")
    public void the_payment_link_should_be_visible_and_clickable_in_the_sidebar() {

        Assert.assertTrue(userPage.dashboardPaymentButonu.isDisplayed());
        Assert.assertTrue(userPage.dashboardPaymentButonu.isEnabled());
    }

    @Then("the user clicks the Payment link")
    public void the_user_clicks_the_link() {

        basePage.click(userPage.dashboardPaymentButonu);

    }
    @Then("the user should be navigated to the Payment History page")
    public void the_user_should_be_navigated_to_the_payment_history_page() {

        Assert.assertTrue(userPage.paymentHistoryProductButonu.isDisplayed());
    }

    @Then("the Services button should be visible and clickable")
    public void the_services_button_should_be_visible_and_clickable() {
        Assert.assertTrue(userPage.paymentHistoryServicesButonu.isDisplayed());
        logger.info("test");
        Assert.assertTrue("Buton etkin degil",userPage.paymentHistoryServicesButonu.isEnabled());

        logger.error("error");



    }
    @Then("the Products button should be visible and clickable")
    public void the_products_button_should_be_visible_and_clickable() {
        Assert.assertTrue(userPage.paymentHistoryProductButonu.isDisplayed());
        Assert.assertTrue(userPage.paymentHistoryProductButonu.isEnabled());
    }

    @Then("the services with status Paid or Rejected should be displayed")
    public void the_services_with_status_or_should_be_displayed() {
        Assert.assertTrue(userPage.paymentProviderRejected.isDisplayed());
        Assert.assertTrue(userPage.paymentCompleted.isDisplayed());

    }
    @Then("each service should include Name, Service, Date, Amount, and Status")
    public void each_service_should_include_name_service_date_amount_and_status() {
        Assert.assertTrue(userPage.paymentName.isDisplayed());
        Assert.assertTrue(userPage.paymentService.isDisplayed());
        Assert.assertTrue(userPage.paymentDate.isDisplayed());
        Assert.assertTrue(userPage.paymentAmount.isDisplayed());
        Assert.assertTrue(userPage.paymentStatus.isDisplayed());
    }

    @When("the user clicks the Products tab")
    public void the_user_clicks_the_tab() {
        basePage.click(userPage.paymentHistoryProductButonu);
    }

    @Then("the products with status Delivered or Canceled should be displayed")
    public void the_products_with_status_or_should_be_displayed() {
        Assert.assertTrue(userPage.orderCancelled.isDisplayed());
        Assert.assertTrue(userPage.orderDelivered.isDisplayed());
    }

    @Then("each product should include Name, Product, Date, Amount, and Status")
    public void each_product_should_include_name_product_date_amount_and_status() {
        Assert.assertTrue(userPage.paymentName.isDisplayed());
        Assert.assertTrue(userPage.paymentProducts.isDisplayed());
        Assert.assertTrue(userPage.paymentDate.isDisplayed());
        Assert.assertTrue(userPage.paymentAmount.isDisplayed());
        Assert.assertTrue(userPage.paymentStatus.isDisplayed());
    }

    @When("the Search button should be visible and active in the Services tab")
    public void the_button_should_be_visible_and_active_in_the_services_tab() {
        Assert.assertTrue(userPage.PaymentSearch.isDisplayed());
        Assert.assertTrue(userPage.PaymentSearch.isEnabled());
    }

    @And("the user enters a service name and clicks Search")
    public void the_user_enters_a_service_name_and_clicks() {
        userPage.PaymentSearch.sendKeys("Flooring");
        userPage.PaymentSearch.sendKeys(Keys.ENTER);
    }

    @Then("the matching service results should be displayed")
    public void the_matching_service_results_should_be_displayed() {
        Assert.assertTrue(userPage.paymentCompleted.isDisplayed());
    }

    @Then("the Search button should be visible and active in the Products tab")
    public void the_button_should_be_visible_and_active_in_the_products_tab() {
        Assert.assertTrue(userPage.PaymentSearch.isDisplayed());
        Assert.assertTrue(userPage.PaymentSearch.isEnabled());
    }

    @When("the user enters a product name and clicks Search")
    public void the_user_enters_a_product_name_and_clicks() {
        userPage.PaymentSearch.sendKeys("Drill");
        userPage.PaymentSearch.sendKeys(Keys.ENTER);
    }
    @Then("the matching product results should be displayed")
    public void the_matching_product_results_should_be_displayed() {
        Assert.assertTrue(userPage.orderDelivered.isDisplayed());
    }

    @When("the user clicks the Home button")
    public void the_user_clicks_the_button() {
        homePage.anasayfaSiteLogosu.click();
    }

    @Then("the user should be redirected to the Home page")
    public void the_user_should_be_redirected_to_the_home_page() {
        Assert.assertTrue(homePage.searchButonu.isDisplayed());
    }


    @Given("Anasayfaya gidilir")
    public void anasayfaya_gidilir() {

        driver.get("https://onlinemastermarket.com");

    }

    @Then("Profil ikonu gorunur ve aktif olmalidir")
    public void profil_ikonu_gorunur_ve_aktif_olmalidir() {

        Assert.assertTrue(userPage.sagUstProfilButonu.isDisplayed());
        Assert.assertTrue(userPage.sagUstProfilButonu.isEnabled());


    }

    @When("Profil ikonuna tiklanir")
    public void profil_ikonuna_tiklanir() {

        userPage.click(userPage.sagUstProfilButonu);

    }

    @Then("{string} linki gorunur ve aktif olmalidir")
    public void linki_gorunur_ve_aktif_olmalidir(String string) {

        Assert.assertTrue(userPage.dropdownDashboardButonu.isDisplayed());
        Assert.assertTrue(userPage.dropdownDashboardButonu.isEnabled());


    }

    @Given("Profil menusune gidilir")
    public void profil_menusune_gidilir() {

        driver.findElement(By.id("profilButonu")).click();
    }

    @When("{string} ikonuna tiklanir")
    public void ikonuna_tiklanir(String string) {

        userPage.click(userPage.dropdownDashboardButonu);
    }

    @Then("Dashboard sayfasina yonlendirilir")
    public void dashboard_sayfasina_yonlendirilir() {

        Assert.assertTrue(userPage.dropdownDashboardButonu.isEnabled());

    }

    @Given("Dashboard sayfasina gidilir")
    public void dashboard_sayfasina_gidilir() {

        userPage.click(userPage.dropdownDashboardButonu);

    }

    @Then("{string}, {string}, ve {string} kartlari gorunur olmalidir")
    public void ve_kartlari_gorunur_olmalidir(String string, String string2, String string3) {

        Assert.assertTrue(userPage.dashboardBookingsButonu.isDisplayed());
        Assert.assertTrue(userPage.dashboardBookingsButonu.isEnabled());
        Assert.assertTrue(userPage.dashboardReviewsButonu.isDisplayed());
        Assert.assertTrue(userPage.dashboardReviewsButonu.isEnabled());
        Assert.assertTrue(userPage.dashboardNotificationsButonu.isDisplayed());
        Assert.assertTrue(userPage.dashboardNotificationsButonu.isEnabled());

    }

    @Given("Dashboard sayfasina gidilr")
    public void dashboard_sayfasina_gidilr() {

        userPage.click(userPage.dropdownDashboardButonu);

    }

    @When("{string} kartina tiklanir")
    public void kartina_tiklanir(String string) {

        userPage.click(userPage.dashboardBookingsButonu);
        userPage.click(userPage.dashboardReviewsButonu);
        userPage.click(userPage.dashboardNotificationsButonu);



    }

    @Then("{string} kartina yonlendirilir")
    public void kartina_yonlendirilir(String string) {

        Assert.assertTrue(userPage.dashboardBookingsButonu.isDisplayed());
        Assert.assertTrue(userPage.dashboardBookingsButonu.isSelected());
        Assert.assertTrue(userPage.dashboardBookingsButonu.isEnabled());
        Assert.assertTrue(userPage.dashboardReviewsButonu.isDisplayed());
        Assert.assertTrue(userPage.dashboardReviewsButonu.isSelected());
        Assert.assertTrue(userPage.dashboardReviewsButonu.isEnabled());
        Assert.assertTrue(userPage.dashboardNotificationsButonu.isDisplayed());
        Assert.assertTrue(userPage.dashboardNotificationsButonu.isSelected());
        Assert.assertTrue(userPage.dashboardNotificationsButonu.isEnabled());




    }

    @When("{string} linki veya logosuna tiklanir")
    public void linki_veya_logosuna_tiklanir(String string) {

        userPage.click(userPage.homeButonu);

    }

    @Then("Anasayfaya yonlendirilir")
    public void anasayfaya_yonlendirilir() {

        Assert.assertTrue(userPage.homeButonu.isDisplayed());
        Assert.assertTrue(userPage.homeButonu.isSelected());
        Assert.assertTrue(userPage.homeButonu.isEnabled());


    }


    @Then("{string} ikonu gorunur ve aktif olmalidir")
    public void ikonuGorunurVeAktifOlmalidir(String arg0) {

        userPage.click(userPage.sagUstProfilButonu);
    }

    @Then("{string} sayfasina yonlendirilir")
    public void sayfasinaYonlendirilir(String arg0) {

        Assert.assertTrue(userPage.chatIkonu.isDisplayed());
        Assert.assertTrue(userPage.chatIkonu.isEnabled());

    }

    @Given("Chat sayfasine gidilir")
    public void chatSayfasineGidilir() {

        Assert.assertTrue(userPage.chatIkonu.isEnabled());
        userPage.click(userPage.chatIkonu);

    }

    @Then("Ust barda Chat ikonu gorunur ve aktif olmalidir")
    public void ustBardaChatIkonuGorunurVeAktifOlmalidir() {

        Assert.assertTrue(userPage.ustBarChatIkonu.isDisplayed());
        Assert.assertTrue(userPage.ustBarChatIkonu.isEnabled());

    }

    @Given("Ust bardaki chat ikonuna tiklanir")
    public void ustBardakiChatIkonunaTiklanir() {

        userPage.click(userPage.ustBarChatIkonu);

    }

    @Then("{string} ve {string} linkleri gorunur ve aktif olmalidir")
    public void veLinkleriGorunurVeAktifOlmalidir(String arg0, String arg1) {

        Assert.assertTrue(userPage.ustBarChatIkonuViewAllButonu.isDisplayed());
        Assert.assertTrue(userPage.ustBarChatIkonuViewAllButonu.isEnabled());
        Assert.assertTrue(userPage.ustBarChatIkonuClearAllButonu.isDisplayed());
        Assert.assertTrue(userPage.ustBarChatIkonuClearAllButonu.isEnabled());

    }

    @Given("Chat menusune gidilir")
    public void chatMenusuneGidilir() {

        Assert.assertTrue(userPage.chatIkonu.isEnabled());
        userPage.click(userPage.chatIkonu);

    }

    @When("{string} tiklanir")
    public void tiklanir(String arg0) {

        userPage.click(userPage.ustBarChatIkonuViewAllButonu);

    }

    @Then("Chat sayfasina yonlendirilir")
    public void chatSayfasinaYonlendirilir() {

        Assert.assertTrue(userPage.chatIkonu.isDisplayed());
        Assert.assertTrue(userPage.chatIkonu.isEnabled());
    }

    @Given("Chat sayfasina gidilir")
    public void chatSayfasinaGidilir() {

        Assert.assertTrue(userPage.chatIkonu.isEnabled());
        userPage.click(userPage.chatIkonu);

    }

    @Then("My Bookings sayfasina yonlendirilir")
    public void myBookingsSayfasinaYonlendirilir() {

        Assert.assertTrue(userPage.chatBookingButonu.isDisplayed());
        userPage.click(userPage.chatBookingButonu);
    }

    @Given("the User clicks the Home Services button")
    public void the_user_clicks_the_home_services_button() {
        ReusableMethods.bekle(1000);
        basePage.click(homePage.anasayfaHomeServicesButonu);
    }

    @Given("the User clicks Deep Cleaning Service button")
    public void the_user_clicks_deep_cleaning_service_button() {
        basePage.click(userPage.DeepCleaningService);
    }

    @Then("the User clicks the Book Service button")
    public void the_user_clicks_the_book_service_button() {
        basePage.click(userPage.BookServiceButton);
    }

    @Then("the User should be redirected to the Appointment page")
    public void the_user_should_be_redirected_to_the_appointment_page() {
        Assert.assertTrue(userPage.SelectStaffddm.isDisplayed());
    }

    @Given("Confirm Booking button should be visible and active")
    public void confirm_booking_button_should_be_visible_and_active() {
        JSUtilities.scrollToElement(driver, userPage.ConfirmBooking);
        ReusableMethods.bekle(500);
        Assert.assertTrue(userPage.ConfirmBooking.isDisplayed());
        Assert.assertTrue(userPage.ConfirmBooking.isEnabled());
    }

    @Given("Cancel booking button should be visible and active")
    public void cancel_booking_button_should_be_visible_and_active() {
        JSUtilities.scrollToElement(driver, userPage.ConfirmBooking);
        ReusableMethods.bekle(500);
        Assert.assertTrue(userPage.CancelBooking.isDisplayed());
        Assert.assertTrue(userPage.CancelBooking.isEnabled());
    }

    @When("the User tries to click the Confirm Booking button without selecting Staff, Date, or Time Slot")
    public void the_user_tries_to_click_the_confirm_booking_button_without_selecting_staff_date_or_time_slot() {
        JSUtilities.scrollToElement(driver, userPage.ConfirmBooking);
        ReusableMethods.bekle(500);
        basePage.click(userPage.ConfirmBooking);
    }

    @Then("the User should see validation messages for required fields")
    public void the_user_should_see_validation_messages_for_required_fields() {
        Assert.assertTrue(userPage.PleaseEnterDate.isDisplayed());
    }

    @Given("the User selects a Staff from the list")
    public void the_user_selects_a_staff_from_the_list() {
        Select selectStaff = new Select(userPage.SelectStaffddm);
        selectStaff.selectByVisibleText("Bella Maison");
    }

    @And("the User selects {string} as Date")
    public void theUserSelectsADate(String date) {
        basePage.type(userPage.BookingDateInput, date);
        userPage.BookingDateInput.sendKeys(Keys.ENTER);
    }


    @Given("the User selects a Time Slot")
    public void the_user_selects_a_time_slot() {

    }

    @And("the User selects Time Slot as {string}")
    public void theUserSelectsTimeSlotAs(String timeSlot) {
        Select selectTime = new Select(userPage.SelectTimeSlotddm);
        selectTime.selectByValue(timeSlot);
    }

    @Given("the User clicks the Confirm Booking button")
    public void the_user_clicks_the_confirm_booking_button() {
        JSUtilities.scrollToElement(driver, userPage.ConfirmBooking);
        ReusableMethods.bekle(500);
        basePage.click(userPage.ConfirmBooking);
        ReusableMethods.bekle(2000);
    }

    @Then("the User should see a confirmation message")
    public void the_user_should_see_a_confirmation_message() {
        Assert.assertTrue(userPage.BookingAvailable.isDisplayed());
    }

    @Then("the User's reservation should be saved")
    public void the_user_s_reservation_should_be_saved() {
        basePage.click(userPage.OkayButton);
        Assert.assertTrue(userPage.ProceedToPayment.isDisplayed());
    }


    @Then("The user is redirected to the Checkout page")
    public void theUserIsRedirectedToTheCheckoutPage() {
        basePage.click(userPage.ProceedToPayment);
        ReusableMethods.bekle(1000);
        basePage.click(userPage.PaymentSuccessOkayButton);
        ReusableMethods.bekle(1000);
    }

    @Then("The checkout page should be displayed successfully")
    public void theCheckoutPageShouldBeDisplayedSuccessfully() {
        Assert.assertTrue(userPage.StripeButton.isDisplayed());
    }

    @And("The reserved service name and price should be clearly visible")
    public void theReservedServiceNameAndPriceShouldBeClearlyVisible() {
        Assert.assertTrue(userPage.CheckoutServiceName.isDisplayed());
    }

    @Then("The system should prompt the user to select a payment type")
    public void theSystemShouldPromptTheUserToSelectAPaymentType() {
        Assert.assertTrue(userPage.StripeButton.isDisplayed());
    }

    @When("The user clicks the Stripe option")
    public void theUserClicksTheStripeOption() {
        basePage.click(userPage.StripeButton);
    }

    @Then("The Service Booking window should open")
    public void theServiceBookingWindowShouldOpen() {
        ReusableMethods.bekle(1000);
        WebElement iFrame = driver.findElement(By.xpath("(//iframe)[1]"));

        driver.switchTo().frame(iFrame);
        ReusableMethods.bekle(1);

        Assert.assertTrue(userPage.PaymentWindowEmail.isEnabled());

        driver.switchTo().defaultContent();
    }

    @Then("The Email, Card Number, MMYY, and CVC fields should be visible and enabled")
    public void theEmailCardNumberMMYYAndCVCFieldsShouldBeVisibleAndEnabled() {
        ReusableMethods.bekle(1000);
        WebElement iFrame = driver.findElement(By.xpath("(//iframe)[1]"));
        driver.switchTo().frame(iFrame);
        ReusableMethods.bekle(1000);

        Assert.assertTrue(userPage.PaymentWindowEmail.isEnabled());
        Assert.assertTrue(userPage.PaymentWindowCardNumber.isEnabled());
        Assert.assertTrue(userPage.PaymentWindowMMYY.isEnabled());
        Assert.assertTrue(userPage.PaymentWindowCVC.isEnabled());
    }

    @And("The Pay button should be visible and enabled")
    public void thePayButtonShouldBeVisibleAndEnabled() {
        ReusableMethods.bekle(1000);
        Assert.assertTrue(userPage.PaymentWindowPayButton.isDisplayed());
        Assert.assertTrue(userPage.PaymentWindowPayButton.isEnabled());
    }

    @When("The user enters valid payment details and clicks Pay")
    public void theUserEntersValidPaymentDetailsAndClicksPay() {
        basePage.type(userPage.PaymentWindowEmail, DataReader.getData("ValidEmail"));
        ReusableMethods.bekle(500);
        basePage.type(userPage.PaymentWindowCardNumber,"4242");
        ReusableMethods.bekle(200);
        basePage.type(userPage.PaymentWindowCardNumber,"4242");
        ReusableMethods.bekle(200);
        basePage.type(userPage.PaymentWindowCardNumber,"4242");
        ReusableMethods.bekle(200);
        basePage.type(userPage.PaymentWindowCardNumber,"4242");
        ReusableMethods.bekle(500);
        basePage.type(userPage.PaymentWindowMMYY, "12");
        ReusableMethods.bekle(200);
        basePage.type(userPage.PaymentWindowMMYY, "30");
        ReusableMethods.bekle(500);
        basePage.type(userPage.PaymentWindowCVC, "123");
        ReusableMethods.bekle(1000);
        basePage.click(userPage.PaymentWindowPayButton);
        ReusableMethods.bekle(1000);
        driver.switchTo().defaultContent();
        ReusableMethods.bekle(1000);





    }

    @Then("The Payment Success text should be displayed")
    public void thePaymentSuccessTextShouldBeDisplayed() {
        Assert.assertTrue(userPage.PaymentSuccess.isDisplayed());
        ReusableMethods.bekle(1000);
        basePage.click(userPage.PaymentSuccessOkayButton);
        ReusableMethods.bekle(2000);
    }

    @Then("Kullanıcı Invoices'a tıkladığında tamamlanmış rezervasyon faturaları görüntülenir")
    public void kullanıcı_butonuna_tıklar() {

        ReusableMethods.bekle(1000);
        userPage.dashboardInvoices.click();
        logger.info("Kullanıcı Invoices'a tıkladığında tamamlanmış rezervasyon faturaları görüntülendi");
    }

    @When("Invoices sayfasına gittiğini doğrular")
    public void sayfasına_gittiğini_doğrular() {

        ReusableMethods.bekle(1000);
        Assert.assertTrue(userPage.dashboardInvoicesTitle.isDisplayed());
        logger.info("Invoices sayfasına gittiği doğrulandı");
    }

    @When("Kullanıcı, listelenen faturalardan Export butonuna tıklar")
    public void kullanıcı_listelenen_faturalardan_export_butonuna_tıklar() {

        ReusableMethods.bekle(1000);
        userPage.invoicesExportButton.click();
        logger.info("Kullanıcı, listelenen faturalardan Export butonuna tıkladı");
        ReusableMethods.bekle(1000);

    }

    @Then("Sistem, kullanıcının ilgili hizmetin detay sayfasına yönlendirildiğini doğrular")
    public void sistem_kullanıcının_ilgili_hizmetin_detay_sayfasına_yönlendirildiğini_doğrular() {

        driver.get(config.ConfigReader.getProperty("exportUrl"));
        String expectedUrl = "https://qa.onlinemastermarket.com/user/dashboard/export_invoice/310";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);
        logger.info("Kullanıcının ilgili hizmetin detay sayfasına yönlendirildiği doğrulandı");
    }

    @Then("Search alanı görünür ve aktif olmalı")
    public void search_alanı_görünür_ve_aktif_olmalı() {

        Assert.assertTrue(userPage.invoicesSearchButton.isDisplayed());
        Assert.assertTrue(userPage.invoicesSearchButton.isEnabled());
        logger.info("Search alanı görünür ve aktif");
    }

    @Then("Çarpı butonu görünür ve aktif olmalı")
    public void çarpı_butonu_görünür_ve_aktif_olmalı() {

        Assert.assertTrue(userPage.invoicesDeleteButton.isDisplayed());
        Assert.assertTrue(userPage.invoicesDeleteButton.isEnabled());
        logger.info("Çarpı butonu görünür ve aktif");
    }

    @When("Kullanıcı tarih aralığı girebilmeli")
    public void kullanıcı_tarih_aralığı_girebilmeli() {

        userPage.fromDateBox.click();
        userPage.fromDateEighthDay.click();
        userPage.toDateBox.click();
        userPage.toDateFourteenthDay.click();
        userPage.invoicesSearchButton.click();
        logger.info("Kullanıcı tarih aralığı girebildi");
        ReusableMethods.bekle(1000);
    }

    @Then("sadece seçilen tarih aralığındaki faturalar listelenmeli")
    public void sadece_seçilen_tarih_aralığındaki_faturalar_listelenmeli() {

        ReusableMethods.bekle(1000);
        Assertions.assertTrue(userPage.invoicesBookingDateVerification.isDisplayed());
        logger.info("Seçilen tarih aralığındaki faturalar listelendi");
    }

    @When("kullanıcı Çarpı butonuna tıklar tüm faturalar yeniden listelenmeli")
    public void kullanıcı_çarpı_butonuna_tıklar_tüm_faturalar_yeniden_listelenmeli() {

        ReusableMethods.bekle(1000);
        userPage.invoicesDeleteButton.click();
        ReusableMethods.bekle(1000);
        Assertions.assertTrue(userPage.invoicesBookingDateVerification.isDisplayed());
        logger.info("Kullanıcı Çarpı butonuna tıkladı ve tüm faturalar listelendi");
    }

    @Then("From Date ve To Date kutuları görünür ve aktif olmalı")
    public void from_date_ve_to_date_kutuları_görünür_ve_aktif_olmalı() {

        Assert.assertTrue(userPage.fromDateBox.isDisplayed());
        Assert.assertTrue(userPage.fromDateBox.isEnabled());

        Assert.assertTrue(userPage.toDateBox.isDisplayed());
        Assert.assertTrue(userPage.toDateBox.isEnabled());

        logger.info("From Date ve To Date kutuları görünür ve aktif");
    }

    @When("kullanıcı seçtiği tarihi From Date kutusuna girer")
    public void kullanıcı_seçtiği_tarihi_from_date_kutusuna_girer() {

        userPage.fromDateBox.click();
        userPage.fromDateEighthDay.click();
        logger.info("Kullanıcı seçtiği tarihi From Date kutusuna girdi");
    }

    @When("kullanıcı seçtiği tarihi To Date kutusuna girer")
    public void kullanıcı_seçtiği_tarihi_to_date_kutusuna_girer() {

        userPage.toDateBox.click();
        userPage.toDateFourteenthDay.click();
        logger.info("Kullanıcı seçtiği tarihi To Date kutusuna girdi");
    }

    @When("kullanıcı Search butonuna tıklar")
    public void kullanıcı_search_butonuna_tıklar() {

        userPage.invoicesSearchButton.click();
        logger.info("Kullanıcı Search butonuna tıkladı");
    }

    @Then("sadece seçtiği tarihler arasında tamamlanmış rezervasyonlara ait faturalar listelendiğini doğrular")
    public void sadece_seçtiği_tarihler_arasında_tamamlanmış_rezervasyonlara_ait_faturalar_listelenmelidir() {

        ReusableMethods.bekle(1000);
        Assertions.assertTrue(userPage.invoicesBookingDateVerification.isDisplayed());
        logger.info("Seçtiği tarih arasında tamamlanmış rezervasyonlara ait faturalar listelendiğini doğrulandı");
    }

    @When("kullanıcı Home butonuna tıklar")
    public void kullanıcı_home_butonuna_tıklar() {

        homePage.homeText.click();
        logger.info("kullanıcı Home butonuna tıkladı");

    }

    @Then("kullanıcı Home sayfasına geçiş yaptığını test eder")
    public void kullanıcı_home_sayfasına_geçiş_yaptığını_test_eder() {

        ReusableMethods.bekle(1000);
        Assertions.assertTrue(homePage.homeVerification.isDisplayed());
        logger.info("kullanıcı Home sayfasına geçiş yaptığını test edildi");
    }

    @Then("kullanıcı Dashboard sayfasına yönlendirilmeli")
    public void kullanıcı_dashboard_sayfasına_yönlendirilmeli() {

        basePage.click(userPage.sagUstProfilButonu);
        basePage.click(userPage.dropdownDashboardButonu);
        logger.info("Kullanıcı Dashboard sayfasına yönlendirildi");
    }

    @Then("Reviews ikonu görünür ve aktif olmalı")
    public void reviews_ikonu_görünür_ve_aktif_olmalı() {

        Assert.assertTrue(userPage.dashboardReviewsIcon.isDisplayed());
        Assert.assertTrue(userPage.dashboardReviewsIcon.isEnabled());
        logger.info("Reviews ikonu görünür ve aktif");
    }

    @Then("Reviews ikonuna tıklandığında ilgili sayfaya gittiğini test eder")
    public void reviews_ikonuna_tıklandığında_ilgili_sayfaya_gittiğini_test_eder() {

        userPage.dashboardReviewsIcon.click();
        Assert.assertTrue(userPage.dashboardReviewsTitle.isDisplayed());
        logger.info("Reviews ikonuna tıklandığında ilgili sayfaya gidildiği test edildi");
    }

    @Then("Reviews ikonuna tıklar")
    public void reviews_ikonuna_tıklar() {

        userPage.dashboardReviewsIcon.click();
        logger.info("Reviews ikonuna tıklandı");
    }

    @Then("Her bir yorum için yorum metni, tarih ve puan görünür olmalı")
    public void her_bir_yorum_için_yorum_metni_tarih_ve_puan_görünür_olmalı() {

        List<WebElement> yorumlar = driver.findElements(By.xpath("((//*[@class='review-info'])/p)[1]"));
        Assert.assertFalse("Hiç yorum bulunamadı.", yorumlar.isEmpty());

        for (WebElement yorum : yorumlar) {
            WebElement metin =yorum.findElement(By.xpath("(//*[@class='review-info'])[1]"));
            WebElement tarih = yorum.findElement(By.xpath("(//*[@class='review-date'])[1]"));
            WebElement puan = yorum.findElement(By.xpath("(//*[@class='rating'])[1]"));

            Assert.assertTrue(metin.isDisplayed());
            Assert.assertTrue(tarih.isDisplayed());
            Assert.assertTrue(puan.isDisplayed());
        }
        logger.info("Her bir yorum için yorum metni, tarih ve puan göründü");
    }



}
