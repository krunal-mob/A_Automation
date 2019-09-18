package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseMovementConcept_5 { //Here Basically Mouse Hover
	
	@Test
	public void testMethodMouseMovement() throws InterruptedException {
		
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
		driver.get("https://www.flipkart.com/");
		
		//Close the login/Sign Up modal
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		//For Performing the mouse hover, we need to create the Actions class Object.
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Men']"))).build().perform();
		
		Thread.sleep(5000);
		
		//Clicking on the Jeans
		driver.findElement(By.linkText("Jeans")).click();
		
		 
		
		
		
	}

}
