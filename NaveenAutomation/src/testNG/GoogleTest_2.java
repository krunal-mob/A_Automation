package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest_2 {
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/asarkar/Desktop/TechBodhi/Drivers/chromedriver 2");

		// Instantiate the Chrome Browser by taking WebDriver reference and ChromeDriver Object
		 driver = new ChromeDriver();

		//Delete All Cookies
		driver.manage().deleteAllCookies();

		//Maximize the Window
		driver.manage().window().maximize();

		//Put PageloadTimeout -->To wait for the page to load properly
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		//Put Implicit timeout for all the elements of the script 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//Open any Url (Two Ways)
		driver.get("https://www.google.com/");
		
	}
	
	@Test(priority=1 , groups="Title")
	public void TitleTest() {
		
		String pageTitle = driver.getTitle();
		
		System.out.println(" The title of the page is "+pageTitle);
		Assert.assertEquals(pageTitle, "Google");
		
	}
	
	@Test(priority = 2 , groups = "Logo")
	public void logoTest() {
		
		boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed(); 
		System.out.println("The google logo is Displayed : " + b);
		Assert.assertEquals(b, "False");
	}
	
	@Test(priority = 3 , groups = "SampleTest")
	public void  sampleTest1() {
		
		System.out.println("SampleTest 1");
	}
	
	
	@Test(priority = 4 , groups = "SampleTest")
	public void  sampleTest2() {
		
		System.out.println("SampleTest 2");
	}
	
	
	
	@AfterMethod
	public void tearDown() {
	 driver.quit();
	 
	 
		
		
	}

}
