package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class HomeSteps {

    WebDriver driver = stepdefinitions.Hooks.getDriver();
    HomePage homePage = new HomePage(driver);

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

}
