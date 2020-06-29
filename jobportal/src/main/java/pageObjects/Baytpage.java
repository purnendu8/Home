package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Baytpage {
	@FindBy(linkText="Log In")
	private WebElement loginLink;

	public Baytpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginLink()
	{
		loginLink.click();
	}
	

	

}
