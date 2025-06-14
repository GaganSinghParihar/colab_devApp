package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class userlistPage extends BasePage{
	
	WebDriver driver;
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	public userlistPage(WebDriver driver) {
		super(driver);
	}
	

@FindBy(xpath="//button[@class='btn btn-round color-dark-blue']") 
WebElement userAddIcon;

@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-users[1]/div[1]/div[1]/div[2]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]") 
WebElement userEditIcon;

@FindBy(xpath = "//div[@id='toastr-container']")
String toastermsg;

@FindBy(xpath="//body/div/div/div[1]") 
WebElement dataInsertedSuccessfully;

public void ClickAddIcon() {
	userAddIcon.click();
}

public void ClickEditIcon() {
	userEditIcon.click();
}

public void usersavedToastmessage() {
	WebElement toastMessage = wait.until(ExpectedConditions.visibilityOf(dataInsertedSuccessfully));
	
	String usersaved = toastMessage.getText();
    if (usersaved.equalsIgnoreCase("Data Inserted Successfully")) {
        Assert.assertTrue(true, "user saved successfully");
    } else {
        Assert.fail("Toast message text did not match expected value.");
    }
}

public void usersavedToastmessage1() {
	By toastLocator = By.xpath(toastermsg);
	 WebElement toast = wait.until(ExpectedConditions.presenceOfElementLocated(toastLocator));
	 String toastText = toast.getText();
     System.out.println("Toast appeared: " + toastText);
     
     if (toastText.contains("Data Updated  Successfully")) {
         System.out.println("Toast validation passed.");
     } else {
         System.out.println("Toast validation failed.");
     }
}
	

}
