package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderConcept_7 {
	
	
	@Test
	public void testMethodSlider() {
		
		
		
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
		driver.get("https://www.flipkart.com/mens-clothing/ethnic-wear/kurtas/pr?sid=2oq%2Cs9b%2C3a0%2Cr6s&otracker=nmenu_sub_Men_0_Kurtas&p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3DMax&p%5B%5D=facets.serviceability%5B%5D%3Dtrue");
		
		
		//Create the object of Actions Class and pass the driver as parameter
		Actions action = new Actions(driver);
		
		WebElement slideIcon = driver.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]"));
		
		action.dragAndDropBy(slideIcon, 50, 0).build().perform();
		
		
		
		
	}

}
