package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_11 {
	
	public void testMethodEWait() {
		
		
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
		driver.get("https://www.flipkart.com/");
		
		
		//Actions Class
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Men']"))).build().perform();
		
		
		//Explicit wait is for specific elements property
		WebDriverWait wait = new WebDriverWait(driver, 5);
		//1. visibilityOf
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@title='Shirts']"))));
		//2.elementToBeClickable
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@title='Shirts']"))));
		
		driver.findElement(By.xpath("//a[@title='Shirts']")).click();
		
		
		
		
		
		
		
	}
	

}
