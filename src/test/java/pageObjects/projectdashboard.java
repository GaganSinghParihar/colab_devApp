package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class projectdashboard extends BasePage{
	
	WebDriver driver;
	
	public projectdashboard(WebDriver driver) {
		super(driver);
	}
	
@FindBy(xpath="//img[@src='assets/images/icons/hamburger.png']")
WebElement menu;

@FindBy(xpath="//span[normalize-space()='Safety Induction']")
WebElement safetymenu;

	public void clickmenu() {
		menu.click();
	}
	
	public void clicksafetyinduction() {
		safetymenu.click();
	}

}
