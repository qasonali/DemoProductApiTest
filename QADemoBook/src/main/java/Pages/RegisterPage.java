package Pages;

import java.io.IOException;

import org.openqa.selenium.By;

import MasterPage.BasePage;

public class RegisterPage extends BasePage {

	By regbtn = By.id("newUser");
	By fname = By.id("firstname");
	By lname = By.id("lastname");
	By uname = By.id("userName");
	By btn = By.id("register");
	By password = By.xpath("//form[@id='userForm']/div/following::input[@id='password']");

	public void doRegistration() throws IOException {
		// initDriver();
		driver.findElement(regbtn).click();;
		driver.findElement(fname).sendKeys("abc");;
		driver.findElement(lname).sendKeys("abc123");;
		driver.findElement(uname).sendKeys("myuser");
		driver.findElement(password).sendKeys("abc123");
		driver.findElement(btn).click();

	}
}
