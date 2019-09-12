package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicSelenium {

	@Test
	public void testMethod() {

		System.setProperty("webdriver.chrome.driver", "/Users/asarkar/Desktop/TechBodhi/Drivers/chromedriver 2");

		// Instantiate the Chrome Browser by taking WebDriver reference and ChromeDriver Object
		WebDriver driver = new ChromeDriver();

		//Delete All Cookies
		driver.manage().deleteAllCookies();

		//Maximize the Window
		driver.manage().window().maximize();

		//Put Implicit timeout for all the elements of the script 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		//Open any Url (Two Ways)
		driver.get("https://phptravels.com/demo/");
		//driver.navigate().to("https://phptravels.com/demo/");
		
		
		
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
		
		//To Go back to Previous page
		driver.navigate().back();
		
		//To navigate to next page
		driver.navigate().forward();

        //To Close the current tab / browser
		 driver.close(); 
		//It closes the current open window on which driver has focus on.
		
		
		//This method is used to destroy the instance of WebDriver. 
		//It closes all Browser Windows associated with that driver and safely ends the session.
        //  driver.quit();
		
	
	
	
	
	
	}



}
