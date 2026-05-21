package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/login.feature", 
				 glue = "stepdefinitions", 
				 tags = "@Login", 
				 plugin = {"pretty","html:target/cucumber-report.html"},
				 monochrome = true)
public class LoginRunner extends AbstractTestNGCucumberTests {

}
