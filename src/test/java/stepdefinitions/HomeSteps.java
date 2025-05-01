package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.HomePage;
import utils.ReusableMethods;

import java.io.ObjectInputFilter;

public class HomeSteps {

    WebDriver driver = stepdefinitions.Hooks.getDriver();
    HomePage homePage = new HomePage(driver);
    BasePage basePage = new BasePage(driver);

    @Given("Kullanici {string} adresine gider.")
    public void kullanici_adresine_gider(String url) {

        driver.get(config.ConfigReader.getProperty("url"));

    }
    @Then("Siteye erişebildiğini doğrular.")
    public void siteye_erişebildiğini_doğrular() {

        String currentUrl = driver.getCurrentUrl();
        String expectedURL = config.ConfigReader.getProperty("url");

        Assert.assertEquals(currentUrl,expectedURL);

    }
    @Then("Title'in OnlineMasterMarket oldugunu dogrular.")
    public void title_in_online_master_market_oldugunu_dogrular() {

        String currentTitle = driver.getTitle();
        String expectedTitle = "OnlineMasterMarket";

        Assert.assertEquals(currentTitle,expectedTitle);

    }

    @Then("Anasayfada Shops butonunun gorunur ve aktif oldugu dogrulanir")
    public void anasayfada_shops_butonunun_gorunur_ve_aktif_oldugu_dogrulanir() {

        driver.get(config.ConfigReader.getProperty("url"));
        Assert.assertTrue(homePage.anasayfaShopsButonu.isDisplayed());
        Assert.assertTrue(homePage.anasayfaShopsButonu.isEnabled());


    }
    @Then("Anasayfada Categories butonunun gorunur ve aktif oldugu dogrulanir")
    public void anasayfada_categories_butonunun_gorunur_ve_aktif_oldugu_dogrulanir() {

        driver.get(config.ConfigReader.getProperty("url"));
        Assert.assertTrue(homePage.anasayfaCategoriesButonu.isDisplayed());
        Assert.assertTrue(homePage.anasayfaCategoriesButonu.isEnabled());


    }
    @Then("Anasayfada About US butonunun gorunur ve aktif oldugu dogrulanir")
    public void anasayfada_about_us_butonunun_gorunur_ve_aktif_oldugu_dogrulanir() {

        driver.get(config.ConfigReader.getProperty("url"));
        Assert.assertTrue(homePage.anasayfaAboutUSButonu.isDisplayed());
        Assert.assertTrue(homePage.anasayfaAboutUSButonu.isEnabled());

    }
    @Then("Anasayfada Contact US butonunun gorunur ve aktif oldugu dogrulanir")
    public void anasayfada_contact_us_butonunun_gorunur_ve_aktif_oldugu_dogrulanir() {

        driver.get(config.ConfigReader.getProperty("url"));
        Assert.assertTrue(homePage.anasayfaContactUSButonu.isDisplayed());
        Assert.assertTrue(homePage.anasayfaContactUSButonu.isEnabled());

    }
    @Then("Anasayfada Become a Professional butonunun gorunur ve aktif oldugu dogrulanir")
    public void anasayfada_become_a_professional_butonunun_gorunur_ve_aktif_oldugu_dogrulanir() {

        driver.get(config.ConfigReader.getProperty("url"));
        Assert.assertTrue(homePage.anasayfaBecomeAProfessionalButonu.isDisplayed());
        Assert.assertTrue(homePage.anasayfaBecomeAProfessionalButonu.isEnabled());

    }
    @Then("Anasayfada Become a User butonunun gorunur ve aktif oldugu dogrulanir")
    public void anasayfada_become_a_user_butonunun_gorunur_ve_aktif_oldugu_dogrulanir() {

        driver.get(config.ConfigReader.getProperty("url"));
        Assert.assertTrue(homePage.anasayfaBecomeAUserButonu.isDisplayed());
        Assert.assertTrue(homePage.anasayfaBecomeAUserButonu.isEnabled());

    }

    @And("Anasayfada Login butonunun gorunur aktif oldugu dogrulanir")
    public void anasayfadaLoginButonununGorunurAktifOlduguDogrulanir() {

        driver.get(config.ConfigReader.getProperty("url"));
        Assert.assertTrue(homePage.anasayfaLoginButonu.isDisplayed());
        Assert.assertTrue(homePage.anasayfaLoginButonu.isEnabled());

    }

    @Then("senkronizasyon icin {int} saniye bekler")
    public void senkronizasyonIcinSaniyeBekler(int arg0) {

        ReusableMethods.bekle(2);
    }

    @And("Site logosuna tiklaninca anasayfanın yenilendigini dogrular")
    public void siteLogosunaTiklanincaAnasayfanınYenilendiginiDogrular() {


        driver.get(config.ConfigReader.getProperty("url"));
        String beklenenUrl = "https://qa.onlinemastermarket.com/";
        String gelenUrl = driver.getCurrentUrl();
        homePage.anasayfaSiteLogosu.click();
        Assert.assertEquals(beklenenUrl,gelenUrl);




    }

    @Then("Site logosunun sayfanın sol üstünde bulundugunu dogrular")
    public void siteLogosununSayfanınSolÜstündeBulundugunuDogrular() {

        driver.get(config.ConfigReader.getProperty("url"));
        Point point = homePage.anasayfaSiteLogosu.getLocation();
        int x = point.getX();
        int y = point.getY();

        Assert.assertTrue(x<50);
        Assert.assertTrue(y<50);

    }


}
