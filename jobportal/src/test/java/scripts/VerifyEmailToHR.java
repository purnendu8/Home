package scripts;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.EmailToHRpage;
import utility.Base;

public class VerifyEmailToHR extends Base {
	WebDriver driver;
	
	@Test
	public void testSendHrEmail() throws IOException, InterruptedException
	{
		driver=initializeDriver();
		EmailToHRpage HRemail=new EmailToHRpage(driver);
		
		driver.get("https://login.live.com/");
		HRemail.setUserName("purnendukumar8");
		HRemail.Next();
		HRemail.setPassword("@#PK8706pk3");
		Thread.sleep(2000);
		//HRemail.SignIN();
		driver.findElement(By.id("idSIButton9")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div.c-action-menu")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("home.banner.profile.view-inbox")).click();
		Thread.sleep(2000);
		 Set<String> allWhs = driver.getWindowHandles();
		 for(String wh:allWhs)
		 {
			 driver.switchTo().window(wh);
		 }
		 Thread.sleep(2000);
		int row=10;
		//for(int i=0;i<row; i++) {
		driver.findElement(By.id("id__3")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.ms-BasePicker-input.pickerInput_cf204fb8")).sendKeys("purnendukumar82@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#TextField972")).sendKeys("HR email testing");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[aria-label='Message body']")).sendKeys(HRemail.messageBody());
		Thread.sleep(2000);
		driver.findElement(By.id("id__533")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.ms-ContextualMenu-linkContent.linkContent-214")).sendKeys("D:\\Eclipse_WS\\HomeProject - Supporting files\\Purnendu_BE_7yrs_AutomationTesting .doc");
		Thread.sleep(2000);
		driver.findElement(By.id("id__556")).click();
	//	}
		
	}
	

}