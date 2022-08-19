package StepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class StepsYagaCucumber {
	public WebDriver driver;
	LoginPage lp=new LoginPage(driver);

	
	@Given("User lauch chrome browser")
	public void user_lauch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Pintueclipse-workspace\\YourLaga\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	    lp=new LoginPage(driver);
	}

	@Then("User browse application URL {string}")
	public void user_browse_application_url(String url) {
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	    
	}

	@Then("SignIn Link should display")
	public void sign_in_link_should_display() {
		
		if(lp.SignInlinkExist())
		{
			System.out.println("SingIn link is Present");
		}
		else
		{
			System.out.println("SingIn link  not  Present");
		}
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	}

	@Then("Loginpage Title should be {string}")
	public void loginpage_title_should_be(String expectedTitle) {
		
		System.out.println("HomePageTitle"  +driver.getTitle());
		if(driver.getTitle().equals(expectedTitle))
		{
			System.out.println("LoginPage Title match");
		}
		else
		{
			System.out.println("LoginPage Title doesnt match");
		}
	}

	@When("user clicks on SignIn link")
	public void user_clicks_on_sign_in_link() {
		lp.ClickOnSignIn();
	   
	}

	@When("Close Browser")
	public void close_browser() {
	    lp.CloseBrowser();
	}

	@Then("User enters emailaddress as {string} and password as {string}")
	public void user_enters_emailaddress_as_and_password_as(String email, String password) {
		lp.enterEmail(email);
		lp.enterPassword(password);
	    
	}

	@Then("User click on SignIn button")
	public void user_click_on_sign_in_button() {
	    lp.ClickOnLogin();
	}

	@Then("Home page title should be {string}")
	public void home_page_title_should_be(String expectedTitle) {
		
		System.out.println("HomePageTitle"  +driver.getTitle());
		if(driver.getTitle().contains(expectedTitle))
		{
			System.out.println("HomePage title is correct");
		}
		else
		{
			System.out.println("HomePage title is InCorrect");
		}
	   
	}

	
	
	@Then("User_clicks on_signoutlink")
	public void User_clicks_on_signoutlink() {
		lp.ClickOnSignout();
		
	   
	}

	@Then("LogoutPage title should be {string}")
	public void logout_page_title_should_be(String expectedTitle) {
	
		System.out.println("LogoutPageTitle"  +driver.getTitle());
		if(driver.getTitle().contains(expectedTitle))
		{
			System.out.println("LogoutPage title is correct");
		}
		else
		{
			System.out.println("LogoutPage title is InCorrect");
		}
	   
	    
	}

	@Then("Validation message should display as {string}")
	public void validation_message_should_display_as(String expectedMessage) {
		
		if(driver.getPageSource().contains(expectedMessage))
		{
			System.out.println("Validation message is correct");
		}
		else
		{
			System.out.println("Validation message is  Incorrect");
		}
	}

	@Then("User gets account Taglines")
	public void user_gets_account_taglines(DataTable dataTable) {
		List<String> expectedTagline=dataTable.asList();
	     System.out.println("EXpected tagline text:"  + expectedTagline);
	     
	     List<String> actualTagline=lp.getAccountTaglineText();
	     System.out.println("Actual tagline text:"  + actualTagline);
	     
	     if(actualTagline.containsAll(expectedTagline))
	     {
	    	 System.out.println("Tagline Match pass");
	     }
	     else
	     {
	    	 System.out.println("Tagline Match pass");
	     }
	}

}
