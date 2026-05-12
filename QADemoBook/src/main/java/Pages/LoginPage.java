package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import MasterPage.BasePage;
import utilities.Utility;

public class LoginPage extends BasePage {

	By btnId = By.id("login");
	By uname = By.id("userName");
	By pass = By.id("password");
	By loginBtn = By.xpath("//div[@class='text-right button col-auto']/button[@id='login']");

	public LoginPage() throws IOException {
		initDriver();
	}

	public void goLoginPage() {
		Utility.waitForElementClickable(driver, btnId).click();
	}

	public void enterCredentials(String username, String password) {
		WebElement input_uname = Utility.waitForVisibility(driver, uname);
		WebElement input_pass = Utility.waitForVisibility(driver, pass);
		input_uname.sendKeys(username);
		input_pass.sendKeys(password);
	}

	public String doLogin() throws IOException {
		WebElement btn=Utility.waitForElementClickable(driver, loginBtn);
		btn.click();
		String title = driver.getTitle();
		System.out.println("Home page title :::" + title);
		return title;
	}

}
