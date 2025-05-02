package pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import config.DataReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ReusableMethods;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	HomePage homePage = new HomePage(driver);
	BasePage basePage = new BasePage(driver);


	@FindBy(id = "login_email")
	private WebElement mailInput;

	@FindBy(id = "emaillogin_submit")
	private WebElement loginPenceresiLoginButonu;

	@FindBy(id = "login_password")
	private WebElement passwordInput;

	@FindBy(id = "emailregistration_finals")
	private WebElement enterButton;

	public void login(String email, String pass) {
		click(homePage.anasayfaLoginButonu);
		type(mailInput, DataReader.getData(email));
		ReusableMethods.bekle(300);
		mailInput.sendKeys(Keys.ENTER);
		ReusableMethods.bekle(200);
		click(loginPenceresiLoginButonu);
		type(passwordInput, DataReader.getData(pass));
		click(enterButton);
	}

}

