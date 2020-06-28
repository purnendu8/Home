package scripts;

import java.time.LocalDate;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.TimesJobspage;

public class Rough {
	WebDriver driver;
	@Test
	public void rough()
	{ 
		TimesJobspage tj=new TimesJobspage(driver);
		Date d=new Date();
		System.out.println(d);
		String[] date=d.toString().replaceAll(":", " ").split(" ");
		System.out.println(date[2]);
	}

}
