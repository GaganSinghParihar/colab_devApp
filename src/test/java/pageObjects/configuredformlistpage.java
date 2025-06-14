package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class configuredformlistpage extends BasePage{
	
	WebDriver driver;
	
	public configuredformlistpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[@class='btn btn-round color-dark-blue']")
	WebElement plusicon;
	
	public void clickplusicon() {
		plusicon.click();
	}
}
