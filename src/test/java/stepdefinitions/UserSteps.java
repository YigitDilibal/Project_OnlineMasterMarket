package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import pages.HomePage;
import pages.UserPage;
import utils.JSUtilities;
import utils.ReusableMethods;

public class UserSteps {

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
        Assert.assertTrue(userPage.paymentHistoryServicesButonu.isEnabled());
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

    }

    @When("{string} kartina tiklanir")
    public void kartina_tiklanir(String string) {

    }

    @Then("{string} kartina yonlendirilir")
    public void kartina_yonlendirilir(String string) {

    }

    @When("{string} linki veya logosuna tiklanir")
    public void linki_veya_logosuna_tiklanir(String string) {

    }

    @Then("Anasayfaya yonlendirilir")
    public void anasayfaya_yonlendirilir() {


    }


    @Then("{string} ikonu gorunur ve aktif olmalidir")
    public void ikonuGorunurVeAktifOlmalidir(String arg0) {
    }

    @Then("{string} sayfasina yonlendirilir")
    public void sayfasinaYonlendirilir(String arg0) {

    }

    @Given("Chat sayfasine gidilir")
    public void chatSayfasineGidilir() {

    }

    @Then("Ust barda Chat ikonu gorunur ve aktif olmalidir")
    public void ustBardaChatIkonuGorunurVeAktifOlmalidir() {

    }

    @Given("Ust bardaki chat ikonuna tiklanir")
    public void ustBardakiChatIkonunaTiklanir() {

    }

    @Then("{string} ve {string} linkleri gorunur ve aktif olmalidir")
    public void veLinkleriGorunurVeAktifOlmalidir(String arg0, String arg1) {

    }

    @Given("Chat menusune gidilir")
    public void chatMenusuneGidilir() {

    }

    @When("{string} tiklanir")
    public void tiklanir(String arg0) {

    }

    @Then("Chat sayfasina yonlendirilir")
    public void chatSayfasinaYonlendirilir() {
    }

    @Given("Chat sayfasina gidilir")
    public void chatSayfasinaGidilir() {

    }

    @Then("My Bookings sayfasina yonlendirilir")
    public void myBookingsSayfasinaYonlendirilir() {
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

    @Given("the User selects a Date")
    public void the_user_selects_a_date() {
        basePage.type(userPage.BookingDateInput, "16-05-2025");
        userPage.BookingDateInput.sendKeys(Keys.ENTER);
    }

    @Given("the User selects a Time Slot")
    public void the_user_selects_a_time_slot() {
        Select selectTime = new Select(userPage.SelectTimeSlotddm);
        selectTime.selectByValue("07:00 AM-07:50 AM");
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







}
