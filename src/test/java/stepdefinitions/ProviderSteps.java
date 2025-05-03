package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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


    @When("Sag ustteki profil ikonuna tiklanir")
    public void sag_ustteki_profil_ikonuna_tiklanir() {


        providerPage.click(providerPage.profilIkonu);

    }

    @Then("Menude {string} ikonu gorunup gorunmedigi kontrol edilir.")
    public void menudeIkonuGorunupGorunmedigiKontrolEdilir(String arg0) {

        Assert.assertTrue(providerPage.chatIkonu.isDisplayed());
        Assert.assertTrue(providerPage.chatIkonu.isEnabled());

    }

    @Then("{string} ikonuna tiklanir")
    public void linkine_tiklanir(String string) {

        providerPage.click(providerPage.chatIkonu);


    }

    @Given("{string} sayfasina gidilir")
    public void sayfasina_gidilir(String string) {

        Assert.assertTrue(providerPage.chatIkonu.isEnabled());
        providerPage.click(providerPage.chatIkonu);


    }

    @Then("Kisi arama cubugu gorunur ve aktif olmalidir")
    public void kisi_arama_cubugu_gorunur_ve_aktif_olmalidir() {

        Assert.assertTrue(providerPage.kisiAramaCubugu.isDisplayed());
        Assert.assertTrue(providerPage.kisiAramaCubugu.isEnabled());

    }

    @Then("Arama cubuguna kisi yazilarak bulunabilir")
    public void arama_cubuguna_kisi_yazilarak_bulunabilir() {

        Assert.assertTrue(providerPage.kisiAramaCubugu.isDisplayed());
        Assert.assertTrue(providerPage.kisiAramaCubugu.isSelected());

        WebElement searchBox = driver.findElement(By.id("searchBar"));
        searchBox.sendKeys(" ");


    }

    @Then("Chat text box gorunur ve aktif olmalilidir")
    public void chat_text_box_gorunur_ve_aktif_olmalilidir() {

        WebElement chatTextBox = driver.findElement(By.id("chatTextBox"));
        Assert.assertTrue(providerPage.chatTextBoxButon.isDisplayed());
        Assert.assertTrue(providerPage.chatTextBoxButon.isEnabled());

    }

    @Then("Text box'a yazi yazilabilir")
    public void text_box_a_yazi_yazilabilir() {

        WebElement chatTextBox = driver.findElement(By.id("chatTextBox"));
        chatTextBox.sendKeys("Merhaba, bu bir test mesajıdır.");

    }

    @Then("Submit butonu gorunur ve aktif olmalidir")
    public void submit_butonu_gorunur_ve_aktif_olmalidir() {

        Assert.assertTrue(providerPage.chatSubmitButton.isDisplayed());
        Assert.assertTrue(providerPage.chatSubmitButton.isEnabled());

    }

    @Then("Submit butonuna tiklanarak mesaj gonderilebilir")
    public void submit_butonuna_tiklanarak_mesaj_gonderilebilir() {

        Assert.assertTrue(providerPage.chatSubmitButton.isDisplayed());
        Assert.assertTrue(providerPage.chatSubmitButton.isSelected());

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
