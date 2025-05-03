package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProviderPage extends BasePage{

    public ProviderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[.='Logout']")
    public WebElement logoutButonu;

    @FindBy(xpath = "//*[@href='https://qa.onlinemastermarket.com/coupons']")
    public WebElement couponLinkinDashbordPage;

    @FindBy(xpath = "//*[@class='user-img']")
    public WebElement avatarDropdownMenü;

    @FindBy(xpath = "//*[.='Dashboard']")
    public WebElement avatarDashbordButtonu;

    @FindBy(xpath = "//*[@title='Select Service To Add Coupon']")
    public WebElement addCouponButton;

    @FindBy(xpath = "//*[@href='https://qa.onlinemastermarket.com/coupon-details']")
    public WebElement couponHistoryButton;

    @FindBy(xpath = "(//*[@id='couponsid'])[1]")
    public WebElement couponSelectCheckbox;

    @FindBy(id = "coupon_name")
    public WebElement couponNameTextBox;

    @FindBy(id = "user_limit")
    public WebElement couponUserLimit;

    @FindBy(id = "amount")
    public WebElement couponPriceType;

    @FindBy(id = "coupon_price")
    public WebElement couponPriceAmount;

    @FindBy(id = "start_date")
    public WebElement couponDate;

    @FindBy(id = "valid_days")
    public WebElement couponValidDays;

    @FindBy(id = "cdescription")
    public WebElement couponDescription;

    @FindBy(id = "submit_coupon")
    public WebElement couponSaveButton;

    @FindBy(xpath = "//*[@class='badge bg-success-light']")
    public WebElement newCouponName;

    @FindBy(xpath = "//*[@href='https://qa.onlinemastermarket.com/rewards']")
    public WebElement rewardLinkinDashbordPage;

    @FindBy(xpath = "//*[.='Add Rewards'][1]")
    public WebElement addRewardButton;

    @FindBy(id = "rdescription")
    public WebElement addRewardMessageTextBox;

    @FindBy(id = "submit_reward")
    public WebElement addRewardFormSubmitButton;

    @FindBy(xpath = "(//*[@class='badge bg-success-light'])[1]")
    public WebElement rewardCreatedSuccessLight;



}
