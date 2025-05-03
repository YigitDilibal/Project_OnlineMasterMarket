package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
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
import config.DataReader;
import io.cucumber.java.en.And;
import java.util.List;

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

    @And("the user accesses the dashboard page from the Avatar menu")
    public void theUserAccessesTheDashboardPageFromTheAvatarMenu() {
        providerPage.avatarDropdownMenü.click();
        providerPage.avatarDashbordButtonu.click();
    }
    @Then("the user verifies that the coupon link in the Dashboard menu is visible and active")
    public void theUserVerifiesThatTheCouponLinkInTheDashboardMenuIsVisibleAndActive() {
        Assert.assertTrue(providerPage.couponLinkinDashbordPage.isDisplayed());
        Assert.assertTrue(providerPage.couponLinkinDashbordPage.isEnabled());
    }
    @When("the user clicks on the coupon link in the Dashboard")
    public void theUserClicksOnTheCouponLinkInTheDashboard() {
        providerPage.couponLinkinDashbordPage.click();
    }
    @Then("the user verifies that the View Coupon History button is visible and active")
    public void theUserVerifiesThatTheViewCouponHistoryButtonIsVisibleAndActive() {
        Assert.assertTrue(providerPage.couponHistoryButton.isDisplayed());
        Assert.assertTrue(providerPage.couponHistoryButton.isEnabled());
    }
    @And("selects the checkbox of the service for which they want to create a coupon")
    public void selectsTheCheckboxOfTheServiceForWhichTheyWantToCreateACoupon() {
        providerPage.couponSelectCheckbox.click();
    }
    @Then("the user verifies that the Add Coupon button is active and accessible")
    public void theUserVerifiesThatTheAddCouponButtonIsActiveAndAccessible() {
        Assert.assertTrue(providerPage.addCouponButton.isEnabled());
        //   WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(20));
        providerPage.addCouponButton.click();
        //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dropdown-menu dropdown-menu-end']")));
    }
    @Then("the user clicks the Add Coupon button")
    public void theUserClicksTheAddCouponButton() {
        providerPage.addCouponButton.click();
    }
    @And("fills in the desired coupon information in the form that appears")
    public void fillsInTheDesiredCouponInformationInTheFormThatAppears() {
        providerPage.couponNameTextBox.sendKeys(DataReader.getData("couponName"));
        providerPage.couponUserLimit.sendKeys("5");
        providerPage.couponPriceType.click();
        providerPage.couponPriceAmount.sendKeys("25");
        providerPage.couponDate.click();
        providerPage.couponValidDays.sendKeys("12");
        providerPage.couponDescription.sendKeys("Use it when you want your home claean better :) ");
    }
    @And("clicks the Save button")
    public void clicksTheSaveButton() {
        providerPage.couponSaveButton.click();
    }
    @Then("the user verifies that the newly created coupon is visible in the list")
    public void theUserVerifiesThatTheNewlyCreatedCouponIsVisibleInTheList() {
        // ** 1.yol
        // String expectedCouponName ="PRO"+DataReader.getData("couponName".toUpperCase());
        //   String actualCouponName = providerPage.newCouponName.getText();
        //   Assert.assertEquals(expectedCouponName,actualCouponName);
        Assert.assertTrue(providerPage.newCouponName.isDisplayed());
    }
    @Given("the user verifies that the Rewards link in the Dashboard menu is visible and active")
    public void theUserVerifiesThatTheRewardsLinkInTheDashboardMenuIsVisibleAndActive() {
        Assert.assertTrue(providerPage.rewardLinkinDashbordPage.isDisplayed());
        Assert.assertTrue(providerPage.rewardLinkinDashbordPage.isEnabled());
    }
    @Given("the user clicks on the rewards link in the Dashboard")
    public void theUserClicksOnTheRewardsLinkInTheDashboard() {
        providerPage.rewardLinkinDashbordPage.click();
    }
    @Then("the user verifies that list of customers placing in orders and visible")
    public void theUserVerifiesThatListOfCustomersPlacingInOrdersAndVisible() {
        List<WebElement> satirElementleriList =
                driver.findElements(By.xpath("//tbody/tr"));
        Assert.assertTrue(satirElementleriList.size()>1);
        Assert.assertFalse(satirElementleriList.isEmpty());
    }
    @Then("the user verifies that the Add Reward button is visible and active")
    public void theUserVerifiesThatTheAddRewardButtonIsVisibleAndActive() {
        Assert.assertTrue(providerPage.addRewardButton.isDisplayed());
        Assert.assertTrue(providerPage.addRewardButton.isEnabled());
    }
    @When("the user click Add Reward button for preferred user")
    public void theUserClickAddRewardButtonForPreferredUser() {
        providerPage.addRewardButton.click();
    }
    @And("fills the reward form that appears for costumer")
    public void fillsTheRewardFormThatAppearsForCostumer() {
        providerPage.addRewardMessageTextBox.sendKeys("Congrats!");
    }
    @And("clicks the Add button")
    public void clicksTheAddButton() {
        providerPage.addRewardFormSubmitButton.click();
    }
    @Then("the user verifies that the newly created reward is visible in the list")
    public void theUserVerifiesThatTheNewlyCreatedRewardIsVisibleInTheList() {
        Assert.assertTrue(providerPage.rewardCreatedSuccessLight.isDisplayed());
        // "The user can also go to the history page and
        // verify the newly created reward by retrieving its message text."

    }











}
