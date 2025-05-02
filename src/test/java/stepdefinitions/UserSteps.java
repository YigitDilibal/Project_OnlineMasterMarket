package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.UserPage;

public class UserSteps {

    WebDriver driver = stepdefinitions.Hooks.getDriver();
    BasePage basePage = new BasePage(driver);
    UserPage userPage = new UserPage(driver);

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
