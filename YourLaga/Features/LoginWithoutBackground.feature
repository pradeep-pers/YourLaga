Feature: Your Laga Website Login Page


Scenario: Verify Application login Landing Page
Given User lauch chrome browser
Then User browse application URL "http://automationpractice.com/index.php"
Then SignIn Link should display
Then Loginpage Title should be "My Store"
And  Close Browser

  
Scenario: Verify User able to login with Valid Credentials
Given User lauch chrome browser
Then User browse application URL "http://automationpractice.com/index.php"
Then SignIn Link should display
When user clicks on SignIn link
Then User enters emailaddress as "pradeep.pintu@gmail.com" and password as "welcome@123"
And  User click on SignIn button
And Home page title should be "My account - My Store "
And  Close Browser


Scenario: Verify Logout
Given User lauch chrome browser
Then User browse application URL "http://automationpractice.com/index.php"
Then SignIn Link should display
When user clicks on SignIn link
Then User enters emailaddress as "pradeep.pintu@gmail.com" and password as "welcome@123"
And  User click on SignIn button
And  User clicks on signoutlink
Then LogoutPage title should be "Login - My Store"
And  Close Browser



Scenario: Verify Invalid login creadential using wrong password
Given User lauch chrome browser
Then User browse application URL "http://automationpractice.com/index.php"
Then SignIn Link should display
When user clicks on SignIn link
Then User enters emailaddress as "pradeep.pintu@gmail.com" and password as "welcome@"
And  User click on SignIn button
Then Validation message should display as "Invalid password."
And  Close Browser


Scenario: Verify Invalid login creadential using wrong emailaddress
Given User lauch chrome browser
Then User browse application URL "http://automationpractice.com/index.php"
Then SignIn Link should display
When user clicks on SignIn link
Then User enters emailaddress as "pradeep.pintu" and password as "test@123"
And  User click on SignIn button
Then Validation message should display as "Invalid email address."
And  Close Browser

Scenario: Verify Account Section should display the Tagline text 
Given User lauch chrome browser
Then User browse application URL "http://automationpractice.com/index.php"
Then SignIn Link should display
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