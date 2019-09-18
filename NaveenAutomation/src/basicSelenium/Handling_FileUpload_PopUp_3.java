package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handling_FileUpload_PopUp_3 {
	
	
	@Test
	public void testMethodWindowsPopUp() throws InterruptedException {
		
		
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
		driver.get("http://www.globalsqa.com/samplepagetest/");
		
		Thread.sleep(3000);
		
		// Instead of clicking on that upload button , we need to enter SendKeys with the file location address
		// It will only work when type = "file"
		driver.findElement(By.xpath("//input[@name='file-553']")).sendKeys("/Users/asarkar/Downloads/IMG_0022.PNG");
		
		
		
		
		
	}
	
	
	
	
	

}
