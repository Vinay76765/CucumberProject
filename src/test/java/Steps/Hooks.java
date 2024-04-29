package Steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.SeleniumDriver;

public class Hooks {
	
	WebDriver driver;
	
	@Before
	public void Setup()
	{
		SeleniumDriver.SetupDriver();
	}
	
	@After
	public void teardown()
	{
		SeleniumDriver.teardown();
	}
	
	

}
