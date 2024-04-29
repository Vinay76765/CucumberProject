package PageObjects;

import BasePage.BasePage;

public class HomePage extends BasePage{
	
	public void mouseoverNewCars()
	{
		mouseOver("newcarMenu_XPATH");
	}
	
	public void clickFindNewCars()
	{
		
		Click("findNewCars_XPATH");	
	}
	
	public void searchCars()
	{
		
	}

}
