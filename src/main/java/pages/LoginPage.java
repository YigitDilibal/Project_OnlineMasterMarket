package pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import config.DataReader;
import org.junit.Assert;
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



	@FindBy(id = "login_email")
    public WebElement mailInput;

	@FindBy(id = "emaillogin_submit")
    public WebElement loginPenceresiLoginButonu;

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

	@FindBy(xpath = "//button[@id='emaillogin_submit']")
	public WebElement loginModalLoginButonu;

	@FindBy(xpath = "//h3[.='Login']")
	public WebElement loginModalLoginText;

	@FindBy(xpath = "//*[.='Access to our Online Master Market']")
	public WebElement loginModalMasterMarketText;

	@FindBy(xpath = "//*[@placeholder='Enter EMail ID']")
	public WebElement loginModalEmailIdTextBox;

	@FindBy(xpath = "//h3[.='Password']")
	public WebElement loginModalPasswordText;

	@FindBy(xpath = "(//*[.='Verification your account'])[4]")
	public WebElement loginModalVerificationYourAccountText;

	@FindBy(xpath = "//*[@name='login_password']")
	public WebElement loginModalPasswordTextBox;

	@FindBy (xpath = "//button[@id='emailregistration_finals']")
	public WebElement loginModalEnterButonu;

	@FindBy (xpath = " //*[.=' Click to Get Link']")
	public WebElement loginModalClicktoGetLink;

	@FindBy (xpath = "//*[@class='feather-bell noti-icon']")
	public WebElement siteBildirimSimgesi;



}

