package stepdefinitions;

import config.DataReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;
import utils.ReusableMethods;

import java.security.Key;

public class LoginSteps {
	private static final Logger logger = LogManager.getLogger(LoginSteps.class);
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

		ReusableMethods.bekle(2500);
		homePage.anasayfaLoginButonu.click();

	}

	@Then("Login modalinde bulunan LOGIN ve {string} text'lerinin gorunur oldugu dogrulanir")
	public void login_modalinde_bulunan_logın_ve_text_lerinin_gorunur_oldugu_dogrulanir(String string) {
		ReusableMethods.bekle(1500);
		Assert.assertTrue(loginPage.loginModalMasterMarketText.isDisplayed());
		Assert.assertTrue(loginPage.loginModalLoginText.isDisplayed());
	}

	@And("Login modal'ında Email ID textboxi görünür ve aktif oldugu dogrulanmali")
	public void loginModalIndaEmailIDTextboxiGörünürVeAktifOlduguDogrulanmali() {

		Assert.assertTrue(loginPage.loginModalEmailIdTextBox.isDisplayed());
		Assert.assertTrue(loginPage.loginModalEmailIdTextBox.isEnabled());

	}



	@And("Login modalinda Login butonu'nun gorunur ve aktif oldugunu dogrular")
	public void loginModalindaLoginButonuNunGorunurVeAktifOldugunuDogrular() {
		ReusableMethods.bekle(2000);
		Assert.assertTrue(loginPage.loginModalLoginButonu.isEnabled());
		Assert.assertTrue(loginPage.loginModalLoginButonu.isDisplayed());

	}


	@Then("Login modalinda bir Email ID girilir")
	public void loginModalindaBirEmailIDGirilir() {

		ReusableMethods.bekle(500);

		basePage.type(loginPage.mailInput, DataReader.getData("yigitMail"));
		ReusableMethods.bekle(500);
		loginPage.mailInput.sendKeys(Keys.ENTER);
		ReusableMethods.bekle(300);
		loginPage.mailInput.sendKeys(Keys.ENTER);
		ReusableMethods.bekle(200);



	}


	@Then("Login modalinda bulunan login butonuna tiklanir")
	public void loginModalindaBulunanLoginButonunaTiklanir() {

		basePage.click(loginPage.loginPenceresiLoginButonu);
		ReusableMethods.bekle(5000);

	}



	@And("Login olunduğunda PASSWORD ve Verification your account text'leri gorunur oldugu dogrulanir")
	public void loginOlunduğundaPASSWORDVeVerificationYourAccountTextLeriGorunurOlduguDogrulanir() {

		Assert.assertTrue(loginPage.loginModalVerificationYourAccountText.isDisplayed());
		Assert.assertTrue(loginPage.loginModalPasswordText.isDisplayed());

	}

	@Then("Login modal'ında password textboxi görünür ve aktif oldugu dogrulanmali")
	public void loginModalIndaPasswordTextboxiGörünürVeAktifOlduguDogrulanmali() {

		Assert.assertTrue(loginPage.loginModalPasswordTextBox.isDisplayed());
		Assert.assertTrue(loginPage.loginModalPasswordTextBox.isEnabled());

	}

	@Then("Login modal'ında Enter butonu gorunur ve aktif oldugu dogrulanmali")
	public void loginModalIndaEnterButonuGorunurVeAktifOlduguDogrulanmali() {

		Assert.assertTrue(loginPage.loginModalEnterButonu.isEnabled());
		Assert.assertTrue(loginPage.loginModalEnterButonu.isDisplayed());

	}

	@And("Login modal'ında Click to Get Link linki gorunur ve aktif olmali.")
	public void loginModalIndaClickToGetLinkLinkiGorunurVeAktifOlmali() {

		Assert.assertTrue(loginPage.loginModalClicktoGetLink.isDisplayed());
		Assert.assertTrue(loginPage.loginModalClicktoGetLink.isEnabled());


	}

	@Then("Login modal'ında Email ID textboxina gecersiz email girilir")
	public void loginModalIndaEmailIDTextboxinaGecersizEmailGirilir() {

		loginPage.loginModalEmailIdTextBox.sendKeys("yemre.atmaca@gmail.com");

	}

	@Then("Login modalinda bulunan login butonuna tiklanir ve hata aldigi dogrulanir")
	public void loginModalindaBulunanLoginButonunaTiklanirVeHataAldigiDogrulanir() {

		loginPage.loginModalLoginButonu.click();
		ReusableMethods.bekle(3000);

	}

	@Then("Login modala gecersiz password girilir")
	public void loginModalaGecersizPasswordGirilir() {

		loginPage.loginModalPasswordTextBox.sendKeys("123456");

	}

	@And("Login modalinda Enter butonuna tiklanir ve hata mesaji alindigi dogrulanir")
	public void loginModalindaEnterButonunaTiklanirVeHataMesajiAlindigiDogrulanir() {

		loginPage.loginModalEnterButonu.click();

	}

	@Then("Login modalinda bulunan PASSWORD box'a gecerli PASSWORD girilir")
	public void loginModalindaBulunanPASSWORDBoxAGecerliPASSWORDGirilir() {

		loginPage.loginModalPasswordTextBox.sendKeys(config.DataReader.getData("userPass"));


	}


	@And("Login modalinda Enter butonuna tiklanir ve sisteme giris yapilabildigi dogrulanir")
	public void loginModalindaEnterButonunaTiklanirVeSistemeGirisYapilabildigiDogrulanir() {

		loginPage.loginModalEnterButonu.click();
		Assert.assertTrue(loginPage.siteBildirimSimgesi.isDisplayed());

	}

	@When("kullanıcı, {string} kullanıcı adı ve {string} şifresi ile giriş yapar")
	public void kullanıcı_kullanıcı_adı_ve_şifresi_ile_giriş_yapar(String email, String pass) {

		loginPage.login(email,pass);
		logger.info("Kullanıcı verilen kullanıcı adı ve şifre ile giriş yaptı");
	}
}
