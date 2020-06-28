package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
	WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", ".//drivers//geckodriver.exe");
	}
	
	public WebDriver initializeDriver() throws IOException, InterruptedException
	{
		String browser=getPropertyData().getProperty("browser");
		String url=getPropertyData().getProperty("url");
		
		if(browser.equals("chrome"))
		{
			 driver=new ChromeDriver();
			driver.get(url);
		}
		else if(browser.equals("firefox"))
		{
			 driver=new FirefoxDriver();
		}
		else if(browser.equals("IE"))
		{
		 // IE
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		return driver;	
		
	}
	
	public static Properties getPropertyData() throws IOException
	{
		FileInputStream fis=new FileInputStream(".//src//main//java//resources//data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		return prop;
	}
	
	@AfterTest
	public void closeDriver() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
	

}