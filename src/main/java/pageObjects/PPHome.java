package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PPHome {

	public WebDriver driver;
	
	
	By popUp=By.xpath("//*[contains(@class,'form-control')]");
	By delivery=By.xpath("//*[contains(@class,'pac-container')]");
	By go=By.xpath("//*[contains(text(),' GO ')]");
	
	
	public PPHome(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getpopUp()
	{
		return driver.findElement(popUp);
		
	}
	
	public WebElement getdelivery()
	{
		return driver.findElement(delivery);
		
	} 
	
	public WebElement getgo()
	{
		return driver.findElement(go);
		
	} 
	
	
}
