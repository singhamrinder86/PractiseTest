package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Gmail {

	public WebDriver driver;
	
	By username=By.xpath("//*[@id='identifierId']");
	By NextClick=By.xpath("//*[@id='identifierNext']/content/span");
	By password=By.xpath("//*[@id='password']/div/div/div/input");
	By login= By.id("passwordNext");
	
	
	public Gmail(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getGmailLogin()
	{
		return driver.findElement(username);
		
	}
	
	public WebElement getNext()
	{
		return driver.findElement(NextClick);
		
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
		
	}
	
	public WebElement getSignIn()
	{
		return driver.findElement(login);
		
	}
}
