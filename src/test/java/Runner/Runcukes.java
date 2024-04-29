package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/resources/Features", glue= {"Steps"} ,plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		            "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})
public class Runcukes extends AbstractTestNGCucumberTests {
	
	

}
	