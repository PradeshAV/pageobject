package learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class pagefact 
{
	WebDriver driver;
	@Test
	public void verify()
	{
		loginpage loginpage=PageFactory.initElements(driver, loginpage.class);
		loginpage.logintoFacebook("9092713566", "Pradesh8#");
	
		
		
		
		
	}
	
	

}
