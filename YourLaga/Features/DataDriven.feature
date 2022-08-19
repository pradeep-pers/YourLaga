Feature: Datadriven test for login functionality

Scenario Outline: multiple login
Given User lauch chrome browser
Then User browse application URL "http://automationpractice.com/index.php"
And  user clicks on SignIn link
When User enters emailaddress as "<EmailAddress>" and password as "<Password>"
Then User click on SignIn button
And Home page title should be "account"


 Examples:
    |EmailAddress           | Password |
    |pradeep.pintu@gmail.com|welcome@123|
    