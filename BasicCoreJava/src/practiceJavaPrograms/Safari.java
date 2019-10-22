package practiceJavaPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Safari {

	
	public void a() {
		
		System.out.println("A");
	}
	
	
	
	
	@Test
	public void safariTest() {
		
		System.setProperty("webdriver.opera.driver", "/Users/asarkar/Desktop/TechBodhi/Drivers/operadriver");		
		WebDriver driver = new OperaDriver();
		
		driver.get("https://www.google.com/");
	}
	
	
	
}
