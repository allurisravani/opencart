package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;

import pageObjects.HomePage;

public class TC_001_AccountRegistrationTest extends BaseClass{

	@Test(groups={"regression","master"})
	public void verify_account_registration()
	{
		logger.info("*** starting TC_001_AccountRegistrationTest ****");
		logger.debug("application logs..");
		try{
			
		
		HomePage hp=new HomePage(driver);
		
		hp.clickMyAccount();
		logger.info("clicked on my account link");
		hp.clickRegister();
		logger.info("clicked on my registration link");
		
		logger.info("Entering customer details");
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
		regpage.setFirstName(randomeString().toUpperCase());
		
		regpage.setLastName(randomeString().toUpperCase());
		regpage.setEmail(randomeString()+"@gmail.com");
		regpage.setTelephone(randomeNumber());
		
		String password=randomAlphaNumeric();
		
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		logger.info("clicked on continue");
		String confmsg=regpage.getConfirmationMsg();
		logger.info("validating expected msg");
		if(confmsg.equals("Your Account Has Been Created!"))
				{
					logger.info("test passed");
					Assert.assertTrue(true);
				}
				else
				{
					logger.error("test failed");
					Assert.fail();
				}
	Assert.assertEquals(confmsg, "Your Account Has Been Created!");	
			}
			catch(Exception e)
			{
				logger.error("test failed");
				logger.debug("debug logs");
						
						Assert.fail();
			}
	logger.info("***finish TC_001_AccountRegistrationTest ****");
	logger.debug("application logs end..");
	}
	
	
	
}
