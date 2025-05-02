package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.UserPage;

public class UserSteps {

    WebDriver driver = stepdefinitions.Hooks.getDriver();
    BasePage basePage = new BasePage(driver);
    UserPage userPage = new UserPage(driver);

    @Then("the user should be redirected to the Dashboard page")
    public void the_user_should_be_redirected_to_the_dashboard_page() {
        basePage.click(userPage.sagUstProfilButonu);
        basePage.click(userPage.dropdownDashboardButonu);
    }

    @Given("the Payment link should be visible and clickable in the sidebar")
    public void the_payment_link_should_be_visible_and_clickable_in_the_sidebar() {

        Assert.assertTrue(userPage.dashboardPaymentButonu.isDisplayed());
        Assert.assertTrue(userPage.dashboardPaymentButonu.isEnabled());
    }

    @Then("the user clicks the Payment link")
    public void the_user_clicks_the_link() {

        basePage.click(userPage.dashboardPaymentButonu);

    }
    @Then("the user should be navigated to the Payment History page")
    public void the_user_should_be_navigated_to_the_payment_history_page() {

        Assert.assertTrue(userPage.paymentHistoryProductButonu.isDisplayed());
    }

    @Then("the Services button should be visible and clickable")
    public void the_services_button_should_be_visible_and_clickable() {
        Assert.assertTrue(userPage.paymentHistoryServicesButonu.isDisplayed());
        Assert.assertTrue(userPage.paymentHistoryServicesButonu.isEnabled());
    }
    @Then("the Products button should be visible and clickable")
    public void the_products_button_should_be_visible_and_clickable() {
        Assert.assertTrue(userPage.paymentHistoryProductButonu.isDisplayed());
        Assert.assertTrue(userPage.paymentHistoryProductButonu.isEnabled());
    }

    @Then("the services with status Paid or Rejected should be displayed")
    public void the_services_with_status_or_should_be_displayed() {
        Assert.assertTrue(userPage.paymentProviderRejected.isDisplayed());
        Assert.assertTrue(userPage.paymentCompleted.isDisplayed());

    }
    @Then("each service should include Name, Service, Date, Amount, and Status")
    public void each_service_should_include_name_service_date_amount_and_status() {
        Assert.assertTrue(userPage.paymentName.isDisplayed());
        Assert.assertTrue(userPage.paymentService.isDisplayed());
        Assert.assertTrue(userPage.paymentDate.isDisplayed());
        Assert.assertTrue(userPage.paymentAmount.isDisplayed());
        Assert.assertTrue(userPage.paymentStatus.isDisplayed());
    }

    @When("the user clicks the Products tab")
    public void the_user_clicks_the_tab() {
        basePage.click(userPage.paymentHistoryProductButonu);
    }
    @Then("the products with status Delivered or Canceled should be displayed")
    public void the_products_with_status_or_should_be_displayed() {


    }
    @Then("each product should include Name, Product, Date, Amount, and Status")
    public void each_product_should_include_name_product_date_amount_and_status() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the {string} button should be visible and active in the Services tab")
    public void the_button_should_be_visible_and_active_in_the_services_tab(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user enters a service name and clicks {string}")
    public void the_user_enters_a_service_name_and_clicks(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the matching service results should be displayed")
    public void the_matching_service_results_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the {string} button should be visible and active in the Products tab")
    public void the_button_should_be_visible_and_active_in_the_products_tab(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user enters a product name and clicks {string}")
    public void the_user_enters_a_product_name_and_clicks(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the matching product results should be displayed")
    public void the_matching_product_results_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user clicks the {string} button")
    public void the_user_clicks_the_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user should be redirected to the Home page")
    public void the_user_should_be_redirected_to_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




}
