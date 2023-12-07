package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	//WebDriver driver;
	
public HomePage(WebDriver driver)
{
	super(driver);
}


@FindBy(xpath="//span[@class='caret']")
@CacheLookup private WebElement myAccount;
@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']") 
@CacheLookup private WebElement register;
@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']") 
@CacheLookup private WebElement linklogin;

public void clickMyAccount()
{
	myAccount.click();
}

public void clickRegister()
{
	register.click();
}

public void clickLogin()
{
	linklogin.click();
}
}
