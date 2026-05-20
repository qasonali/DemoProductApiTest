package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/resources/features/reg.feature",
glue="stepdefinitions",tags="@Reg")
public class RegRunner extends AbstractTestNGCucumberTests{
	
}
