package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicWebTable_13 {


	@Test
	public void testMethodDWT() throws InterruptedException {


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
		driver.get("https://classic.crmpro.com/");

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Abhi6692");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Rony#6692");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();

		Thread.sleep(2000);
		
		//Click on Contact link
		driver.switchTo().frame("mainpanel");

		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();

		//Customized xPath using Parent , Sibling relationship
		driver.findElement(By.xpath("//a[contains(text(),'Benchdod Pikachoo')]/parent::td/preceding-sibling::td/input[@name='contact_id']")).click();;
		driver.findElement(By.xpath("//a[contains(text(),'Test Test Pikachoo')]/parent::td/preceding-sibling::td/input[@name='contact_id']")).click();;



	}

}
