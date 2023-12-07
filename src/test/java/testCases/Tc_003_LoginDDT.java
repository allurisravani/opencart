package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import utilities.DataProviders;

public class Tc_003_LoginDDT extends BaseClass

{
@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)

public void verify_loginDDt(String email,String pwd,String exp)
{
	logger.info("** starting Tc_003_loginddc");
	try {
	HomePage hp=new HomePage(driver);
	hp.clickMyAccount();
	hp.clickLogin();
	
	
	//login page
	LoginPage lp=new LoginPage(driver);
	lp.setEmail(email);
	lp.setPwd(pwd);
	lp.clickLogin();
	
	
	//account page
	
	MyAccountPage macc=new MyAccountPage(driver);
	boolean targetPage=macc.isMyAccountPageExits();
	if(exp.equalsIgnoreCase("Valid")) // if(exp.equals("Valid"))
	{
		if(targetPage==true)
		{
			macc.clicklogout();
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
	}
	}
	if(exp.equalsIgnoreCase("Invalid"))// if(exp.equals("Invalid"))
	{
		if(targetPage==true)
		{
			macc.clicklogout();
			Assert.assertTrue(false);
			
		}
		else
		{
			Assert.assertTrue(true);
	}
	}
	}
	catch(Exception e)
	{
		Assert.fail();
		
	}

	}
	}
