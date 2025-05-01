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







}
