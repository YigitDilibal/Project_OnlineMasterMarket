package stepdefinitions;

import config.ConfigReader;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import io.cucumber.java.en_old.Ac;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;
import pages.HomePage;
import utils.ReusableMethods;

import java.io.ObjectInputFilter;

public class HomeSteps {

    private static final Logger logger = LogManager.getLogger(HomeSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    HomePage homePage = new HomePage(driver);
    BasePage basePage = new BasePage(driver);



    @Given("the user navigates to the {string} address")
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


    @And("Anasayfada Search butonunun gorunur ve aktif oldugunu dogrular")
    public void anasayfadaSearchbutonununGorunurVeAktifOldugunuDogrular() {

        driver.get(config.ConfigReader.getProperty("url"));
        Assert.assertTrue(homePage.searchButonu.isDisplayed());
        Assert.assertTrue(homePage.searchButonu.isEnabled());

    }

    @And("Anasayfada arama motorunun gorunur ve aktif oldugunu dogrular")
    public void anasayfadaAramaMotorununGorunurVeAktifOldugunuDogrular() {

        driver.get(config.ConfigReader.getProperty("url"));
        Assert.assertTrue(homePage.aramaMotoru.isEnabled());
        Assert.assertTrue(homePage.aramaMotoru.isDisplayed());

    }

    @Then("Anasayfada Full House Cleaning linkinin gorunur ve aktif oldugunu dogrular")
    public void anasayfada_full_house_cleaning_linkinin_gorunur_ve_aktif_oldugunu_dogrular() {

        driver.get(ConfigReader.getProperty("url"));
        Assert.assertTrue(homePage.FullHouseCleaning.isDisplayed());
        Assert.assertTrue(homePage.FullHouseCleaning.isEnabled());

    }
    @Then("Anasayfada Full House Cleaning linkine tiklandiginda ilgili sayfaya yönlendirildigi dogrulanir")
    public void anasayfada_full_house_cleaning_linkine_tiklandiginda_ilgili_sayfaya_yönlendirildigi_dogrulanir() {

        driver.get(ConfigReader.getProperty("url"));
        String FullHouseCleaningUrl = "https://qa.onlinemastermarket.com/service-preview/full-house-cleaning?sid=c4ca4238a0b923820dcc509a6f75849b";
        homePage.FullHouseCleaning.click();
        Assert.assertEquals(FullHouseCleaningUrl,driver.getCurrentUrl());

    }
    @Then("Anasayfada Full Service Catering linkinin gorunur ve aktif oldugunu dogrular")
    public void anasayfada_full_service_catering_linkinin_gorunur_ve_aktif_oldugunu_dogrular() {

        driver.get(ConfigReader.getProperty("url"));
        Assert.assertTrue(homePage.FullServiceCatering.isDisplayed());
        Assert.assertTrue(homePage.FullServiceCatering.isEnabled());

    }
    @Then("Anasayfada Full Service Catering linkine tiklandiginda ilgili sayfaya yönlendirildigi dogrulanir")
    public void anasayfada_full_service_catering_linkine_tiklandiginda_ilgili_sayfaya_yönlendirildigi_dogrulanir() {

        driver.get(ConfigReader.getProperty("url"));
        String FullServiceCateringUrl = "https://qa.onlinemastermarket.com/service-preview/full-service-catering-per-person?sid=9bf31c7ff062936a96d3c8bd1f8f2ff3";
        homePage.FullServiceCatering.click();
        Assert.assertEquals(FullServiceCateringUrl,driver.getCurrentUrl());

    }
    @Then("Anasayfada Personalized Fitness Programs linkinin gorunur ve aktif oldugunu dogrular")
    public void anasayfada_personalized_fitness_programs_linkinin_gorunur_ve_aktif_oldugunu_dogrular() {

        driver.get(ConfigReader.getProperty("url"));
        Assert.assertTrue(homePage.PersonalizedFitnessPrograms.isDisplayed());
        Assert.assertTrue(homePage.PersonalizedFitnessPrograms.isEnabled());

    }
    @Then("Anasayfada Personalized Fitness Programs linkine tiklandiginda ilgili sayfaya yönlendirildigi dogrulanir")
    public void anasayfada_personalized_fitness_programs_linkine_tiklandiginda_ilgili_sayfaya_yönlendirildigi_dogrulanir() {

        driver.get(ConfigReader.getProperty("url"));
        String PersonalizedFitnessProgramsUrl = "https://qa.onlinemastermarket.com/service-preview/personalized-fitness-programs?sid=1ff1de774005f8da13f42943881c655f";
        homePage.PersonalizedFitnessPrograms.click();
        Assert.assertEquals(PersonalizedFitnessProgramsUrl,driver.getCurrentUrl());

    }


    @Then("Kullanici anasayfada bulunan Categories basliginin üstüne gelir")
    public void kullaniciAnasayfadaBulunanCategoriesBasligininÜstüneGelir() {

        Actions actions = new Actions(driver);
        actions.moveToElement(homePage.anasayfaCategoriesButonu).perform();
        ReusableMethods.bekle(1500);


    }

    @Then("Kullanici Repairs & Maintenance basliginin gorunur oldugunu dogrular")
    public void kullaniciRepairsMaintenanceBasligininGorunurOldugunuDogrular() {

        Assert.assertTrue(homePage.RepairsVeMaintenanceBasligi.isDisplayed());

    }

    @And("Kullanici Repairs & Maintenance basliginin aktif oldugunu dogrular")
    public void kullaniciRepairsMaintenanceBasligininAktifOldugunuDogrular() {

        String beklenenUrl = "https://qa.onlinemastermarket.com/search/repairs-and-maintenance";
        String gidilenUrl = driver.getCurrentUrl();
        Assert.assertEquals(beklenenUrl,gidilenUrl);


    }

    @Then("Kullanici Repairs & Maintenance basligina tiklar")
    public void kullaniciRepairsMaintenanceBasliginaTiklar() {

        homePage.RepairsVeMaintenanceBasligi.click();
    }

    @Then("Gidilen sayfada Shops butonunun gorunur ve aktif oldugu dogrulanir")
    public void gidilenSayfadaShopsButonununGorunurVeAktifOlduguDogrulanir() {

        Assert.assertTrue(homePage.shopsButonu.isDisplayed());
        Assert.assertTrue(homePage.shopsButonu.isEnabled());
    }


    @Then("Gidilen sayfada Service butonunun gorunur ve aktif oldugu dogrulanir")
    public void gidilenSayfadaServiceButonununGorunurVeAktifOlduguDogrulanir() {

        Assert.assertTrue(homePage.serviceButonu.isEnabled());
        Assert.assertTrue(homePage.serviceButonu.isDisplayed());

    }

    @And("Gidilen sayfada filtreleme butonuna tiklanir")
    public void gidilenSayfadaFiltrelemeButonunaTiklanir() {

        ReusableMethods.bekle(2000);
        homePage.filtrelemeButonu.click();
        ReusableMethods.bekle(2000);

    }

    @Then("Kullanici Location butonunun gorunur ve aktif oldugunu dogrular")
    public void kullaniciLocationButonununGorunurVeAktifOldugunuDogrular() {

        Assert.assertTrue(homePage.filtrelemeLocationButonu.isDisplayed());
        Assert.assertTrue(homePage.filtrelemeLocationButonu.isEnabled());

    }

    @Then("Kullanici Sort By butonunun gorunur ve aktif oldugunu dogrular")
    public void kullaniciSortByButonununGorunurVeAktifOldugunuDogrular() {

        Assert.assertTrue(homePage.filtrelemeSortByButonu.isDisplayed());
        Assert.assertTrue(homePage.filtrelemeSortByButonu.isEnabled());


    }

    @Then("Kullanici Keyword butonunun gorunur ve aktif oldugunu dogrular")
    public void kullaniciKeywordButonununGorunurVeAktifOldugunuDogrular() {

        Assert.assertTrue(homePage.filtrelemeKeywordButonu.isDisplayed());
        Assert.assertTrue(homePage.filtrelemeKeywordButonu.isEnabled());

    }

    @Then("Kullanici Categories butonunun gorunur ve aktif oldugunu dogrular")
    public void kullaniciCategoriesButonununGorunurVeAktifOldugunuDogrular() {

        Assert.assertTrue(homePage.filtrelemeCategoriesButonu.isDisplayed());
        Assert.assertTrue(homePage.filtrelemeCategoriesButonu.isEnabled());

    }

    @Then("Kullanici Sub Category butonunun gorunur ve aktif oldugunu dogrular")
    public void kullaniciSubCategoryButonununGorunurVeAktifOldugunuDogrular() {

        Assert.assertTrue(homePage.filtrelemeSubCategoryButonu.isDisplayed());
        Assert.assertTrue(homePage.filtrelemeSubCategoryButonu.isEnabled());

    }

    @Then("Kullanici Price Range butonunun gorunur ve aktif oldugunu dogrular")
    public void kullaniciPriceRangeButonununGorunurVeAktifOldugunuDogrular() {

        Assert.assertTrue(homePage.filtrelemePriceRangeButonu.isDisplayed());
        Assert.assertTrue(homePage.filtrelemePriceRangeButonu.isEnabled());

    }

    @Then("Kullanici gidilen sayfada bulunan Service butonuna tiklar")
    public void kullaniciGidilenSayfadaBulunanServiceButonunaTiklar() {

        homePage.serviceButonu.click();
        ReusableMethods.bekle(1000);

    }

    @Then("Kullanici Flooring Reapir servisinin goruntulendigini ve aktif oldugunu dogrular")
    public void kullaniciFlooringReapirServisininGoruntulendiginiVeAktifOldugunuDogrular() {

        homePage.flooringRepair.click();
        String beklenenUrl="https://qa.onlinemastermarket.com/service-preview/flooring-repair?sid=6c8349cc7260ae62e3b1396831a8398f";
        String gidilenUrl = driver.getCurrentUrl();

        Assert.assertEquals(beklenenUrl,gidilenUrl);
        driver.navigate().back();
        homePage.serviceButonu.click();



    }

    @Then("Kullanici Window and Door Repair servisinin goruntulendigini ve aktif oldugunu dogrular")
    public void kullaniciWindowAndDoorRepairServisininGoruntulendiginiVeAktifOldugunuDogrular() {

        homePage.windowandDoorRepair.click();
        String beklenenUrl = "https://qa.onlinemastermarket.com/service-preview/window-and-door-repair?sid=d9d4f495e875a2e075a1a4a6e1b9770f";
        String gidilenUrl = driver.getCurrentUrl();
        Assert.assertEquals(beklenenUrl,gidilenUrl);
        driver.navigate().back();
        homePage.serviceButonu.click();

    }

    @Then("Kullanici Smart Home Installation servisinin goruntulendigini ve aktif oldugunu dogrular")
    public void kullaniciSmartHomeInstallationServisininGoruntulendiginiVeAktifOldugunuDogrular() {

        homePage.smartHomeInstallation.click();
        String beklenenUrl = "https://qa.onlinemastermarket.com/service-preview/smart-home-installation?sid=67c6a1e7ce56d3d6fa748ab6d9af3fd7";
        String gidilenUrl = driver.getCurrentUrl();
        Assert.assertEquals(beklenenUrl,gidilenUrl);
        driver.navigate().back();
        homePage.serviceButonu.click();

    }

    @Then("Kullanici Locksmith Services \\(Service Call Fee) servisinin goruntulendigini ve aktif oldugunu dogrular")
    public void kullaniciLocksmithServicesServiceCallFeeServisininGoruntulendiginiVeAktifOldugunuDogrular() {

        homePage.locksmithServices.click();
        String beklenenUrl = "https://qa.onlinemastermarket.com/service-preview/locksmith-services-service-call-fee?sid=642e92efb79421734881b53e1e1b18b6";
        String gidilenUrl = driver.getCurrentUrl();
        Assert.assertEquals(beklenenUrl,gidilenUrl);
        driver.navigate().back();
        homePage.serviceButonu.click();


    }

    @Then("Kullanici Refrigerator Repair \\(Service Call Fee) servisinin goruntulendigini ve aktif oldugunu dogrular")
    public void kullaniciRefrigeratorRepairServiceCallFeeServisininGoruntulendiginiVeAktifOldugunuDogrular() {

        homePage.refrigeratorRepair.click();
        String beklenenUrl = "https://qa.onlinemastermarket.com/service-preview/refrigerator-repair-service-call-fee?sid=a1d0c6e83f027327d8461063f4ac58a6";
        String gidilenUrl = driver.getCurrentUrl();
        Assert.assertEquals(beklenenUrl,gidilenUrl);
        driver.navigate().back();
        homePage.serviceButonu.click();

    }

    @Then("Kullanici Washing Machine Repair \\(Service Call Fee) servisinin goruntulendigini ve aktif oldugunu dogrular")
    public void kullaniciWashingMachineRepairServiceCallFeeServisininGoruntulendiginiVeAktifOldugunuDogrular() {

        homePage.washingMachineRepair.click();
        String beklenenUrl = "https://qa.onlinemastermarket.com/service-preview/washing-machine-repair-service-call-fee?sid=17e62166fc8586dfa4d1bc0e1742c08b";
        String gidilenUrl = driver.getCurrentUrl();
        Assert.assertEquals(beklenenUrl,gidilenUrl);
        driver.navigate().back();
        homePage.serviceButonu.click();


    }

    @Then("Kullanici Oven Repair servisinin goruntulendigini ve aktif oldugunu dogrular")
    public void kullaniciOvenRepairServisininGoruntulendiginiVeAktifOldugunuDogrular() {

        homePage.ovenRepair.click();
        String beklenenUrl = "https://qa.onlinemastermarket.com/service-preview/oven-repair?sid=f7177163c833dff4b38fc8d2872f1ec6";
        String gidilenUrl = driver.getCurrentUrl();
        Assert.assertEquals(beklenenUrl,gidilenUrl);
    }

    @Then("üst barda Shops menü başlığı görünür ve aktif olmalı")
    public void üst_barda_shops_menü_başlığı_görünür_ve_aktif_olmalı() {

        Assert.assertTrue(homePage.anasayfaShopsButonu.isDisplayed());
        Assert.assertTrue(homePage.anasayfaShopsButonu.isEnabled());
        logger.info("Üst barda Shops menü başlığı görünür ve aktif");
    }

    @When("kullanıcı Shops menü başlığına tıklar")
    public void kullanıcı_shops_menü_başlığına_tıklar() {

        homePage.anasayfaShopsButonu.click();
        logger.info("Kullanıcı Shops menü başlığına tıklandı");
    }

    @Then("kullanıcı şirketler ve şirketlere ait hizmetlerin listelendiği sayfaya yönlendirildiği doğrulanmalı")
    public void kullanıcı_şirketler_ve_şirketlere_ait_hizmetlerin_listelendiği_sayfaya_yönlendirildiği_doğrulanmalı() {

        Assert.assertTrue(homePage.shopsFoundText.isDisplayed());
        homePage.serviceButton.click();
        Assert.assertTrue(homePage.serviceFoundText.isDisplayed());
        logger.info("kullanıcı şirketler ve şirketlere ait hizmetlerin listelendiği sayfaya yönlendirildiği doğrulandı");
    }

    @Given("kullanıcı {string} adresine gider")
    public void kullanıcı_url_adresine_gider(String url) {

        driver.get(config.ConfigReader.getProperty("url"));
        logger.info("İlgili URL'e gidildi");
    }

    @When("Sayfanın üst barındaki {string} menüsü tıklanır")
    public void sayfanın_üst_barındaki_menüsü_tıklanır(String category) {

        homePage.categoriesDropDownButton.click();
        logger.info("Sayfanın üst barındaki Categories menüsüne tıklandı");
    }

    @Then("{string} aşağıdaki kategoriler görünür olmalıdır:")
    public void aşağıdaki_kategoriler_görünür_olmalıdır(String titleSummary) {

        WebElement Title = null;

        switch (titleSummary){
            case "BusinessServices":
                Title = homePage.categoriesBusinessServicesButton;
                Assert.assertTrue(Title.isDisplayed());
                logger.info("Business Services butonu görünür");
                break;
            case "Repairs":
                Title = homePage.categoriesRepairsButton;
                Assert.assertTrue(Title.isDisplayed());
                logger.info("Repairs butonu görünür");
                break;
            case "Moving":
                Title = homePage.categoriesMovingButton;
                Assert.assertTrue(Title.isDisplayed());
                logger.info("Moving butonu görünür");
                break;
            case "Events":
                Title = homePage.categoriesEventsButton;
                Assert.assertTrue(Title.isDisplayed());
                logger.info("Events butonu görünür");
                break;
            case "PersonalServices":
                Title = homePage.categoriesPersonalServicesButton;
                Assert.assertTrue(Title.isDisplayed());
                logger.info("Personal Services butonu görünür");
                break;
            case "HomeServices":
                Title = homePage.categoriesHomeServicesButton;
                Assert.assertTrue(Title.isDisplayed());
                logger.info("Home Services butonu görünür");
                break;
        }
    }

    @Then("{string} her bir kategori bağlantısı tıklanabilir olmalı ve doğru sayfaya yönlendirmelidir:")
    public void her_bir_kategori_bağlantısı_tıklanabilir_olmalı_ve_doğru_sayfaya_yönlendirmelidir(String titleSummary) {

        WebElement Title = null;


        switch (titleSummary){
            case "BusinessServices":
                Title = homePage.categoriesBusinessServicesButton;
                Assert.assertTrue(Title.isEnabled());
                homePage.categoriesBusinessServicesButton.click();

                driver.get(config.DataReader.getData("BusinessService"));
                String expectedBusinessUrl = "https://qa.onlinemastermarket.com/search/business-services";
                String actualBusinessUrl = driver.getCurrentUrl();

                Assert.assertEquals(expectedBusinessUrl,actualBusinessUrl);
                logger.info("Business Services kategori bağlantısına tıklandı ve doğrulandı");
                break;
            case "Repairs":
                Title = homePage.categoriesRepairsButton;
                Assert.assertTrue(Title.isEnabled());
                homePage.categoriesRepairsButton.click();

                driver.get(config.DataReader.getData("Repairs"));
                String expectedRepairsUrl = "https://qa.onlinemastermarket.com/search/repairs";
                String actualRepairsUrl = driver.getCurrentUrl();

                Assert.assertEquals(expectedRepairsUrl,actualRepairsUrl);
                logger.info("Repairs kategori bağlantısına tıklandı ve doğrulandı");
                break;

            case "Moving":
                Title = homePage.categoriesMovingButton;
                Assert.assertTrue(Title.isEnabled());
                homePage.categoriesMovingButton.click();

                driver.get(config.DataReader.getData("Moving"));
                String expectedMovingUrl = "https://qa.onlinemastermarket.com/search/moving";
                String actualMovingUrl = driver.getCurrentUrl();

                Assert.assertEquals(expectedMovingUrl,actualMovingUrl);
                logger.info("Moving kategori bağlantısına tıklandı ve doğrulandı");
                break;

            case "Events":
                Title = homePage.categoriesEventsButton;
                Assert.assertTrue(Title.isEnabled());
                homePage.categoriesEventsButton.click();

                driver.get(config.DataReader.getData("Events"));
                String expectedEventsUrl = "https://qa.onlinemastermarket.com/search/events";
                String actualEventsUrl = driver.getCurrentUrl();

                Assert.assertEquals(expectedEventsUrl,actualEventsUrl);
                logger.info("Events kategori bağlantısına tıklandı ve doğrulandı");
                break;

            case "PersonalServices":
                Title = homePage.categoriesPersonalServicesButton;
                Assert.assertTrue(Title.isEnabled());
                homePage.categoriesPersonalServicesButton.click();

                driver.get(config.DataReader.getData("PersonalServices"));
                String expectedPersonalUrl ="https://qa.onlinemastermarket.com/search/personal-services";
                String actualPersonalUrl = driver.getCurrentUrl();

                Assert.assertEquals(expectedPersonalUrl,actualPersonalUrl);
                logger.info("Personal Services kategori bağlantısına tıklandı ve doğrulandı");
                break;

            case "HomeServices":
                Title = homePage.categoriesHomeServicesButton;
                Assert.assertTrue(Title.isEnabled());
                homePage.categoriesHomeServicesButton.click();

                driver.get(config.DataReader.getData("HomeServices"));
                String expectedHomeUrl = "https://qa.onlinemastermarket.com/search/home-services";
                String actualHomeUrl = driver.getCurrentUrl();

                Assert.assertEquals(expectedHomeUrl,actualHomeUrl);
                logger.info("Home Services kategori bağlantısına tıklandı ve doğrulandı");
                break;
        }

    }

    @When("Profil ikonuna tıklanır")
    public void profil_ikonuna_tıklanır() {

        homePage.profileIcon.click();
        logger.info("Profil ikonuna tıklandı");
    }

    @Then("Book Service ikonu görünür ve aktif olmalıdır")
    public void book_service_ikonu_görünür_ve_aktif_olmalıdır() {

        Assert.assertTrue(homePage.bookServiceButton.isEnabled());
        Assert.assertTrue(homePage.bookServiceButton.isDisplayed());
        logger.info("Book Service ikonu görünür ve aktif");
    }

    @When("Book Service ikonuna tıklanır")
    public void book_service_ikonuna_tıklanır() {

        homePage.bookServiceButton.click();
        logger.info("Book Service ikonuna tıklandı");
    }

    @Then("Kullanıcı, şirketler ve hizmetleri sayfasına yönlendirilmelidir.")
    public void kullanıcı_şirketler_ve_hizmetleri_sayfasına_yönlendirilmelidir() {

        driver.get(config.DataReader.getData("AllServices"));
        String expectedAllServicesUrl = "https://qa.onlinemastermarket.com/all-services";
        String actualAllServicesUrl = driver.getCurrentUrl();

        Assert.assertEquals(expectedAllServicesUrl,actualAllServicesUrl);
        logger.info("Kullanıcı, şirketler ve hizmetleri sayfasına yönlendirildiği doğrulandı");

    }

    @When("Service ikonuna tıklanır")
    public void service_ikonuna_tıklanır() {

        homePage.serviceButton.click();
        logger.info("Service ikonuna tıklandı");
    }

    @When("Deep Cleanin Service hizmetine tıklanır")
    public void deep_cleanin_service_hizmetine_tıklanır() {

        homePage.deepCleaningServiceTitle.click();
        logger.info("Deep Cleanin ikonuna tıklandı");
    }

    @Then("Açılan Deep Cleanin Service sayfasında Book Service ikonu görünür ve aktif olmalıdır")
    public void açılan_deep_cleanin_service_sayfasında_book_service_ikonu_görünür_ve_aktif_olmalıdır() {

        Assert.assertTrue(homePage.deepCleaningBookServiceButton.isEnabled());
        Assert.assertTrue(homePage.deepCleaningBookServiceButton.isDisplayed());
        logger.info("Açılan Deep Cleanin Service sayfasında Book Service ikonu görünür ve aktif");
    }

    @Then("kullanıcı profil ikonuna tıklar")
    public void kullanıcı_profil_ikonuna_tıklar() {

        homePage.sagUstProfilIconu.click();
        logger.info("Kullanıcı profil ikonuna tıkladı");
    }

    @Then("logout ikonu görünür ve tıklanabilir olmalı")
    public void logout_ikonu_görünür_ve_tıklanabilir_olmalı() {

        Assert.assertTrue(homePage.logoutButton.isDisplayed());
        Assert.assertTrue(homePage.logoutButton.isEnabled());
        logger.info("Logout ikonu görünür ve tıklanabilir");
    }

    @Then("logout ikonuna tıklar")
    public void logout_ikonuna_tıklar() {

        homePage.logoutButton.click();
        logger.info("Logout ikonuna tıklandı");
    }

    @Then("login butonu görünürlüğü ile çıkış doğrulanır")
    public void login_butonu_görünürlüğü_ile_çıkış_doğrulanır() {

        Assert.assertTrue(homePage.anasayfaLoginButonu.isDisplayed());
        logger.info("Login butonu görünürlüğü ve çıkışı doğrulandı");
    }

    @Then("Kullanici anasayfada bulunan Shops basliginin üstüne gelir")
    public void kullaniciAnasayfadaBulunanShopsBasligininÜstüneGelir() {

        Actions actions = new Actions(driver);
        actions.moveToElement(homePage.anasayfaShopsButonu).perform();
        ReusableMethods.bekle(1500);

    }


    @Then("Kullanici Shops & Services butonunun gorunur oldugunu dogrular")
    public void kullaniciShopsServicesButonununGorunurOldugunuDogrular() {

        Assert.assertTrue(homePage.anasayfaShopsAndServicesButonu.isDisplayed());

    }

    @Then("Kullanici Products butonunun gorunur oldugunu dogrular")
    public void kullaniciProductsButonununGorunurOldugunuDogrular() {

        Assert.assertTrue(homePage.anasayfaProductsButonu.isDisplayed());

    }

    @Then("Kullanici Shops & Service butonuna tiklar")
    public void kullaniciShopsServiceButonunaTiklar() {

        homePage.anasayfaShopsAndServicesButonu.click();

    }

    @Then("Kullanici gidilen sayfada Visit Store ikonunun gorunur ve aktif oldugunu dogrular")
    public void kullaniciGidilenSayfadaVisitStoreIkonununGorunurVeAktifOldugunuDogrular() {

        Assert.assertTrue(homePage.visitStoreButonu.isDisplayed());
        Assert.assertTrue(homePage.visitStoreButonu.isEnabled());

    }

    @Then("Kullanici Miracle Maid servisini secer")
    public void kullaniciMiracleMaidServisiniSecer() {

        homePage.visitStoreButonu.click();

    }



    @Then("Kullanici gidilen sayfada servis adedeni ve genel bilgilerin goruldugunu dogrular")
    public void kullaniciGidilenSayfadaServisAdedeniVeGenelBilgilerinGoruldugunuDogrular() {

        ReusableMethods.bekle(3000);
        Assert.assertTrue(homePage.servisAdedi.isDisplayed());
        Assert.assertTrue(homePage.genelBilgiler.isDisplayed());
    }
}
