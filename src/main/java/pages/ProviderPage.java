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

    @FindBy(xpath = "//*[@class='dropdown-item'])[9]")
    public WebElement chatIkonu;

    @FindBy(xpath = "//*[@id='search_chat_list']")
    public WebElement kisiAramaCubugu;

    @FindBy(xpath = "//*[@id='chat-message']")
    public WebElement chatTextBoxButon;

    @FindBy(xpath= "//*[@class='user-img']")
    public WebElement profilIkonu;

    @FindBy(xpath = "//*[@id='submit']")
    public WebElement chatSubmitButton;

    @FindBy(xpath = "//*[.='Dashboard']")
    public WebElement dashboardButton;

    @FindBy(xpath = "//*[@class='card'])[3]")
    public WebElement myServicesProvider;

    @FindBy(xpath = "//*[@href='https://qa.onlinemastermarket.com/provider-reviews']")
    public WebElement reviewsLinkinDashbordPage;

    @FindBy(xpath = "//*[@href='https://qa.onlinemastermarket.com/provider-payment']")
    public WebElement paymentLinkinDashbordPage;

    @FindBy(xpath = "//*[@type='search']")
    public WebElement searchBoxinPaymentsPage;

    @FindBy(xpath = "(//*[@class='sorting'])[4]")
    public WebElement amountSortingınPaymentsPage;

    @FindBy(xpath = "(//*[@class='nav-link active'])[2]")
    public WebElement activeServicesButton;

    @FindBy(xpath = "(//*[@class='nav-link'])")
    public WebElement inactiveServicesButton;

    @FindBy(xpath = "(//*[@class='si-delete-service text-danger'])[1]")
    public WebElement serviceInactivation;

    @FindBy(xpath = "(//*[@class='btn btn-success si_accept_confirm'])")
    public WebElement serviceInactivationConfirmation;

    @FindBy(xpath = "((//*[@class='btn btn-info btn-sm'])[1]")
    public WebElement applyOfferButton;

    @FindBy(xpath = "(//*[@class='form-control number offercls'])")
    public WebElement offerPercentageField;

    @FindBy(xpath = "(//*[@class='form-control datetimepicker-start offercls'])")
    public WebElement startDate;

    @FindBy(xpath = "(//*[@class='form-control datetimepicker-end offercls'])")
    public WebElement endDate;

    @FindBy(xpath = "(//*[@class='form-control form-select offercls'])[1]")
    public WebElement startTime;

    @FindBy(xpath = "(//*[@class='form-control form-select offercls'])[2]")
    public WebElement endTime;

    @FindBy(xpath = "(//*[@class='btn btn-success'])[1]")
    public WebElement offerSave;

    @FindBy(xpath = "(//*[@class='mb-0'])[1]")
    public WebElement serviceDetails;

    @FindBy(xpath = "(//*[@class='btn btn-primary btn-lg btn-block'])")
    public WebElement editServiceButton;

    @FindBy(xpath = "(//*[@class='label-amount'])")
    public WebElement priceInformation;

    @FindBy(xpath = "(//*[@class='ser-provider-name'])")
    public WebElement serviceProviderName;

    @FindBy(xpath = "(//*[@class='card-body'])[3]")
    public WebElement serviceAvailability;

    @FindBy(xpath = "(//*[@class='service-card'])[2]")
    public WebElement additionalServices;

    @FindBy(xpath = "(//*[@class='service-card'])[3]")
    public WebElement serviceReviews;

    @FindBy(xpath = "(//*[@class='card-body'])[4]")
    public WebElement serviceGallery;

    @FindBy(xpath = "(//*[@class='card-title service-related'])")
    public WebElement relatedServices;


}
