package AutoTest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Gmail;
import pageObjects.HomeSignIn;
import pageObjects.PPHome;
import resources.base;
	
public class LandingPage extends base {
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	public WebDriver driver;
	public String baseUrl = "https://pp-pizzapizza-web-qa.appspot.com";
	
	@Test(priority=1, dataProvider="getData")
	public void basePageNavigation(String Username, String Password) throws IOException
	{
		
		driver = initializeDriver();
		log.info("Driver is initialized");
		driver.get(baseUrl);
		Gmail g=new Gmail(driver);
		g.getGmailLogin().sendKeys(Username); //creating object to that class (Gmail) and invoke methods
		g.getNext().click();
		
		try  
		{ 
			Thread.sleep(3000);//wait for 3 seconds 
		} 
		catch (InterruptedException e) 
		{ 
			e.printStackTrace(); 
		} 
		
		g.getPassword().sendKeys(Password);
		g.getSignIn().click();
		log.info("GMail login passed");
		
	}
	
	 @DataProvider
	public Object[][] getData()
	{
		//ROW stands for how many different data types should run
		//COLUMN stands for how many values per each test
		Object[][] data = new Object[1][2]; 
		
		//0th row
		data[0][0]="plasticqa";
		data[0][1]="1testers2";
		
		//1st row
		//data[1][0]="pppppp";
		//data[1][1]="bbbbbb";
		
		return data;
		
	}	
	
	 @Test(priority=2, dataProvider="getDeliveryData")
		
		public void basePageNavigation(String deliveryAddress) throws IOException
		{
		 	PPHome p=new PPHome(driver);
			p.getpopUp().sendKeys(deliveryAddress);
			
			try  
			{ 
				Thread.sleep(5000);//wait for 5 seconds 
			} 
			catch (InterruptedException e) 
			{ 
				e.printStackTrace(); 
			} 
			
			p.getdelivery().click();
			
			
			try  
			{ 
				Thread.sleep(5000);//wait for 5 seconds 
			} 
			catch (InterruptedException e) 
			{ 
				e.printStackTrace(); 
			}
			
			log.info("Delivery address validated");
			p.getgo().click();
			p.getLogIn().click();
			
		}
	
	@DataProvider
	public Object[][] getDeliveryData()
	{
		//ROW stands for how many different data types should run
		//COLUMN stands for how many values per each test
		Object[][] data = new Object[1][1]; 
		
		//0th row
		data[0][0]="39 Parliament Street, Toronto";
		return data;
		
	} 
	
	@Test(priority=3, dataProvider="getSignInData")
	public void basePageNavigation1(String email, String pass) throws IOException
	{
		HomeSignIn hs=new HomeSignIn(driver);
		
		try  
		{ 
			Thread.sleep(3000);//wait for 3 seconds 
		} 
		catch (InterruptedException e) 
		{ 
			e.printStackTrace(); 
		}
		
		hs.getEmail().sendKeys(email);
		hs.getPassword().sendKeys(pass);
		
		try  
		{ 
			Thread.sleep(3000);//wait for 3 seconds 
		} 
		catch (InterruptedException e) 
		{ 
			e.printStackTrace(); 
		}

		hs.getSignin().click();
		log.info("PP user login successful");
	}
	
	@DataProvider
	public Object[][] getSignInData()
	{
		Object[][] data = new Object[1][2]; 
		
		//0th row
		data[0][0]="ppv2test@yopmail.com";
		data[0][1]="bbbbbb1$";
		return data; 
	}
	
}
