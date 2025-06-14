package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.UserCreationPage;
import pageObjects.clientDashboard;
import pageObjects.loginPage;
import pageObjects.userlistPage;
import testBases.baseClass;

public class TC_0000_UserCreation_Demo extends baseClass{


	@Test
	public void create_new_user() throws InterruptedException {
		
		logger.info("****** starting test***********");
		logger.info("This is an info message");
        logger.error("This is an error message");
		try
		{
		loginPage lp  =new loginPage(driver);
		lp.EnterUserName("godrejadmin1");
		lp.EnterPassword("1234");
		lp.Clicklogin();
		
		clientDashboard  cb = new clientDashboard(driver);
		Thread.sleep(2000);
		cb.clickOnClient_Hamburger();
		cb.clickOnuseropt();
		
		logger.info("*********************         validating messages   ***************8");
		userlistPage ulp= new userlistPage(driver);
		ulp.ClickAddIcon();
		
		
		UserCreationPage uc = new UserCreationPage(driver);
		
		System.out.println("Test");
		
	
		uc.clk_usertype();
		uc.select_usertype();
		uc.EnterUserID("godrejworker05");
		uc.EnterFirstName("godrejworker05firstname");
		uc.EnterLastName("godrejworker05lasstname");
		uc.EnterDesignation("wor");
		uc.selectdesignation();
		uc.email("godrejworker01@gmail.com");
		uc.mobNum("6565858420");
		uc.emergcontpersn("emerperson");
		uc.altmobNum1("6565858421");
		uc.altmobnum2("6565858422");
		uc.dob("21-05-1990");
		uc.doj("19-01-2010");	
		uc.dropdwnStatus();
		uc.uploadprofile();
		uc.userstatus();
		uc.scroll();
		uc.dropdown_report_mangr();
		uc.select_report_mangr();
		uc.dropdwmdotmangr();
		uc.seldottedmanager();
		uc.dept("management");
		uc.dropdwnProject();
		uc.selProjectName();
		System.out.println("ProjectName selected");
		uc.dropdownProjectModule();
		System.out.println("project module");
		uc.selprojectmodule("location");
		uc.selLocationMaster();
		uc.checkAddProject();
		uc.checkEditProject();
		//uc.click_save();
		//Thread.sleep(5000);
		//ulp.usersavedToastmessage();
		

		
		Thread.sleep(5000);
		//selectPastDate("April","22","1994")
	}
		catch(Exception e) {
		    logger.error("Test failed", e);
		    Assert.fail("Test failed due to exception: " + e.getMessage());
		}
		
	}
	

}

