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

    @FindBy(xpath = "(//*[@class='nav-item'])[2]")
    public WebElement myServicesLink;

    @FindBy(xpath = "(//*[@class='nav-link active'])[2]")
    public WebElement activeServicesButton;

    @FindBy(xpath = "(//*[@class='nav-link'])")
    public WebElement inactiveServicesButton;

    @FindBy(xpath = "(//*[@class='si-delete-service text-danger'])[1]")
    public WebElement serviceInactivation;

    @FindBy(xpath = "(//*[@class='btn btn-success si_accept_confirm'])")
    public WebElement serviceInactivationConfirmation;

    @FindBy(xpath = "(//*[@class='text-success'])[1]")
    public WebElement editServiceFromMyServices;

    @FindBy(xpath = "(//*[@class='select2-selection__rendered'][1])")
    public WebElement serviceCategoryDropDown;

    @FindBy(xpath = "(//*[@class='select2-selection__rendered'][2])")
    public WebElement serviceSubCategoryDropDown;

    @FindBy(xpath = "(//*[@id='service_title'])")
    public WebElement serviceNameField;

    @FindBy(xpath = "(//*[@class='select2-selection__rendered'][3])")
    public WebElement serviceShopsDropDown;

    @FindBy(xpath = "(//*[@class='select2-selection__rendered'][4])")
    public WebElement serviceStaff;

    @FindBy(xpath = "(//*[@id='service_amount'])")
    public WebElement serviceAmountField;

    @FindBy(xpath = "(//*[@id='duration'])")
    public WebElement serviceDurationField;

    @FindBy(xpath = "(//*[@id='addi_name'])[1]")
    public WebElement additionalServicesName;

    @FindBy(xpath = "(//*[@id='addi_amnt'])[1]")
    public WebElement additionalServicesAmount;

    @FindBy(xpath = "(//*[@id='addi_dura'])[1]")
    public WebElement additionalServicesDuration;

    @FindBy(xpath = "(//*[@class='add-additional'])")
    public WebElement addMoreAdditionalServicesButton;

    @FindBy(xpath = "(//*[@id='about'])")
    public WebElement serviceDescriptionField;

    @FindBy(xpath = "(//*[@id='images'])")
    public WebElement serviceGalleryUploadImage;

    @FindBy(xpath = "(//*[@class='file_close1 btn btn-icon btn-danger btn-sm delete_img'])")
    public WebElement serviceGalleryDeleteImage;

    @FindBy(xpath = "(//*[@class='submit-section'])")
    public WebElement editServiceSubmit;

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

    @FindBy(xpath = "(//*[@class='categorie-img'])[1]")
    public WebElement serviceSelection;

    @FindBy(xpath = "(//*[@class='mb-0'])[1]")
    public WebElement serviceDetails;

    @FindBy(xpath = "(//*[@class='btn btn-primary btn-lg btn-block'])")
    public WebElement editServiceFromSelectedService;

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

    @FindBy(xpath = "//*[@href='https://qa.onlinemastermarket.com/service-offer-history']")
    public WebElement serviceOfferHistoryLink;

    @FindBy(xpath = "//th[text()='Service']")
    public WebElement serviceOfferServiceName;

    @FindBy(xpath = "//th[text()='Amount']")
    public WebElement serviceOfferServiceAmount;

    @FindBy(xpath = "//th[text()='Offer']")
    public WebElement serviceOfferServiceOffer;

    @FindBy(xpath = "//th[text()='Start Date']")
    public WebElement serviceOfferServiceStartDate;

    @FindBy(xpath = "//th[text()='End Date']")
    public WebElement serviceOfferServiceEndDate;

    @FindBy(xpath = "//th[text()='Time Range']")
    public WebElement serviceOfferServiceTimeRange;

    @FindBy(xpath = "//th[text()='Created Date']")
    public WebElement serviceOfferServiceCreatedDate;

    @FindBy(xpath = "(//*[@class='btn btn-sm bg-success-light editServiceOffers'])")
    public WebElement editOfferButton;

    @FindBy(xpath = "(//*[@class='form-control number eoffercls'])")
    public WebElement editOfferPercentageField;

    @FindBy(xpath = "(//*[@class='form-control datetimepicker-start eoffercls'])")
    public WebElement editOfferStartDate;

    @FindBy(xpath = "(//*[@class='form-control datetimepicker-end eoffercls'])")
    public WebElement editOfferEndDate;

    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public WebElement editOfferStartTime;

    @FindBy(xpath = "(//*[@class='form-control'])[2]")
    public WebElement editOfferEndTime;

    @FindBy(xpath = "(//*[@class='btn btn-success'])")
    public WebElement editOfferSave;

    @FindBy(xpath = "(//*[@class='far fa-trash-alt'])")
    public WebElement deleteOffer;

    @FindBy(xpath = "(//*[@class='btn btn-success si_accept_confirm'])")
    public WebElement deleteOfferConfirmation;

    @FindBy(xpath = "(//*[@href='https://qa.onlinemastermarket.com/provider-bookings'])[2]")
    public WebElement bookingListLink;

    @FindBy(xpath = "(//*[@class='form-control-sm custom-select searchFilter'])")
    public WebElement bookingListDropDown;

    @FindBy(xpath = "(//*[@class='btn btn-sm bg-success-light update_pro_booking_status'])[1]")
    public WebElement completeRequestToUser;

    @FindBy(xpath = "(//*[@class='btn btn-default'])[1]")
    public WebElement completeRequestToUserConfirmation;

    @FindBy(xpath = "(//*[@class='btn btn-sm bg-danger-light myCancel '])[1]")
    public WebElement cancelTheService;

    @FindBy(xpath = "(//*[@class='btn btn-theme py-2 px-4 text-white mx-auto btn-primary'])")
    public WebElement cancelTheServiceConfirmation;

    @FindBy(xpath = "(//*[@class='btn btn-sm bg-info-light'])[1]")
    public WebElement chatWithUser;

    @FindBy(xpath = "(//*[@class='form-control type_msg mh-auto empty_check'])")
    public WebElement chatMessageField;

    @FindBy(xpath = "(//*[@class='btn btn-primary btn_send'])")
    public WebElement chatSendButton;

    @FindBy(xpath = "(//span[text()='Booking Date'])[1]")
    public WebElement bookingDate;

    @FindBy(xpath = "(//span[text()='User'])[1]")
    public WebElement bookingListUser;

    @FindBy(xpath = "(//span[text()='Location'])[1]")
    public WebElement location;

    @FindBy(xpath = "(//span[text()='Staffs'])[1]")
    public WebElement staffs;


}
