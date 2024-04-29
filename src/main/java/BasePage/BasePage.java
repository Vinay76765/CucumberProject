package BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.SeleniumDriver;

public class BasePage {
	
	
	public static WebDriver driver;
	
	private WebElement mouseoverElement;
	
	public BasePage()
	{
		driver = SeleniumDriver.getDriver();
	}
	
	
	public void mouseOver(String locator)
	{
		if(locator.endsWith("_XPATH"))
		{
			mouseoverElement = driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator)));
			
		}else if(locator.endsWith("_ID")){
			
			
			mouseoverElement = driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator)));
		}
		else if(locator.endsWith("_CSS")){
			
			
			mouseoverElement = driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator)));
		}
		else if(locator.endsWith("_LINK")){
			
			
			mouseoverElement = driver.findElement(By.linkText(SeleniumDriver.OR.getProperty(locator)));
		}
		
		new Actions(driver).moveToElement(mouseoverElement).perform();
	}
	
	
	
	public void Click(String locator)
	{
		
		if(locator.endsWith("_XPATH"))
		{
			driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator))).click();
		}else if(locator.endsWith("_ID")){
			
			
			driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator))).click();
		}
		else if(locator.endsWith("_CSS")){
			
			
			driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator))).click();
		}
		else if(locator.endsWith("_LINK")){
			
			
			driver.findElement(By.linkText(SeleniumDriver.OR.getProperty(locator))).click();
		}
		
	}
	
	
	public boolean isElementPresent(String locator)
	{
		try {
		if(locator.endsWith("_XPATH"))
		{
			driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator)));
		}else if(locator.endsWith("_ID")){
			
			
			driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator)));
		}
		else if(locator.endsWith("_CSS")){
			
			
			driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator)));
		}
		else if(locator.endsWith("_LINK")){
			
			
			driver.findElement(By.linkText(SeleniumDriver.OR.getProperty(locator)));
		}
		
		return true;	
	}catch(Throwable t) {
		return false;
	}
		
	
	
	
	
}
}
