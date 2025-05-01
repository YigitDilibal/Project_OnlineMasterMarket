package stepdefinitions;

import config.DataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginSteps {
	WebDriver driver = stepdefinitions.Hooks.getDriver();
	LoginPage loginPage = new LoginPage(driver);

	@Given("the user logs in with username {string} and password {string}")
	public void the_user_logs_in_with_username_and_password(String email, String pass) {

		loginPage.login(email,pass);

	}

}
