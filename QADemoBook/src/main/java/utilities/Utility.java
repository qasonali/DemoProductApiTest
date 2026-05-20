package utilities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	private static WebDriver driver;

	public static WebDriver getDriver() {
	    if (driver == null) {
	        driver = new ChromeDriver();
	    }
	    return driver;
	}
	
	public static WebElement waitForElementClickable(WebDriver driver,By locator) {
		return new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.elementToBeClickable(locator));
		
	}
	
	public static WebElement waitForVisibility(WebDriver driver,By locator) {
		return new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	public static Alert waitForAlertPresent(WebDriver driver) {
		return new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.alertIsPresent());
		
	}
}
