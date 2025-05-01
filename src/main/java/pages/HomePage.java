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

    @FindBy (xpath = "//*[@class='btn search_service btn-banner']")
    public WebElement searchButonu;

    @FindBy (xpath = "//*[@name='common_search']")
    public WebElement aramaMotoru;

    @FindBy (xpath = "(//*[@href='https://qa.onlinemastermarket.com/service-preview/full-service-catering-per-person?sid=9bf31c7ff062936a96d3c8bd1f8f2ff3'])[1]")
    public WebElement FullServiceCatering;

    @FindBy (xpath = "//*[@href='https://qa.onlinemastermarket.com/service-preview/personalized-fitness-programs?sid=1ff1de774005f8da13f42943881c655f']")
    public WebElement PersonalizedFitnessPrograms;

    @FindBy (xpath = "(//*[@href='https://qa.onlinemastermarket.com/service-preview/full-house-cleaning?sid=c4ca4238a0b923820dcc509a6f75849b'])[1]")
    public WebElement FullHouseCleaning;








}
