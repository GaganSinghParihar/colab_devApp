package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserCreationPage extends BasePage{
	
	WebDriver driver;
	
	public UserCreationPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	

@FindBy(xpath="//span[normalize-space()='Select User Type']") 
WebElement selectUserType;

@FindBy(xpath="//li[@aria-label='Project Employee']")
WebElement selectname;

@FindBy(xpath="//span[@class='ng-tns-c56-112 p-dropdown-label p-inputtext p-placeholder ng-star-inserted']") 
WebElement selectAgency;

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


@FindBy(xpath="//div[@class='ng-tns-c56-131 p-dropdown p-component']") 
WebElement selectClientModule;

@FindBy(xpath="//input[@id='exampleCheck6']") 
WebElement Chk_view_clientModule;

@FindBy(xpath="//body[1]/app-root[1]/app-users[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/input[1]") 
WebElement Chk_add_clientModule;

@FindBy(xpath="//input[@id='exampleCheck8']")
WebElement Chk_edit_clientModule;

@FindBy(xpath="//div[@formgroupname='usersClientDetails']//i[@class='fa fa-plus-circle fa-2x imgsfont d-flex justify-content-center']") 
WebElement plusIcon_ClientLevel;

@FindBy(xpath="//button[normalize-space()='Save']") 
WebElement btn_save;

public void clk_usertype() {
	selectUserType.click();
}

public void select_usertype() {
	selectname.click();
}

public void EnterUserID(String userId) {
	userID.sendKeys(userId);
}

public void EnterFirstName(String fname) {
	firstname.sendKeys(fname);
}

public void EnterLastName(String lname) {
	lastName.sendKeys(lname);
}

public void EnterDesignation(String Desig) {
	searchbox_Designation.sendKeys(Desig); //work --->worker
	
}

public void selectdesignation() {
	//selectdesig.click();
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

public void selprojectmodule(String modname) {
	//projectMod.sendKeys(modname);
	wait.until(ExpectedConditions.visibilityOf(projectMod));
    wait.until(ExpectedConditions.elementToBeClickable(projectMod)).sendKeys(modname);
}

public void selLocationMaster() {
	//location_Master.click();
	wait.until(ExpectedConditions.elementToBeClickable(location_Master)).click();
}

public void checkViewProject() {
	Chk_view_projectModule.click();
}

public void checkAddProject() {
	Chk_add_projectModule.click();
}

public void checkEditProject() {
	Chk_edit_projectModule.click();
}



	


public void click_save() {
	btn_save.click();
}









}