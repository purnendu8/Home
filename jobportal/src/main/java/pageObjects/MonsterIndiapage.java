package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MonsterIndiapage {
	@FindBy(xpath="//span[text()='Jobseeker Login']")
	private WebElement loginLink;
	@FindBy(css="#signInName")
	private WebElement username;
	@FindBy(css="#password")
	private WebElement password;
	@FindBy(css="#signInbtn")
	private WebElement loginBTN;
	
	public MonsterIndiapage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void LoginLink()
	{
		loginLink.click();
	}
	public void setUserName(String un)
	{
		username.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		password.sendKeys(pw);
	}
	public void LoginSubmit()
	{
		loginBTN.click();
	}

}
