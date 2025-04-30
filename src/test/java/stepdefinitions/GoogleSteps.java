package stepdefinitions;

import config.DataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.GooglePage;

public class GoogleSteps {

    WebDriver driver = stepdefinitions.Hooks.getDriver();
    GooglePage googlePage = new GooglePage(driver);

    @Given("User is on the Google homepage")
    public void user_is_on_the_google_homepage() {

        driver.get(config.ConfigReader.getProperty("googleUrl"));
        System.out.println(DataReader.getData("testdata"));
    }

    @When("User searches for {string}")
    public void user_searches_for(String keyword) throws InterruptedException {
        googlePage.kabulEtButton.click();
        Thread.sleep(1000);
        googlePage.searchBox.sendKeys(keyword);
        googlePage.searchBox.submit(); // Google'da genelde Enter ile arama yapılır.
        Thread.sleep(2000);
    }

    @Then("Search results containing {string} are displayed")
    public void search_results_containing_are_displayed(String keyword) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue("Search result does not contain the keyword",
                googlePage.searchResult.getText().contains(keyword));
    }
}
