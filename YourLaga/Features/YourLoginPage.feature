Feature: Your Laga Website Login Page

Background: 
Given User lauch chrome browser
Then User browse application URL "http://automationpractice.com/index.php"
Then SignIn Link should display


Scenario: Verify Application login Landing Page
Then Loginpage Title should be " Store"
When user clicks on SignIn link
And  Close Browser

  
Scenario: Verify User able to login with Valid Credentials
When user clicks on SignIn link
Then User enters emailaddress as "pradeep.pintu@gmail.com" and password as "welcome@123"
Then User click on SignIn button
And Home page title should be " account "
And  Close Browser


Scenario: Verify Logout
When user clicks on SignIn link
Then User enters emailaddress as "pradeep.pintu@gmail.com" and password as "welcome@123"
Then User click on SignIn button
And  User is on HomePage and clicks on signoutlink
Then LogoutPage title should be "Login - My Store"
And  Close Browser



Scenario: Verify Invalid login creadential using wrong password
When user clicks on SignIn link
Then User enters emailaddress as "pradeep.pintu@gmail.com" and password as "test@123"
And  User click on SignIn button
Then Validation message should display as "Invalid password."
And  Close Browser


Scenario: Verify Invalid login creadential using wrong emailaddress
When user clicks on SignIn link
Then User enters emailaddress as "pradeep.pintu" and password as "test@123"
And  User click on SignIn button
Then Validation message should display as "Invalid password."
And  Close Browser

Scenario: Verify Account Section should display the Tagline text 
When user clicks on SignIn link
Then User enters emailaddress as "pradeep.pintu@gmail.com" and password as "welcome@123"
And  User click on SignIn button
Then User gets account Taglines
|ORDER HISTORY AND DETAILS|
|MY CREDIT SLIPS|
|MY ADDRESSES|
|MY PERSONAL INFORMATION|
|MY WISHLISTS|
And  Close Browser