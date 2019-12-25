package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BasicSelenium_1 {

	@Test
	public void testMethod() {

		
		//Chrome
		System.setProperty("webdriver.chrome.driver", "/Users/asarkar/Desktop/AbhishekSarkar/TechBodhi/Drivers/chromedriver 3");
		//FireFoxx
		System.setProperty("webdriver.gecko.marionette", "/Users/asarkar/Desktop/TechBodhi/Drivers/geckodriver");
		//Opera 
		System.setProperty("webdriver.opera.driver", "/Users/asarkar/Desktop/TechBodhi/Drivers/operadriver");		

		// Instantiate the Chrome Browser by taking WebDriver reference and ChromeDriver Object
		WebDriver driver = new ChromeDriver();

		//Delete All Cookies
		driver.manage().deleteAllCookies();

		//Maximize the Window
		driver.manage().window().maximize();
		
		//Put PageloadTimeout -->To wait for the page to load properly
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		//Put Implicit timeout for all the elements of the script 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		//Open any Url (Two Ways)
		driver.get("https://phptravels.com/demo/");
		driver.navigate().to("https://phptravels.com/demo/");
		driver.get("http://username:password@example.com");
		
		//Handle https certification
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//To get the Title  of  the page
		String title=driver.getTitle();
		System.out.println("***********************");
		System.out.println("The Title of the page is : " + title);
		
		//To get the URL  of  the page
		String url =driver.getCurrentUrl();
		System.out.println("***********************");
		System.out.println("The URL of the page is  "+url);
		
		//To get the PageSource  of  the page
		
		String pageSource = driver.getPageSource();
		System.out.println("***********************");
		
		//To Refresh the page 
		driver.navigate().refresh();
		driver.navigate().to(driver.getCurrentUrl());
		 //Press F5 using KEYS operation
		
		
		//To Go back to Previous page
		driver.navigate().back();
		
		//To navigate to next page
		driver.navigate().forward();

        //To Close the current tab / browser
		 driver.close(); 
		//It closes the current open window on which driver has focus on.
		
		
		//This method is used to destroy the instance of WebDriver. 
		//It closes all Browser Windows associated with that driver and safely ends the session.
         driver.quit();
		
	
	
	
	
	
	}



}
