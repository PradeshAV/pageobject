package learning;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class loginfb 
{
	WebDriver driver;
	@Test
	//new file added
	public void loginapp()
	{
	browserfactory.startApplication(driver, "Chrome", "https://www.facebook.com/");
	
		
	}
	

}
