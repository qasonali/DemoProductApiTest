package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/resources/features/reg.feature",
				glue="stepdefinitions",tags="@Reg", 
				plugin = {"pretty","html:target/cucumber-report.html"},
				monochrome=true)
public class RegRunner extends AbstractTestNGCucumberTests{
	
}
