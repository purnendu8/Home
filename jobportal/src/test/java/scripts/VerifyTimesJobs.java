package scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.TimesJobspage;
import utility.Base;

public class VerifyTimesJobs extends Base {
	WebDriver driver;
	String actualConfmMSZ = "Resume attached";
	Actions action;
	JavascriptExecutor js;

	@Test
	public void testTimesJobs() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get("https://www.timesjobs.com/");
		Thread.sleep(2000);
		
		TimesJobspage tj = new TimesJobspage(driver);
		tj.LoginCredential();
		tj.setUsername("purnendukumar8@gmail.com");
		tj.setPassword("8706");
		tj.LoginSubmit();

		action = new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(tj.MyProfileLink()).perform();
		Thread.sleep(1000);
		tj.editProfile();
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", tj.updateResume()); // scroll
		Thread.sleep(1000);
		tj.updateResume().click();
		Thread.sleep(1000);
		File file = new File(".//data//Purnendu_BE_7yrs_AutomationTesting.doc");
		String path = file.getAbsolutePath();
		tj.uploadFile(path);
		Thread.sleep(1000);
		tj.updatedDateVerification();
		Thread.sleep(1000);
	}

}
