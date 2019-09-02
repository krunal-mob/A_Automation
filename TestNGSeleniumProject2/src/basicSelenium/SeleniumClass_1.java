package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumClass_1 {

	
	
	
	@Test
	public void test1() {
     
		System.out.println("Testing");
		
		System.setProperty("webdriver.chrome.driver", "/Users/asarkar/Desktop/TechBodhi/Drivers/chromedriver 2");
		
		
		
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.google.com");
		
		
		
		//cd.close();
		
		
	//	WebDriver driver = new ChromeDriver();
		
	//	driver.get("https://www.google.com");
		
	//	driver.close(); 
		
		
		
		
	}
	
	
	
	
	
	
	
}
