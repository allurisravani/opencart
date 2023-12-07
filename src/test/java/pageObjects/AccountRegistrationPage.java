package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountRegistrationPage extends BasePage {
	
	//WebDriver driver;
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}


@FindBy(xpath="//input[@id='input-firstname']") 
@CacheLookup private WebElement firstName;

@FindBy(xpath="//input[@id='input-lastname']") 
@CacheLookup private WebElement lastName;

@FindBy(xpath="//input[@id='input-email']") 
@CacheLookup private WebElement txtEMail;

@FindBy(xpath="//input[@id='input-telephone']")
@CacheLookup private WebElement telephone;

@FindBy(xpath="//input[@id='input-password']")
@CacheLookup private WebElement password;

@FindBy(xpath="//input[@id='input-confirm']") 
@CacheLookup private WebElement passwordConfirm;

@FindBy(xpath="//input[@name='agree']") 
@CacheLookup private WebElement chkdpolicy;

@FindBy(xpath="//input[@value='Continue']") 
@CacheLookup private WebElement btncontinue;
@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
@CacheLookup private WebElement msgConfirmation;


public void setFirstName(String fname)
{
	firstName.sendKeys(fname);
}

public void setLastName(String lname) {
	lastName.sendKeys(lname);

}

public void setEmail(String email) {
	txtEMail.sendKeys(email);

}

public void setTelephone(String tel) {
	telephone.sendKeys(tel);

}

public void setPassword(String pwd) {
	password.sendKeys(pwd);

}

public void setConfirmPassword(String pwd) {
	passwordConfirm.sendKeys(pwd);

}

public void setPrivacyPolicy() {
	chkdpolicy.click();

}


public void clickContinue()
{
	//method 1
    btncontinue.click();
	
	//method2
	//btncontinue.submit();
	
	/*method 3
	Actions act=new Actions(driver);
	act.moveToElement(btncontinue).click().perform();
	*/
	
	//method 4 //keyboard method
	//btncontinue.sendKeys(Keys.RETURN);
	
	//method 5
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	
	//js.executeScript("arguments[0].click();",btncontinue);
	
//	WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//mywait.until(ExpectedConditions.elementToBeClickable(btncontinue)).click();
	
}
	public String getConfirmationMsg() {
	
	try {
		
		return(msgConfirmation.getText());
		
	}
	
	catch(Exception e)
	{
		return(e.getMessage());
		
	}
	}
	}
	
	
	
	
	
	
	
	
	
	
	

