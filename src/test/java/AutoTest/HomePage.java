package AutoTest;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.PPHome;
import resources.base;

public class HomePage extends base {
	
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String deliveryAddress) throws IOException
	{
		driver = initializeDriver();
		driver.get("https://pp-pizzapizza-web-qa.appspot.com"); 
		PPHome p=new PPHome(driver);
		p.getpopUp().sendKeys(deliveryAddress);
		p.getdelivery().click();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//ROW stands for how many different data types should run
		//COLUMN stands for how many values per each test
		Object[][] data = new Object[1][1]; 
		
		//0th row
		data[0][0]="3255 Dundas Street West, Mississauga";
	
		
		return data;
		
	} 
}
