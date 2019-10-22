package practiceJavaPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test{
	
	
	@org.testng.annotations.Test
	public void testMethod() throws InterruptedException {
		
		
		
	
		System.setProperty("webdriver.chrome.driver", "/Users/asarkar/Desktop/TechBodhi/Drivers/chromedriver 2");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://classic.crmpro.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("Abhi6692");
		driver.findElement(By.name("password")).sendKeys("Rony#6692");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		String text = driver.findElement(By.xpath("//td[contains(text(),'User: Abhishek Sarkar')]")).getText();
		
		System.out.println(text);
		System.out.println(text.length());
		
		driver.close();
		
	
	}
	
}
