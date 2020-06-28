package pageObjects;

import java.time.LocalDate;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class TimesJobspage {
	@FindBy(xpath="//a[text()='Login']")
	private WebElement LoginInput;
	@FindBy(css="#j_username")
	private WebElement username;
	@FindBy(css="#j_password")
	private WebElement password;
	@FindBy(css="input.waves-effect.waves-light.btn")
	private WebElement LoginSubmit;
	@FindBy(css=".nav-prof-image")
	private WebElement myprofileLink;
	@FindBy(linkText="Edit Profile")
	private WebElement editProfile;
	@FindBy(css="button.waves-effect.waves-light.btn.update-resume")
	private WebElement updateResumeBTN;
	@FindBy(css="#wordResumeFile")
	private WebElement uploadFile;
	@FindBy(css="input#submitbutton")
	private WebElement save;
	@FindBy(css="#profile-doc-modified-date")
	private WebElement updatedON;
	public TimesJobspage(WebDriver driver)
	{  
		PageFactory.initElements(driver, this);
	}
	
	public void LoginCredential()
	{
		LoginInput.click();
	}
	public void setUsername(String un)
	{
		username.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		password.sendKeys(pw);
	}
	public void LoginSubmit()
	{
		LoginSubmit.click();
	}
	
	public WebElement MyProfileLink()
	{
		return myprofileLink;
	}
	
	public void editProfile()
	{
		editProfile.click();
	}
	
	public WebElement updateResume()
	{
		return updateResumeBTN;
	}
	
	public void uploadFile(String path)
	{
		uploadFile.sendKeys(path);
	}
	
	public void saveBTN()
	{
		save.click();
	}
	
	public void updatedDateVerification()
	{
		Date d=new Date();
		String[] date=d.toString().replaceAll(":", " ").split(" ");
		String todayDate=date[2];
		
		String[] updateon=updatedON.getText().replaceAll(",", " ").split(" ");
		String updated=updateon[0];
		Assert.assertTrue(updated.equals(todayDate));
	}

}
