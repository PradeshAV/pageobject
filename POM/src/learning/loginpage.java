package learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage 
{
	WebDriver driver;
	public loginpage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy(name="email") WebElement uname;
	@FindBy(name="pass") WebElement pass;
	@FindBy(name="login") WebElement loginButton;
	
	public void logintoFacebook(String usernameapplication,String passwordapplication)
	{
		uname.sendKeys(usernameapplication);
		pass.sendKeys(passwordapplication);
		loginButton.click();
				
	}
	
	

}
