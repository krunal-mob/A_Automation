package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handling_Frames_4 {

	/*
	 * An iFrame(Inline Frame) is am HTML document embedded inside HTML Document on
	 * a Website. The iFrame HTML element is often used to insert content from
	 * another source , Example --> Advertisement in a webpage.
	 * 
	 * If the Exception occurs, NoSuchElementPresent, there can be 
	 * two reasons , either the element is not properly identifiable via the locator 
	 * or there is iFrame present .
	 * 
	 * We can Identify if any iFrame is present via right click and see the options for iFrame [refresh / view page source iFrame]
	 */
	
	@Test
	public void testMethodIframe() throws InterruptedException {
		
		
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
		driver.get("http://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		//To get the total number of iframes present in the page
		int iFrameCount = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("The total number of iFrame Present: " + iFrameCount);
		
		//There are three ways to switch to iFrames
		driver.switchTo().frame("By Index"); //1st Way
		driver.switchTo().frame("By Name or ID"); //2nd Way
		driver.switchTo().frame("WebElement"); //3rd Way
		
		
		// How to switch back to the Main Frame
		
		//This will pass the control to the imminent parent frame of the current frame
		driver.switchTo().parentFrame();  //1st Way
		
		//This will pass the control to the main document which contains the iframes
	    driver.switchTo().defaultContent(); //2nd Way
		
		
		
	
	
	
	
	
	
	
}}
