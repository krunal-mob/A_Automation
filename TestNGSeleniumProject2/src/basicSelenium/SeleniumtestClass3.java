package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumtestClass3 {
	
	
	@Test
	public void testMethod() {
	
		
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
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account&fbclid=IwAR3K1D3sW5IITa8dnqz9o2mrk9ZQNZBE6sLhz_DsW2pWFpXQyZP08SC_6GM#account-creation");
		//driver.navigate().to("https://phptravels.com/demo/");
		
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("abhi@gmail.com");
		
		driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]")).click();
		
		
		Select DrpdownDays = new Select(driver.findElement(By.xpath("//select[@id='days']")));
		DrpdownDays.selectByValue("12"); // Selecting 12
		
		Select DrpdownMonth = new Select(driver.findElement(By.xpath("//select[@id='months']")));
		DrpdownMonth.selectByValue("10"); //Selecting October
		
		Select DrpdownYear = new Select(driver.findElement(By.xpath("//select[@id='years']")));
		DrpdownYear.selectByValue("1991"); //Selecting 1991
		
		
		
		
	}

}
