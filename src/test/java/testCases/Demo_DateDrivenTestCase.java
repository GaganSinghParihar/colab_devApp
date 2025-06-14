package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testBases.baseClass;

public class Demo_DateDrivenTestCase extends baseClass{



	/*@Test(dataProvider="LoginData", dataProviderClass=DataProvider.class) //getting data provider from different class if it is in same class then we don't need to import
	public void verify_loginDDT(String username, String pwd, String exp) // putting the header name
	{
	//HomePage
	HomePage hp=new HomePage (driver);
	hp.clickMyAccount();
	hp.clickLogin();
	//Login
	LoginPage lp=new LoginPage(driver);
	lp.setEmail(username);
	lp.setPassword(pwd); 
	lp.clickLogin();
	//MyAccount
	MyAccountPage macc=new MyAccount Page(driver); 
	boolean targetPage=macc.isMyAccountPageExists();
	

	Data is valid -login success - test pass logout
	 * 				login failed - test fail
	 * 
	 * 
	Data is invalid - login success - test fail
					login failed - test pass
	
	 

		if(exp.equalsIgnoreCase("Valid")) {
			if(targetPage==true)
			{
				macc.clickLogout();
				Assert.assertTrue(true);
				
			}
			else
		{
				Assert.assertTrue(false);
		}
		
			}
		*/
		
		
			
			
	
	}
	
	
		

