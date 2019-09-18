package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropConcept_6 {
	
	
	@Test
	public void testMethodDragAndDrop() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/asarkar/Desktop/TechBodhi/Drivers/chromedriver 2");

		// Instantiate the Chrome Browser by taking WebDriver reference and ChromeDriver Object
		WebDriver driver = new ChromeDriver();

		//Delete All Cookies
		driver.manage().deleteAllCookies();

		//Maximize the Window
		driver.manage().window().maximize();

		//Put Implicit timeout for all the elements of the script 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		//Open any Url 
		driver.get("http://www.globalsqa.com/demo-site/draganddrop/");
		
		//In Order to interact with DragAndDrop feature, we need to create the 
		//object of Actions class
		
		//As iframe was present,need to switch to iframe first
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@class='demo-frame'])[1]")));
		
		Actions actionD = new Actions(driver);
		
		
		//clickAndHold--->moveToElement --> release 
		actionD.clickAndHold(driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']")))
		.moveToElement(driver.findElement(By.id("trash")))
		.release().build().perform();
		
		
		
		
		
	}
	
}
	
	
	
	
	
	
	


