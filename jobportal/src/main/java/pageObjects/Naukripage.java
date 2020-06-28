package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Naukripage {
	@FindBy(css="a#login_Layer")
	private WebElement loginLink;
	@FindBy(css="input[type='text']")
	private WebElement username;
	@FindBy(css="input[type='password']")
	private WebElement password;
	@FindBy(css="button.btn-primary.loginButton")
	private WebElement submit;

	
	@FindBy(xpath="//div[text()='My Naukri']")
	private WebElement MyNaukriLink; 
	@FindBy(linkText="Edit Profile")
	private WebElement editProfileLink;
	@FindBy(css="input#attachCV")
	private WebElement updateresume;
	
	public Naukripage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void loginLink()
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
	
	public void submit()
	{
		submit.click();
	}
	
	
	
	

	public WebElement myNaukriLink()
	{
		return MyNaukriLink;
	}
	
	public void editProfile()
	{
		editProfileLink.click();
	}
	
	public void updateResume(String path)

	{
		updateresume.sendKeys(path);
	}
}
