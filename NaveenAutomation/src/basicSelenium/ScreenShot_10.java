package basicSelenium;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenShot_10 {

	@Test
	public void testMethoodSC() throws IOException {

		System.setProperty("webdriver.chrome.driver", "/Users/asarkar/Desktop/TechBodhi/Drivers/chromedriver 2");

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
		//driver.navigate().to("https://phptravels.com/demo/");


		//To Take the Screenshots
		TakesScreenshot ts = (TakesScreenshot) driver; //Type Conversion 
		// TakesScreenshot is an Interface
		//Need to handle IO exception
		File src = ts.getScreenshotAs(OutputType.FILE); //Store the screenshot in some buffer memory
		FileUtils.copyFile(src, new File ("/Users/asarkar/Desktop/GitHub_Project/Automation/NaveenAutomation/src/basicSelenium/ScreenShots/SC_3.jpeg"));



	}



}
