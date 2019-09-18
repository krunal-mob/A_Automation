package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightFInderPage_2 {
	
	
	WebDriver driver;
	
	public FlightFInderPage_2(WebDriver driver) {
		
		this.driver = driver;
	}

	
	public By tripType = By.xpath("(//input[@name='tripType'])[2]");
	
	public By continueBtn  = By.xpath("findFlights");
	
	
	public void click(By element) {
		
		driver.findElement(element).click();
	}
	
	
	
	
	
	
	
}
