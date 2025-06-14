package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class safetyInductionPage extends BasePage {
	
	WebDriver driver;
	
	public safetyInductionPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[normalize-space()='Configured Forms']")
	WebElement configform;
	
	public void clickconfigform() {
		configform.click();
	}
	
	

}
