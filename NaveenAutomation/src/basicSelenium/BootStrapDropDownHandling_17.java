package basicSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootStrapDropDownHandling_17 {

	
	@Test
	public void testMethodBSD() throws InterruptedException {
		
		
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
		driver.get("https://bootsnipp.com");
		
		//Click on the bootstrap button
		driver.findElement(By.xpath("//a[contains(@class,'dropdown-toggle')][contains(text(),'Bootstrap')]")).click();
		
		//Now we need to put all the elements of <li> tags in a list
		
		List<WebElement> drpdwnList = driver.findElements(By.xpath("//a[contains(@class,'dropdown-toggle')][contains(text(),'Bootstrap')]/following-sibling::ul/li/a"));
		
		for (WebElement list :drpdwnList)
		{
			
			System.out.println(list.getText());
			
			if(list.getText().equalsIgnoreCase("Pure")) {
				
				list.click();
				
				break;//was getting staleElementReferenceException without break statement
			}
		}
		
		
		
		
		
		Thread.sleep(5000);
		driver.close();
		
	}
	
	
	
	
}
	
	
	
	

