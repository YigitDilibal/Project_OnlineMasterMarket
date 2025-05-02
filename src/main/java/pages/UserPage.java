package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage extends BasePage {

    public UserPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='user-img']")
    public WebElement sagUstProfilButonu;

    @FindBy(xpath = "//*[.='Dashboard']")
    public WebElement dropdownDashboardButonu;

    @FindBy(xpath = "//*[.='Payment']")
    public WebElement dashboardPaymentButonu;

    @FindBy(xpath = "(//*[.='Products'])[3]")
    public WebElement paymentHistoryProductButonu;

    @FindBy(xpath = "//*[.='Services']")
    public WebElement paymentHistoryServicesButonu;

    @FindBy(xpath = "//*[.='Provider Rejected']")
    public WebElement paymentProviderRejected;

    @FindBy(xpath = "//*[.='Payment Completed']")
    public WebElement paymentCompleted;

    @FindBy(xpath = "(//*[.='Name'])[1]")
    public WebElement paymentName;

    @FindBy(xpath = "(//*[.='Service'])[1]")
    public WebElement paymentService;

    @FindBy(xpath = "(//*[.='Products'])[4]")
    public WebElement paymentProducts;

    @FindBy(xpath = "(//*[.='Date'])[1]")
    public WebElement paymentDate;

    @FindBy(xpath = "(//*[.='Amount'])[1]")
    public WebElement paymentAmount;

    @FindBy(xpath = "(//*[.='Status'])[1]")
    public WebElement paymentStatus;

    @FindBy(xpath = "//*[.='Cancelled']")
    public WebElement orderCancelled;

    @FindBy(xpath = "//*[.='Delivered']")
    public WebElement orderDelivered;

    @FindBy(xpath = "//*[@type='search']")
    public WebElement PaymentSearch;








}
