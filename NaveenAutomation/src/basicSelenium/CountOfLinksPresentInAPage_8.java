package basicSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CountOfLinksPresentInAPage_8 {

	@Test
	public void testMethodLinks() throws InterruptedException {

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

		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

		Thread.sleep(3000);

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		int linkCount = allLinks.size();

		System.out.println("The Total number of links present on the page is:  " + linkCount);

		for(WebElement W : allLinks) {

			System.out.println("The name of the link is:  "+ W.getText());


		}
	}
}
