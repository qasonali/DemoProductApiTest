package stepdefinitions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import MasterPage.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ExtentManager;

public class Hooks extends BasePage {

    public static ExtentReports extent = ExtentManager.getReportInstance();

    public static ExtentTest test;

    @Before
    public void beforeScenario(Scenario scenario) {

        test = extent.createTest(scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario) {

        if(scenario.isFailed()) {

            test.fail("Test Failed");

            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png", scenario.getName());

        } else {

            test.pass("Test Passed");
        }

        extent.flush();
    }
}
