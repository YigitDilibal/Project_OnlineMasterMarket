package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='btn btn-signin']")
    public WebElement anasayfaLoginButonu;

    @FindBy (xpath = "//*[.='Shops']")
    public WebElement anasayfaShopsButonu;

    @FindBy (xpath = "//*[.='Categories ']")
    public WebElement anasayfaCategoriesButonu;

    @FindBy (xpath = "//*[.='About US']")
    public WebElement anasayfaAboutUSButonu;

    @FindBy (xpath = "//*[.='Contact US']")
    public WebElement anasayfaContactUSButonu;

    @FindBy (xpath = "//*[.='Become a Professional']")
    public WebElement anasayfaBecomeAProfessionalButonu;

    @FindBy (xpath = "//*[.='Become a User']")
    public WebElement anasayfaBecomeAUserButonu;

    @FindBy (xpath = "(//*[@alt='Logo'])[1]")
    public WebElement anasayfaSiteLogosu;








}
