package scripts;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.MonsterIndiapage;
import utility.Base;

public class VerifyMonster extends Base {
	WebDriver driver;
	Actions action;
	@Test
	public void testMonsterIndia() throws IOException, InterruptedException
	{
		driver=initializeDriver();
		MonsterIndiapage mi=new MonsterIndiapage(driver);
		mi.LoginLink();
		mi.setUserName("purnendukumar8@hotmail.com");
		Thread.sleep(2000);
		mi.setPassword("purnendu8");
		Thread.sleep(2000);
		mi.LoginSubmit();
		
		action=new Actions(driver);
		
	}

}
