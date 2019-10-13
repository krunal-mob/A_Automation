package basicSelenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandeleWindowPopUp_9{

	//1. ALerts -- JavaScript Popup --> Alert Api (Accept, Dismiss)
	//2. File Upload Pop up --> Browse / Upload Button
	//3. Brower WIndow Pop up --> Advertisement pop up -->window handler pop up

	//Scenario -- Generally in most of the cases , there will be only one pop up window/ tab 
	//will be opened and we need to switch from the parent window to that particular window.



	@Test
	public void testMethodWindow() throws InterruptedException {

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
		driver.get("http://www.globalsqa.com/");



		Actions act = new Actions(driver);


		//Mouse hover to Tester's HUB
		act.moveToElement(driver.findElement(By.xpath("(//a[@class='no_border'])[2]"))).build().perform();

		Thread.sleep(5000);

		//Mouse Hover to Demo Testing SIte
		act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Demo Testing Site')]"))).build().perform();;


		Thread.sleep(5000);

		//Click on 'Frames and Windows'
		driver.findElement(By.xpath("//a[@class='last_submenu_item']//span[contains(text(),'Frames And Windows')]")).click();


		//Click on 'Click Here' button
		//Copied the Xpath from Chropath
		driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//a[@class='button e.g. button_hilite button_pale small_button'][contains(text(),'Click Here')]")).click();

		//Once the new window/Tab opens , will store all the Window ID in Set

		Set<String> windowIds = driver.getWindowHandles();

		//To traverse from Parent window to child window we need to use Iterator.

		Iterator<String> it = windowIds.iterator();
		
		//Print all the titles of the windows/tabs opened
		
		/*
		 * while(it.hasNext()) {
		 * 
		 * driver.switchTo().window(it.next()); 
		 * System.out.println("Title is: " +
		 * driver.getTitle());
		 * 
		 * }
		 */
		
		
		

		//At this point the iterator is pointing to the top of the windowIds Object 

		String ParentWindowID = it.next();

		String PparentWindowTitle = driver.getTitle();

		System.out.println("The parent Window ID is:  " + ParentWindowID );
		System.out.println("The parent Window Title is:  " + PparentWindowTitle );

		//Using Iterator we will point towards the next Window ID

		String ChildWindowID = it.next();
		System.out.println("The Child window ID is:  "+ ChildWindowID);
		//Switch the control to childWindow
		driver.switchTo().window(ChildWindowID);
		String ChildWindowTittle =  driver.getTitle();
		System.out.println("The child Window Title is : " + ChildWindowTittle );
		driver.close();
		
		

		//Switching back to parent window
		driver.switchTo().window(ParentWindowID);
		Thread.sleep(3000);
		driver.close();

	}











}
