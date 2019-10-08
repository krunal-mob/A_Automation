package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MozillaFireFoxBrowser {
	
	@Test
	public void browserInitialization() throws InterruptedException {
		
		System.setProperty("webdriver.firefox.marionette", "/Users/asarkar/Desktop/GitHub_Project/Automation/NaveenAutomation/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
			
	//	driver.manage().deleteAllCookies();

		//Maximize the Window
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);

		//Put Implicit timeout for all the elements of the script 
		//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		driver.get("https://phptravels.com/demo/");
		
		//driver.quit();
		
	}

}
