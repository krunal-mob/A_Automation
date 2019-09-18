package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage_1 {


	WebDriver driver;
	
	By username = By.name("userName");
	By password = By.name("password");
	By login = By.name("login");

	public HomePage_1(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public void login(String username, String password)
	
	{
		
		driver.findElement(this.username).sendKeys(username);
		driver.findElement(this.password).sendKeys(password);
		driver.findElement(login).click();;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
