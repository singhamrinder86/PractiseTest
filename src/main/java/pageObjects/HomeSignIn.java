package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeSignIn {

	public WebDriver driver;
	
	
	By email=By.id("emailAddress");
	By password=By.id("passwordInput");
	By signin=By.xpath("//*[contains(text(),' SIGN IN ')]");
	
	
	
	public HomeSignIn(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getEmail()
	{
		return driver.findElement(email);
		
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
		
	}
	
	public WebElement getSignin()
	{
		return driver.findElement(signin);
		
	}
	
}
