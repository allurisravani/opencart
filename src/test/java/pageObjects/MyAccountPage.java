package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage 
{

	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	@CacheLookup private WebElement msgheading;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") 
	@CacheLookup private WebElement linklogout;
	
	public boolean isMyAccountPageExits()
	{
		try {
			return( msgheading.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
	}
	
	public void clicklogout()
	{
		linklogout.click();
	}
}
