package MasterPage;

import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.ConfigReader;
import utilities.Utility;

public class BasePage {

	protected WebDriver driver;

	protected ConfigReader con;

	public void initDriver() throws IOException {
		final Logger logger = Logger.getLogger(BasePage.class.getName());
		driver = Utility.getDriver();
		con = new ConfigReader();
		driver.manage().window().maximize();
		driver.get(con.getBaseURL().toString());
		// System.out.println("URFLLLLLLL " +con.getBaseURL().toString());
		logger.info("Test started...." + con.getBaseURL().toString());

	}
}
