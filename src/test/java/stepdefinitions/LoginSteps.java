package stepdefinitions;

import config.DataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;
import utils.ReusableMethods;

public class LoginSteps {
	WebDriver driver = stepdefinitions.Hooks.getDriver();
	LoginPage loginPage = new LoginPage(driver);
	BasePage basePage = new BasePage(driver);
	HomePage homePage = new HomePage(driver);


	@Given("the user logs in with username {string} and password {string}")
	public void the_user_logs_in_with_username_and_password(String email, String pass) {

		loginPage.login(email,pass);

	}

	@Then("Anasayfada Login butonuna tiklar")
	public void anasayfadaLoginButonunaTiklar() {

		homePage.anasayfaLoginButonu.click();
		ReusableMethods.bekle(3000);

	}
}
