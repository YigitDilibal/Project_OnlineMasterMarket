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

    @FindBy(xpath ="(//*[@class='text-muted mb-0 text-truncate'])[1]")
    public WebElement dashboardBookingsButonu;

    @FindBy(xpath ="(//*[@class='text-muted mb-0 text-truncate'])[2]")
    public WebElement dashboardReviewsButonu;

    @FindBy(xpath ="(//*[@class='text-muted mb-0 text-truncate'])[3]")
    public WebElement dashboardNotificationsButonu;
  
    @FindBy(xpath = "//*[.='Deep Cleaning Service']")
    public WebElement DeepCleaningService;

    @FindBy(xpath = "//*[@id='go_book_service']")
    public WebElement BookServiceButton;

    @FindBy(xpath = "//*[@id='staff_id']")
    public WebElement SelectStaffddm;

    @FindBy(xpath = "//*[@id='bookingdate']")
    public WebElement BookingDateInput;

    @FindBy(xpath = "//*[@id='from_time']")
    public WebElement SelectTimeSlotddm;

    @FindBy(xpath = "//*[.='Confirm Booking']")
    public WebElement ConfirmBooking;

    @FindBy(xpath = "(//*[.='Cancel Booking'])[1]")
    public WebElement CancelBooking;

    @FindBy(xpath = "//*[.='Please Enter Date']")
    public WebElement PleaseEnterDate;

    @FindBy(xpath = "//*[.='Booking Available']")
    public WebElement BookingAvailable;

    @FindBy(xpath = "//*[.='okay']")
    public WebElement OkayButton;

    @FindBy(xpath = "//*[@id='submit_button_id']")
    public WebElement ProceedToPayment;

    @FindBy(xpath = "//*[@class='breadcrumb-item']")
    public WebElement homeButonu;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[7]")
    public WebElement chatIkonu;

    @FindBy(xpath = "//*[@class='feather-message-circle noti-icon']")
    public WebElement ustBarChatIkonu;

    @FindBy(xpath = "(//*[@class='topnav-dropdown-footer'])[2]")
    public WebElement ustBarChatIkonuViewAllButonu;

    @FindBy(xpath = "//*[@class='clear-noti chat_clear_all']")
    public WebElement ustBarChatIkonuClearAllButonu;

    @FindBy(xpath = "//a[@href='https://qa.onlinemastermarket.com/user-bookings' and text()='Booking']")
    public WebElement chatBookingButonu;

    @FindBy(xpath = "//*[@id='stripe']")
    public WebElement StripeButton;

    @FindBy(xpath = "//*[@class='my-0']")
    public WebElement CheckoutServiceName;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement PaymentWindowEmail;

    @FindBy(xpath = "//*[@id='card_number']")
    public WebElement PaymentWindowCardNumber;

    @FindBy(xpath = "//*[@id='cc-exp']")
    public WebElement PaymentWindowMMYY;

    @FindBy(xpath = "//*[@id='cc-csc']")
    public WebElement PaymentWindowCVC;

    @FindBy(xpath = "//*[@id='submitButton']")
    public WebElement PaymentWindowPayButton;

    @FindBy(xpath = "//*[.='Payment Success']")
    public WebElement PaymentSuccess;

    @FindBy(xpath = "//*[@class='swal-button swal-button--confirm']")
    public WebElement PaymentSuccessOkayButton;

    @FindBy(xpath = "(//*[@class='btn btn-sm bg-success-light'])[1]")
    public WebElement invoicesExportButton;

    @FindBy(xpath = "//*[@id='from_date']")
    public WebElement fromDateBox;

    @FindBy(xpath = "//*[@id='to_date']")
    public WebElement toDateBox;

    @FindBy(xpath = "(//*[@class='ui-state-default'])[7]")
    public WebElement fromDateEighthDay;

    @FindBy(xpath = "(//*[@class='ui-state-default'])[13]")
    public WebElement toDateFourteenthDay;

    @FindBy(xpath = "(//*[@class='fa fa-search'])[1]")
    public WebElement invoicesSearchButton;

    @FindBy(xpath = "(//*[@class='fa fa-times'])[1]")
    public WebElement invoicesDeleteButton;

    @FindBy(xpath = "(//*[text()='Booking Date'])[1]")
    public WebElement invoicesBookingDateVerification;

    @FindBy(xpath = "//*[@class='breadcrumb-item']")
    public WebElement homeText;

    @FindBy(xpath = "//*[@class='banner-head']/h3")
    public WebElement homeVerification;

    @FindBy(xpath = "//*[@class='far fa-calendar-alt']")
    public WebElement dashboardInvoices;

    @FindBy(xpath = "(//*[@class='breadcrumb-title'])[1]")
    public WebElement dashboardInvoicesTitle;

    @FindBy(xpath = "(//*[@class='breadcrumb-title'])/h2")
    public WebElement dashboardReviewsTitle;

    @FindBy(xpath = "(//*[@class='nav-item'])[2]")
    public WebElement dashboardReviewsIcon;

    @FindBy(xpath = "((//*[@class='review-info'])/p)[1]")
    public WebElement reviewsFirstComment;

    @FindBy(xpath = "(//*[@class='review-date'])[1]")
    public WebElement reviewsFirstDate;

    @FindBy(xpath = "(//*[@class='rating'])[1]")
    public WebElement reviewsFirstRating;











}
