package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.Baytpage;
import utility.Base;

public class VerifyBayt extends Base {
	WebDriver driver;
	@Test
	public void verifyBaytTest()
	{
		Baytpage bp=new Baytpage(driver);
	}

}
