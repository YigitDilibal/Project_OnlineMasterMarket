Feature: US_046 Payment History Page Functionality (User)
  # User story: As a registered user (User), I want to have a field where I can see my payment history.

  Background: Login and navigate to Dashboard
    Given the user navigates to the "url" address
    When the user logs in with username "yigitMail" and password "userPass"
    Then the user should be redirected to the Dashboard page

    Scenario: Payment link is visible and navigates to Payment History
      Given the Payment link should be visible and clickable in the sidebar
      Then the user clicks the Payment link
      And the user should be navigated to the Payment History page


    Scenario: Services and Products buttons are visible and functional
      Given the user clicks the Payment link
      Then the Services button should be visible and clickable
      And the Products button should be visible and clickable

    Scenario: Paid and rejected services are listed with all necessary details
      Given the user clicks the Payment link
      Then the services with status Paid or Rejected should be displayed
      And each service should include Name, Service, Date, Amount, and Status

    Scenario: Delivered and canceled products are listed with all necessary details
      Given the user clicks the Payment link
      When the user clicks the Products tab
      Then the products with status Delivered or Canceled should be displayed
      And each product should include Name, Product, Date, Amount, and Status

    Scenario: Search functionality works correctly in Services and Products sections
      Given the user clicks the Payment link
      When the Search button should be visible and active in the Services tab
      And the user enters a service name and clicks Search
      Then the matching service results should be displayed

      When the user clicks the Products tab
      Then the Search button should be visible and active in the Products tab
      When the user enters a product name and clicks Search
      Then the matching product results should be displayed

    Scenario: User can go back to Home page from Payment History page
      Given the user clicks the Payment link
      When the user clicks the Home button
      Then the user should be redirected to the Home page

      Scenario: User completes service request.
        Given the user clicks the Booking List link
        Then the user clicks Complete Request Accept button
        And the user clicks Confirm button
        And the user clicks Okay button




