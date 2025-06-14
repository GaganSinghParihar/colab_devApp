package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage {
	
	WebDriver driver;
	
	//constructor
	public loginPage(WebDriver driver) {
		super(driver);
	}
	
//locators
@FindBy(xpath="//input[@id='form3Example3']") 
WebElement txt_username;

@FindBy(xpath="//input[@id='form3Example4']") 
WebElement txt_password;

@FindBy(xpath="//button[normalize-space()='Login']") 
WebElement btn_login;

@FindBy(xpath="//input[@id='form2Example3']") 
WebElement rememberMe;

@FindBy(xpath="//a[normalize-space()='Forgot password?']") 
WebElement forgotPassword;

@FindBy(xpath="//a[normalize-space()='Reset Password?']") 
WebElement resetPassword;

@FindBy(xpath="//img[@src='assets/images/Fanicon Technologies PNG Logo.png']") 
WebElement sampleImage1;

@FindBy(xpath="//img[@src='assets/images/colab.png']") 
WebElement sampleImage2;

@FindBy(xpath="//img[@class='img-fluid']") 
WebElement sampleImage;

//Action methods

public void EnterUserName(String username) {
	txt_username.sendKeys(username);
}

public void EnterPassword(String pwd) {
	txt_password.sendKeys(pwd);
}

public void Clicklogin() {
	btn_login.click();
}



}
