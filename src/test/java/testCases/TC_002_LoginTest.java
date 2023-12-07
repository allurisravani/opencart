package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class TC_002_LoginTest extends BaseClass
{
	@Test(groups={"sanity","master"})
public void Verify_login()
{

		logger.info("Clicked on login");
	    logger.debug("capturing application debug logs ");
	try {
HomePage hp=new HomePage(driver);
hp.clickMyAccount();

logger.info("clicked on myaccount link");
hp.clickLogin(); //login link under myaccount
logger.info("clicked on login link");

//login page

LoginPage lp=new LoginPage(driver);
logger.info("Entering valid email and pwd");
lp.setEmail(p.getProperty("email"));
lp.setPwd(p.getProperty("pwd"));

lp.clickLogin();//login button
logger.info("Clicked on login");

//myaccount page
MyAccountPage macc=new MyAccountPage(driver);

boolean targetpage=macc.isMyAccountPageExits();

if(targetpage==true)
{
	logger.info("login test passed");
	Assert.assertTrue(true);
}
else
{
	logger.error("Login test failed");
	Assert.fail();
}
}
	catch(Exception e)
	{
		Assert.fail();
	}
logger.error("Login test finished");
}
}

