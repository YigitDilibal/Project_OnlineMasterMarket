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

    @FindBy (xpath = "(//*[.='Home Services'])[3]")
    public WebElement anasayfaHomeServicesButonu;

    @FindBy (xpath = "//a[.='Repairs & Maintenance']")
    public WebElement RepairsVeMaintenanceBasligi;

    @FindBy (xpath = "(//a[.='Shops'])[2]")
    public WebElement shopsButonu;

    @FindBy (xpath = "//*[.='Service']")
    public WebElement serviceButonu;

    @FindBy (xpath = "(//img[@class='me-2'])[3]")
    public WebElement filtrelemeButonu;

    @FindBy (xpath = "//*[@class='form-control location pac-target-input']")
    public WebElement filtrelemeLocationButonu;

    @FindBy (xpath = "(//span[@class='select2-selection__rendered'])[1]")
    public WebElement filtrelemeSortByButonu;

    @FindBy (xpath = "(//span[@class='select2-selection__rendered'])[2]")
    public WebElement filtrelemeCategoriesButonu;

    @FindBy (xpath = "(//span[@class='select2-selection__rendered'])[3]")
    public  WebElement filtrelemeSubCategoryButonu;

    @FindBy (xpath = "//*[@class='form-control common_search location']")
    public WebElement filtrelemeKeywordButonu;

    @FindBy (xpath = "//*[@class='ui-slider-range ui-corner-all ui-widget-header']")
    public WebElement filtrelemePriceRangeButonu;

    @FindBy (xpath = "(//img[@alt='Service Image'])[1]")
    public WebElement flooringRepair;

    @FindBy (xpath = "(//img[@alt='Service Image'])[2]")
    public WebElement windowandDoorRepair;

    @FindBy (xpath = "(//img[@alt='Service Image'])[3]")
    public WebElement smartHomeInstallation;

    @FindBy (xpath = "(//img[@alt='Service Image'])[4]")
    public WebElement locksmithServices;

    @FindBy (xpath = "(//img[@alt='Service Image'])[5]")
    public WebElement refrigeratorRepair;

    @FindBy (xpath = "(//img[@alt='Service Image'])[6]")
    public WebElement washingMachineRepair;

    @FindBy (xpath = "(//img[@alt='Service Image'])[7]")
    public WebElement ovenRepair;

    @FindBy(xpath = "//*[@class='breadcrumb-item']")
    public WebElement homeText;

    @FindBy(xpath = "//*[@class='banner-head']/h3")
    public WebElement homeVerification;

    @FindBy(xpath = "//*[@id='services-tab']")
    public WebElement serviceButton;

    @FindBy(xpath = "(//*[@class='counts'])[1]")
    public WebElement shopsFoundText;

    @FindBy(xpath = "(//*[@class='counts'])[2]")
    public WebElement serviceFoundText;

    @FindBy(xpath = "(//*[@class='fas fa-chevron-down'])[2]")
    public WebElement categoriesDropDownButton;

    @FindBy(xpath = "((//*[@class='submenu'])[2]/li)[6]")
    public WebElement categoriesHomeServicesButton;

    @FindBy(xpath = "((//*[@class='submenu'])[2]/li)[4]")
    public WebElement categoriesEventsButton;

    @FindBy(xpath = "((//*[@class='submenu'])[2]/li)[5]")
    public WebElement categoriesPersonalServicesButton;

    @FindBy(xpath = "((//*[@class='submenu'])[2]/li)[1]")
    public WebElement categoriesBusinessServicesButton;

    @FindBy(xpath = "((//*[@class='submenu'])[2]/li)[2]")
    public WebElement categoriesRepairsButton;

    @FindBy(xpath = "((//*[@class='submenu'])[2]/li)[3]")
    public WebElement categoriesMovingButton;

    @FindBy(xpath = "//*[@class='user-img']")
    public WebElement profileIcon;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[4]")
    public WebElement bookServiceButton;

    @FindBy(xpath = "(//*[@class='featute-info'])[1]/h4/a")
    public WebElement deepCleaningServiceTitle;

    @FindBy(xpath = " //*[@id='go_book_service']")
    public WebElement deepCleaningBookServiceButton;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[8]")
    public WebElement logoutButton;

    @FindBy(xpath = "//*[@class='user-img']")
    public WebElement sagUstProfilIconu;


}
