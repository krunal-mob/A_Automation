package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Flipkart1 {
	
	
	@Test
	public void test1() throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "/Users/asarkar/Desktop/TechBodhi/chromedriver 2");
		
		ChromeDriver cd = new ChromeDriver();
		
		cd.get("https://www.flipkart.com/");
		
		cd.manage().window().maximize();
		
		cd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Thread.sleep(3000);
		
		cd.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();;
		
		
		//Actions Class
		
		Actions act = new Actions(cd);
		
		
		// Different ways of Xpath
		// //tagName[text()='text']
		
		act.moveToElement(cd.findElement(By.xpath("//span[text()='Men']"))).build().perform();
		
		
		//ElementNotInteractableException --> 
		// We have synchronization technique -->  Implicit Wait and Explicit Wait
		
		// Implicit Wait --> Waits for the presence of  an element
		
		// Explicit Wait --> Waits for the specific property of an element. 
		
		
		
		
		//NoSuchElementException --> When no such element is present 
		
		
		//Explicit Wait Implementation
		
		WebDriverWait wait = new WebDriverWait(cd, 5);
		
		wait.until(ExpectedConditions.visibilityOf(cd.findElement(By.xpath("//a[@title='Shirts']"))));
		
		cd.findElement(By.xpath("//a[@title='Shirts']")).click();
		
		
		
		// SLider for price Range
		
		WebElement ele = cd.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]"));
		
		act.dragAndDropBy(ele, 50, 0).build().perform();
		
		
		
		
		
	}

}
