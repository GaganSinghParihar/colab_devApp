package pageObjects;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UserCreationPage2 extends BasePage{
	
	WebDriver driver;
	
	public UserCreationPage2(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	

@FindBy(xpath="//span[normalize-space()='Select User Type']") 
WebElement selectUserType;

@FindBy(xpath="//span[normalize-space()='Project Employee']") 
WebElement sel_usertype_projectEmployee;

@FindBy(xpath="//li[@aria-label='Owner']") 
WebElement sel_usertype_owner;

@FindBy(xpath="//span[@class='ng-tns-c56-18 p-dropdown-label p-inputtext p-placeholder ng-star-inserted']") 
WebElement selectAgency;

@FindBy(xpath="//span[normalize-space()='PriVariVendor1CompanyName']") 
WebElement priVariVendor1CompanyName;

@FindBy(xpath="//input[@placeholder='User ID']") 
WebElement userID;

@FindBy(xpath="//input[@placeholder='Name']") 
WebElement firstname;

@FindBy(xpath="//input[@placeholder='last_name']")
WebElement lastName;

@FindBy(xpath="//p-autocomplete[@formcontrolname='designation']//input[@role='searchbox']") 
WebElement searchbox_Designation;


@FindBy(xpath="//li[@role='option']") 
WebElement selectdesig;

@FindBy(xpath="//span[contains(text(),'worker')]")
WebElement worker;

@FindBy(xpath="//input[@placeholder='Email ID']") 
WebElement emailID;

@FindBy(xpath="//input[@placeholder='Mobile Number']") 
WebElement mobileNumber;

@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-users[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[9]/div[2]/input[1]") 
WebElement atlMobileNumber1;

@FindBy(xpath="//input[@placeholder='Emergency Contact Person']") 
WebElement emergencyContactPerson;

@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-users[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[11]/div[2]/input[1]") 
WebElement atlMobileNumber2;

@FindBy(xpath="//p-calendar[@formcontrolname='dob']//input[@type='text']") 
WebElement dateOfBirth;

@FindBy(xpath="//p-calendar[@formcontrolname='doj']//input[@type='text']") 
WebElement dateOfJoining;

@FindBy(xpath="//input[@type='file']") 
WebElement profileImage;

@FindBy(xpath="//span[normalize-space()='Select Status']") 
WebElement drpdwnStatus;


@FindBy(xpath="//li[@aria-label='Active']") 
WebElement selectStatus;

@FindBy(xpath= "//div[contains(text(),'Primary Reporting Manager')]") 
WebElement ele;

@FindBy(xpath="//span[normalize-space()='Primary Reporting Manager']") 
WebElement primaryReportingManager;

@FindBy(xpath="//li[@aria-label='godrejadmin1']") 
WebElement selectnreportingManagername;

@FindBy(xpath="//p-multiselect[@formcontrolname='dotted_rm']//div//div//span") 
WebElement dropdwnDottedReportedManager;

@FindBy(xpath="//li[@aria-label='Contractor1FirstName']")
WebElement SelDottedmanager;

@FindBy(xpath="//p-autocomplete[@formcontrolname='department']//input[@role='searchbox']") 
WebElement searchbox_Department;

@FindBy(xpath="//p-dropdown[@id='project']//div//div[@role='button']")
WebElement drpdwnProjectname;

@FindBy(xpath="//span[normalize-space()='Godrej Astra']")
WebElement selProject;

@FindBy(xpath="//tbody/tr/td[3]/p-dropdown[1]/div[1]/div[2]/span[1]") 
WebElement drpdwnProjectModule;

@FindBy(xpath="//body/div/div/div/input[1]")
WebElement projectMod;

@FindBy(xpath="//li[@aria-label='Location Master']")
WebElement location_Master;

@FindBy(xpath="//input[@id='exampleCheck2']") 
WebElement Chk_view_projectModule;

@FindBy(xpath="//body[1]/app-root[1]/app-users[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/input[1]") 
WebElement Chk_add_projectModule;

@FindBy(xpath="//body[1]/app-root[1]/app-users[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/input[1]") 
WebElement Chk_edit_projectModule;

@FindBy(xpath="//input[@id='exampleCheck4']") 
WebElement Chk_delete;

@FindBy(xpath="//div[@formgroupname='usersDetails']//i[@aria-hidden='true']") 
WebElement plusIcon_ProjectLevel;

//webElement of projectmodule
@FindBy(xpath="//li[@aria-label='Pro. Material Master']") 
WebElement proMaterialMaster;

@FindBy(xpath="//li[@aria-label='Pro. E&M Master']") 
WebElement proEMMaster;

@FindBy(xpath="//span[normalize-space()='Pro. Labour Work Master']") 
WebElement proLabourWorkMaster;

@FindBy(xpath="//span[normalize-space()='Project BOQ']") 
WebElement projectBOQ;

@FindBy(xpath="//span[normalize-space()='Location Master']") 
WebElement locationMaster;

@FindBy(xpath="//span[normalize-space()='Project Activities']") 
WebElement projectActivities;

@FindBy(xpath="//span[normalize-space()='Quantity Master']") 
WebElement quantityMaster;

@FindBy(xpath="//span[normalize-space()='Material Template']") 
WebElement materialTemplate;

@FindBy(xpath="//span[normalize-space()='Rate Analysis Template']") 
WebElement rateAnalysisTemplate;

@FindBy(xpath="//span[normalize-space()='Rate Analysis']") 
WebElement rateAnalysis;

@FindBy(xpath="//span[normalize-space()='Work Orders']") 
WebElement workOrders;

@FindBy(xpath="//span[normalize-space()='Supply Labour Master']") 
WebElement supplyLabourMaster;

@FindBy(xpath="//span[normalize-space()='Vendor Free Issue Material']") 
WebElement vendorFreeIssueMaterial;

@FindBy(xpath="//span[normalize-space()='Labour Attendance']") 
WebElement labourAttendance;

@FindBy(xpath="//span[normalize-space()='Add Progress']") 
WebElement addProgress;

@FindBy(xpath="//span[normalize-space()='Tower Summary']") 
WebElement towerSummary;

@FindBy(xpath="//span[normalize-space()='Checklist Category']") 
WebElement checklistCategory;

@FindBy(xpath="//span[normalize-space()='Project Dashboard']") 
WebElement projectDashboard;

@FindBy(xpath="//span[normalize-space()='Hindrance']") 
WebElement hindrance;

@FindBy(xpath="//span[normalize-space()='Activity Tag']") 
WebElement activityTag;

@FindBy(xpath="//span[normalize-space()='Task']") 
WebElement task;

@FindBy(xpath="//span[normalize-space()='Meeting']") 
WebElement meeting;

@FindBy(xpath="//span[normalize-space()='360 Image']") 
WebElement i360Image;

@FindBy(xpath="//span[normalize-space()='Permit Configuration']") 
WebElement permitConfiguration;

@FindBy(xpath="//span[normalize-space()='Permit']") 
WebElement permit;

@FindBy(xpath="//span[normalize-space()='Gantt Master Chart']") 
WebElement ganttMasterChart;

@FindBy(xpath="//span[normalize-space()='Snag Master']")
WebElement snagMaster;

@FindBy(xpath="//span[normalize-space()='Area Of Concern']") 
WebElement areaOfConcern;

@FindBy(xpath="//span[normalize-space()='Gantt Calendar Schedule']") 
WebElement ganttCalendarSchedule;

@FindBy(xpath="//span[normalize-space()='Inspection Checklist']") 
WebElement inspectionChecklist;

@FindBy(xpath="//span[normalize-space()='Checklist Configuration']") 
WebElement checklistConfiguration;

@FindBy(xpath="//span[normalize-space()='Store']") 
WebElement store;

@FindBy(xpath="//span[normalize-space()='Gate In']") 
WebElement gateIn;

@FindBy(xpath="//span[normalize-space()='Request Resource']") 
WebElement requestResource;

@FindBy(xpath="//span[normalize-space()='Viewpoint Master']") 
WebElement viewpointMaster;

@FindBy(xpath="//span[normalize-space()='Drawing Master']") 
WebElement drawingMaster;

@FindBy(xpath="//span[normalize-space()='Reports']") 
WebElement reports;

@FindBy(xpath="//span[normalize-space()='Safety Induction']") 
WebElement safetyInduction;

@FindBy(xpath="//span[normalize-space()='Tendering']") 
WebElement tendering;

@FindBy(xpath="//span[normalize-space()='Vendor KPI']") 
WebElement vendorKPI;

@FindBy(xpath="//span[normalize-space()='MIR']") 
WebElement mIR;

@FindBy(xpath="//span[normalize-space()='Material checklist']") 
WebElement materialChecklist;

@FindBy(xpath="//span[normalize-space()='Store In']") 
WebElement storeIn;

@FindBy(xpath="//span[normalize-space()='Billing']") 
WebElement billing;

@FindBy(xpath="//span[normalize-space()='Project Hightlights']") 
WebElement projectHightlights;

@FindBy(xpath="//span[normalize-space()='Document Manager']") 
WebElement documentManager;

@FindBy(xpath="//span[normalize-space()='Rewards']") 
WebElement rewards;

@FindBy(xpath="//span[normalize-space()='Add Badges']") 
WebElement addBadges;

@FindBy(xpath="//span[normalize-space()='Labour File Tracking']") 
WebElement labourFileTracking;

//==========================

@FindBy(xpath="//body[1]/app-root[1]/app-users[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/p-dropdown[1]/div[1]/span[1]") 
WebElement selectProject2;

@FindBy(xpath="//span[normalize-space()='Saffron Residency']") 
WebElement saffronResidency2;

@FindBy(xpath="//tbody/tr[2]/td[3]/p-dropdown[1]/div[1]/span[1]") 
WebElement selpromod2;

@FindBy(xpath="//span[normalize-space()='Select Client Module']") 
WebElement selectClientModule;

@FindBy(xpath="//li[@aria-label='Dashboard']//span[contains(text(),'Dashboard')]") 
WebElement dashboard;

@FindBy(xpath="//body[1]/app-root[1]/app-users[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/input[1]") 
WebElement exampleCheck5;

@FindBy(xpath="//body[1]/app-root[1]/app-users[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/input[1]") 
WebElement exampleCheck7;

@FindBy(xpath="//body[1]/app-root[1]/app-users[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/input[1]") 
WebElement exampleCheck8;

@FindBy(xpath="//button[normalize-space()='Save']") 
WebElement save;

@FindBy(xpath="//span[normalize-space()='Form is not properly Filled']") 
WebElement formIsNotProperlyFilled;

public void clk_usertype() {
	selectUserType.click();
	
}

public void selopt_usertype_projectemployee() {
	sel_usertype_projectEmployee.click();
}

public void selopt_usertype_owner() {
	sel_usertype_owner.click();
}

public void clk_agency() {
	selectAgency.click();
}

public void sel_agency() {
	priVariVendor1CompanyName.click();
}

// **************************new user id creation method start *****************
private static final String PREFIX = "godrejworker";
private static final String FILE_PATH = "counter.txt";

/**
 * This method generates a new User ID like 'privariworker+01', 'privariworker+02', etc.
 * and enters it in the User ID input field.
 */
public void enterGeneratedUserID() {
    int counter = getNextCounter();
    String formattedCounter = String.format("%02d", counter);  // Converts 1 to 01, 2 to 02
    String generatedUserID = PREFIX + formattedCounter;

    userID.clear();  // Clear input box before entering text
    userID.sendKeys(generatedUserID);

    firstname.clear();
    firstname.sendKeys(generatedUserID);
    
    System.out.println("Entered User ID: " + generatedUserID);
}

/**
 * Reads counter from file, increments it, saves it back, and returns the new counter.
 */
private int getNextCounter() {
    File file = new File(FILE_PATH);
    int counter = 1;

    try {
        if (file.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            if (line != null && !line.trim().isEmpty()) {
                counter = Integer.parseInt(line.trim()) + 1;
            }
            reader.close();
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(String.valueOf(counter));
        writer.close();
    } catch (IOException | NumberFormatException e) {
        e.printStackTrace();
    }

    return counter;
}

//****************new user id creation method start****************

public void txt_lastName() {
	lastName.sendKeys("godrejLastName");
}

public void EnterDesignation(String Desig) {
	searchbox_Designation.sendKeys(Desig); //work --->worker
	
}

public void selectdesignation() {
	wait.until(ExpectedConditions.elementToBeClickable(worker)).click();
}

public void email(String emailId) {
	emailID.sendKeys(emailId);
}

public void mobNum(String Num) {
	mobileNumber.sendKeys(Num);
}

public void altmobNum1(String Num1) {
	atlMobileNumber1.sendKeys(Num1);
}

public void emergcontpersn(String name1) {
	emergencyContactPerson.sendKeys(name1);
}

public void altmobnum2(String num2) {
	atlMobileNumber2.sendKeys(num2);
}	

public void dob(String DOB) {
	dateOfBirth.sendKeys(DOB); //re-usable method
	dateOfBirth.click();
}

public void doj(String DOJ) {
	dateOfJoining.sendKeys(DOJ);
	//dateOfJoining.click();
}

public void uploadprofile() {
	String filepath = "D:\\New folder\\images.jpg";
	profileImage.sendKeys(filepath);
}

public void dropdwnStatus() {
	drpdwnStatus.click();
}

public void userstatus() {
	selectStatus.click();
}

public void scroll() {

JavascriptExecutor js = (JavascriptExecutor)driver;

js.executeScript("arguments[0].scrollIntoView();", ele);
js.executeScript("return window.pageYOffset;");

}

public void dropdown_report_mangr() {
	primaryReportingManager.click();
}

public void select_report_mangr() {
	selectnreportingManagername.click();
}
	
public void dropdwmdotmangr() {
	dropdwnDottedReportedManager.click();;
}

public void seldottedmanager() {
	SelDottedmanager.click();
}

public void dept(String dept) {
	searchbox_Department.sendKeys(dept);
}	

public void dropdwnProject() {
	drpdwnProjectname.click();
}

public void selProjectName() {
	selProject.click();
}

public void dropdownProjectModule() {
	//drpdwnProjectModule.click();
	wait.until(ExpectedConditions.elementToBeClickable(drpdwnProjectModule)).click();
}

/*public void selprojectmodule(String modname) {
	//projectMod.sendKeys(modname);
	wait.until(ExpectedConditions.visibilityOf(projectMod));
    wait.until(ExpectedConditions.elementToBeClickable(projectMod)).sendKeys(modname);
}
*/

public void selLocationMaster() {
	//location_Master.click();
	wait.until(ExpectedConditions.elementToBeClickable(location_Master)).click();
}

public void checkViewProject() {
	if(Chk_view_projectModule.isSelected()) {}
	else
	{
		Chk_view_projectModule.click();
		}
}

public void checkAddProject() {
	Chk_add_projectModule.click();
}

public void checkEditProject() {
	Chk_edit_projectModule.click();
}

public void checkdel() {
	Chk_delete.click();
}

public void plusiconProjectlevel() {
	plusIcon_ProjectLevel.click();
}

public void selpro2() {
	selectProject2.click();
}

public void selsaf2() {
	saffronResidency2.click();
}

public void selectProjectModule2() {
	selpromod2.click();
}

public void promaterial() {
	proMaterialMaster.click();
}
	
public void selClientModule() {
	selectClientModule.click();
}
	
public void selDashboard() {
	dashboard.click();
}

public void selcompanyAdd() {
	exampleCheck5.click();
}

public void selcompanyedit() {
	exampleCheck7.click();
}

public void selcompanydel() {
	exampleCheck8.click();
}

public void btnsave() {
	save.click();
}

public void formnotfilltoast() {
	String formNotFill =formIsNotProperlyFilled.getText();
	if(formNotFill.equalsIgnoreCase("Form is not properly Filled")) {
		Assert.assertTrue(true, "some value are missing in the form");
	}
}

}
