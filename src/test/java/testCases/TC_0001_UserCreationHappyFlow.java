package testCases;

import org.apache.commons.math3.analysis.function.Ulp;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.UserCreationPage2;
import pageObjects.clientDashboard;
import pageObjects.loginPage;
import pageObjects.userlistPage;
import testBases.baseClass;

public class TC_0001_UserCreationHappyFlow extends baseClass{
	
	@Test
	public void userCreationHappyFlow() {
		logger.info("***********happy flow user creation started ****************");
		try {
		logger.info("********login started ********");	
		loginPage lp = new loginPage(driver);
		lp.EnterUserName("godrejadmin1");
		lp.EnterPassword("1234");
		lp.Clicklogin();
		logger.info("********login successfull ********");	
		
		logger.info("********Successfully landed on Project dashboard ********");	
		clientDashboard cd = new clientDashboard(driver);
		cd.clickOnClient_Hamburger();
		cd.clickOnuseropt();
		
		logger.info("********Successfully landed on userlist page ********");	
		userlistPage ul = new userlistPage(driver);
		ul.ClickAddIcon();
		
		logger.info("********Successfully landed on user Creation page ********");	
		UserCreationPage2 uc = new UserCreationPage2(driver);
		uc.clk_usertype();
		uc.selopt_usertype_projectemployee();
		uc.enterGeneratedUserID();
		uc.txt_lastName();
		uc.EnterDesignation("wor");
		uc.selectdesignation();
		uc.email("godrejworker@gmail.com");
		uc.mobNum("6565858420");
		uc.altmobNum1("6565858421");
		uc.emergcontpersn("emergencyperson");
		uc.altmobnum2("6565858422");
		uc.dob("24-04-1990");
		uc.doj("10-01-2024");
		uc.uploadprofile();
		uc.dropdwnStatus();
		uc.userstatus();
		//Thread.sleep(5000);
		uc.dropdown_report_mangr();
		uc.select_report_mangr();
		uc.dropdwmdotmangr();
		uc.seldottedmanager();
		uc.dept("management");
		
		
		logger.info("***********start selecting all the module of project ******");
		uc.dropdwnProject();
		uc.selProjectName();
		uc.dropdownProjectModule();
		uc.scroll();
		//uc.selprojectmodule("Pro. Material");
		uc.selLocationMaster();
		uc.checkViewProject();
		uc.checkAddProject();
		uc.checkEditProject();
		uc.checkdel();
		uc.plusiconProjectlevel();
		uc.selpro2();
		uc.selsaf2();
		uc.selectProjectModule2();
		uc.promaterial();
		
		uc.selClientModule();
		uc.selDashboard();
		uc.selcompanyAdd();
		uc.selcompanyedit();
		uc.selcompanydel();
		uc.btnsave();
		//uc.formnotfilltoast();
		
		
		logger.info("******** click on save button and validate toast message********");
		
		userlistPage ulp = new userlistPage(driver);
		ulp.usersavedToastmessage();
		
		
		
		
		
		
		
		
		
		logger.info("*********** all the module of project are selected ******");
		
		Thread.sleep(5000);
		
		}
		catch(Exception e) {
			logger.error("Test failed",e);
			Assert.fail("Test failed due to exception");
		}
	}

}
