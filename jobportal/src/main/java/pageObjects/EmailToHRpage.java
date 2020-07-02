package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailToHRpage {
	@FindBy(css="#i0116")
	private WebElement username;
	@FindBy(css="#idSIButton9")
	private WebElement Next;
	@FindBy(css="#i0118")
	private WebElement password;
	@FindBy(xpath="//input[text()='Sign in']")
	private WebElement signin;
	
	public EmailToHRpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String un)
	{
		username.sendKeys(un);
	}
	
	public void Next()
	{
		Next.click();
	}
	
	public void setPassword(String pw)
	{
		password.sendKeys(pw);
	}
	
	public void SignIN()
	{
		signin.click();
	}
	
	
	
	
	
	
	public String messageBody()
	{
		String mszBody="\r\n" + 
				"				 I am looking for job change. I have arround 7 years of experience into Software Testing.\r\n" + 
				"				 I have worked on Selenium with Java, TestNG, Maven, Jenkins, CucumberBDD, RestAPI.\r\n" + 
				"				 Experties in Design Framework, implement framework and integrate with 3rd party tools.\r\n" + 
				"\r\n" + 
				"				 Please find my attached cv.\r\n" + 
				"\r\n" + 
				"				 Thanks,\r\n" + 
				"				 Purnendu";
		
		return mszBody;
	}

}
