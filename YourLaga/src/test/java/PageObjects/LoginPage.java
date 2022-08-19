package PageObjects;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement signInlINK;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement emailAddress;
	@FindBy(xpath="//input[@id='passwd']")
	WebElement passWord;
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement loginButton;
	@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
	WebElement forgotPasswordlnk;
	
  // @FindBy(css="body.authentication.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 div.row div.col-xs-12.col-sm-6:nth-child(2) form.box div.form_content.clearfix p.lost_password.form-group:nth-child(3) > a:nth-child(1)")
  // WebElement forgotPasswordlnk;
   
  // @FindBy(linkText="Forgot your password?")
  // WebElement forgotPasswordlnk;
	@FindBy(xpath="//li[contains(text(),'Authentication failed.')]")
	WebElement  text;
	
	@FindBy(xpath="//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
	WebElement SignOut;
	
	@FindBy(xpath="//div[@class='row addresses-lists']")
	List<WebElement> tagline;
	
	public boolean SignInlinkExist()
	{
		boolean flag=signInlINK.isDisplayed();
		return flag;
		
	}
	
	public String getLoginPageTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	public void ClickOnSignIn()
	{
		signInlINK.click();
		WebDriverWait  wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(forgotPasswordlnk));
	}
	public void enterEmail(String email)
	
	{
			   
		//emailAddress.sendKeys(Keys.ENTER);
		emailAddress.sendKeys(email);
		//WebDriverWait wait=new  WebDriverWait(driver, 10);
	   // wait.until(ExpectedConditions.elementToBeClickable(passWord));
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
	    //js.executeScript("document.getElementById('email').value='email';");

		//emailAddress.sendKeys(email);
		
	}
	public void enterPassword(String password)
	{
		//passWord.click();
		 passWord.sendKeys("password");
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("document.getElementById('passwd').value='password';");
	     //WebDriverWait wait=new  WebDriverWait(driver, 10);
	     //wait.until(ExpectedConditions.elementToBeClickable(loginButton));
	}
	public boolean isPasswordLinkExist()
	{
		boolean flag=forgotPasswordlnk.isDisplayed();
		return flag;
	}
	public void ClickOnLogin()
	{
		loginButton.click();
		WebDriverWait  wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(SignOut));
	}
   public void ClickOnSignout()
   {
	   SignOut.click();  
   }
   public String ValidateErrorMessage()
   
   {
	   String message=driver.getPageSource();
	   return message;
   }
   public List<String> getAccountTaglineText()
   {
	   List<String> Tagtext=new ArrayList<String>();
	   
	   List<WebElement> tag=driver.findElements(By.xpath("//ul[@class='myaccount-link-list']/li"));
	   for(WebElement ele: tag)
	   {
		   String tagline=ele.getText();
		   System.out.println(tagline);
		   Tagtext.add(tagline);
	   }
	   return Tagtext;
   }
   public void CloseBrowser()
   {
	   driver.close();
   }
   public String homePageTitle()
	{
		String title=driver.getTitle();
		return title;
	}
   public String logoutPageTitle()
	{
		String title=driver.getTitle();
		return title;
	}
}
