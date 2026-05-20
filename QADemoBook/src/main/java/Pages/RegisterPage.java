package Pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import MasterPage.BasePage;
import utilities.TestDataUtil;
import utilities.Utility;

public class RegisterPage extends BasePage {

	By regbtn = By.id("newUser");
	By fname = By.id("firstname");
	By lname = By.id("lastname");
	By uname = By.id("userName");
	By btn = By.id("register");
	By password = By.xpath("//form[@id='userForm']/div/following::input[@id='password']");

	public RegisterPage() throws Throwable {
		initDriver();
	}
	public void newUserClick() {
		WebElement newUserBtn = Utility.waitForVisibility(driver, regbtn);
		newUserBtn.click();
	}

	public void enterDetails() throws IOException {
		String firstname = TestDataUtil.getUniqueFirstname();
		String lastanme = TestDataUtil.getUniqueLname();
		String username = TestDataUtil.getUniqueUsername();
		String pass = TestDataUtil.getUniquePassword();

		driver.findElement(fname).sendKeys(firstname);
		driver.findElement(lname).sendKeys(lastanme);
		driver.findElement(uname).sendKeys(username);
		driver.findElement(password).sendKeys(pass);		
	}
	
	public void doRegister() throws InterruptedException {
		driver.findElement(btn).click();
		Thread.sleep(5000);		

        try {
	    Alert alert = Utility.waitForAlertPresent(driver);
		String message = alert.getText();
		 if(message.equals("User Registered Successfully.")) {
		     alert.accept();  
		  }
        }catch(Exception e) {
            System.out.println("Alert not displayed");
        }
	}
}
