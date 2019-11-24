package learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserfactory 
{
	
	
	public static void startApplication(WebDriver driver,String browserName,String appURL) 
		{
		if(browserName.equals("Chrome"));
		{
			System.setProperty("webdriver chrome.driver", "C:\\Users\\Administrator\\Desktop\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		 if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Desktop\\firefoxdriver.exe");
			driver=new FirefoxDriver();
			
		}
			
		else
		{
			System.out.println("we do not support for this browser");
		
		driver.manage().window().maximize();
		driver.get(appURL);
		return;
	}
		}
	
   public void quitbrowser(WebDriver driver)
   {
	   driver.close();
   }
	   
   }

