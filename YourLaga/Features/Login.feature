Feature:  Login 

Scenario: Verify User able to login with Valid Credentials
Given User lauch chrome browser
Then User browse application URL "http://automationpractice.com/index.php"
Then SignIn Link should display
When user clicks on SignIn link
Then User enters emailaddress as "pradeep.pintu@gmail.com" and password as "welcome@123"
And  User click on SignIn button
And Home page title should be "My account - My Store "
And  Close Browser
