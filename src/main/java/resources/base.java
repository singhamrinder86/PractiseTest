package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class base {

	public static WebDriver driver;
	public static Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Amrinder\\PPPhoenix\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Study Material\\Sunny Bhullar\\Work\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if (browserName.equals("firefox"))
		{
			
		}
		
		else if (browserName.equals("IE"))
		{
		
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	 public void getScreenshot() throws IOException
	{

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C://Users//Amrinder//PPPhoenix//Screenshots//screenshot.png"));
	}
}
