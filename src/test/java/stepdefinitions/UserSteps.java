package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.HomePage;
import pages.UserPage;

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

    }

    @Then("Profil ikonu gorunur ve aktif olmalidir")
    public void profil_ikonu_gorunur_ve_aktif_olmalidir() {

    }

    @When("Profil ikonuna tiklanir")
    public void profil_ikonuna_tiklanir() {

    }

    @Then("{string} linki gorunur ve aktif olmalidir")
    public void linki_gorunur_ve_aktif_olmalidir(String string) {

    }

    @Given("Profil menusune gidilir")
    public void profil_menusune_gidilir() {

    }

    @When("{string} ikonuna tiklanir")
    public void ikonuna_tiklanir(String string) {

    }

    @Then("Dashboard sayfasina yonlendirilir")
    public void dashboard_sayfasina_yonlendirilir() {

    }

    @Given("Dashboard sayfasina gidilir")
    public void dashboard_sayfasina_gidilir() {

    }

    @Then("{string}, {string}, ve {string} kartlari gorunur olmalidir")
    public void ve_kartlari_gorunur_olmalidir(String string, String string2, String string3) {

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





}
