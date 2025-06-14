package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class clientDashboard extends BasePage {
	
	WebDriver driver;
	
	public clientDashboard(WebDriver driver) {
		super(driver);
	}
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

@FindBy(xpath="//img[@src='assets/images/icons/hamburger.png']") 
WebElement ClientDashboard_hamburgerMenu;

@FindBy(xpath="//div[@class='column-statement h-users mt-2 ng-star-inserted']") 
WebElement txt_usersMenu;

@FindBy(xpath="//p[normalize-space()='Saffron Residency']")
WebElement saffron;

public void clickOnClient_Hamburger() {
	wait.until(ExpectedConditions.visibilityOf(ClientDashboard_hamburgerMenu));
	wait.until(ExpectedConditions.elementToBeClickable(ClientDashboard_hamburgerMenu)).click();

}

public void clickOnuseropt() {
	wait.until(ExpectedConditions.visibilityOf(txt_usersMenu));
	wait.until(ExpectedConditions.elementToBeClickable(txt_usersMenu)).click();

}

public void clickSaffron() {
	saffron.click();
}





}
