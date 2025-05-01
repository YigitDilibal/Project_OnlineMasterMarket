package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.HomePage;
import pages.ProviderPage;
import pages.UserPage;
import utils.ReusableMethods;

public class ProviderSteps {

    WebDriver driver = stepdefinitions.Hooks.getDriver();
    ProviderPage providerPage = new ProviderPage (driver);
    UserPage userPage = new UserPage(driver);
    BasePage basePage = new BasePage(driver);
    HomePage homepage = new HomePage(driver);

    @Given("Provider hesabiyla giris yapilir")
    public void provider_hesabiyla_giris_yapilir() {


    }

    @When("Sag ustteki profil ikonuna tiklanir")
    public void sag_ustteki_profil_ikonuna_tiklanir() {

    }

    @Then("Menude {string} linkinin gorunup gorunmedigi kontrol edilir.")
    public void menude_linkinin_gorunup_gorunmedigi_kontrol_edilir(String string) {

    }

    @Then("{string} linkine tiklanir")
    public void linkine_tiklanir(String string) {

    }

    @Given("{string} sayfasina gidilir")
    public void sayfasina_gidilir(String string) {

    }

    @Then("Kisi arama cubugu gorunur ve aktif olmalidir")
    public void kisi_arama_cubugu_gorunur_ve_aktif_olmalidir() {

    }

    @Then("Arama cubuguna kisi yazilarak bulunabilir")
    public void arama_cubuguna_kisi_yazilarak_bulunabilir() {

    }

    @Then("Chat text box gorunur ve aktif olmalilidir")
    public void chat_text_box_gorunur_ve_aktif_olmalilidir() {

    }

    @Then("Text box'a yazi yazilabilir")
    public void text_box_a_yazi_yazilabilir() {

    }

    @Then("Submit butonu gorunur ve aktif olmalidir")
    public void submit_butonu_gorunur_ve_aktif_olmalidir() {

    }

    @Then("Submit butonuna tiklanarak mesaj gonderilebilir")
    public void submit_butonuna_tiklanarak_mesaj_gonderilebilir() {

    }

    @Then("the user clicks on the Profile icon")
    public void the_user_clicks_on_the_profile_icon() {
        basePage.click(userPage.sagUstProfilButonu);
    }
    @Given("the Logout button should be visible and clickable")
    public void the_logout_button_should_be_visible_and_clickable() {
        ReusableMethods.bekle(500);
        Assert.assertTrue(providerPage.logoutButonu.isDisplayed());
        Assert.assertTrue(providerPage.logoutButonu.isEnabled());
    }

    @When("the user clicks on the Logout link")
    public void the_user_clicks_on_the_logout_link() {
        basePage.click(providerPage.logoutButonu);
    }
    @Then("the user should be redirected to the login page")
    public void the_user_should_be_redirected_to_the_login_page() {
        Assert.assertTrue(homepage.anasayfaLoginButonu.isDisplayed());
    }

}
