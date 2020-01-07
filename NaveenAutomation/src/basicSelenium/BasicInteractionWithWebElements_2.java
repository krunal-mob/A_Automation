package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BasicInteractionWithWebElements_2 {
	
	
	@Test
	public void testMethod() throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "/Users/asarkar/Desktop/AbhishekSarkar/TechBodhi/Drivers/chromedriver 2");
		//System.setProperty("webdriver.chrome.driver", "/Users/asarkar/Desktop/AbhishekSarkar/TechBodhi/Drivers/chromedriver3");

		// Instantiate the Chrome Browser by taking WebDriver reference and ChromeDriver Object
		WebDriver driver = new ChromeDriver();

		//Delete All Cookies
		driver.manage().deleteAllCookies();

		//Maximize the Window
		driver.manage().window().maximize();

		//Put Implicit timeout for all the elements of the script 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		//Open any Url (Two Ways)
		driver.get("http://www.globalsqa.com/samplepagetest/");
		//driver.navigate().to("https://phptravels.com/demo/");
		
		
		
		
		// To enter value in TextBox
		////Relative xPath --> //tagName[@Attribute='value'][Attribute='value']
		//Username
		driver.findElement(By.xpath("//input[@name='g2599-name']")).sendKeys("Abhishek Sarkar");
		//Password
		driver.findElement(By.xpath("//input[@name='g2599-email']")).sendKeys("sarkar.abhishek066@gmail.com");
		//Website
		driver.findElement(By.xpath("//input[@name='g2599-website']")).sendKeys("www.Rony.com");
		
		//Press Enter . Here Keys is Enumeration
		driver.findElement(By.xpath("abhi")).sendKeys(Keys.ENTER);
		
		//Send In Caps
		driver.findElement(By.xpath("abhi")).sendKeys(Keys.SHIFT,"Abhi");
		
		//Extra Special locaters
		driver.findElement(new ByAll(By.name("Name"), By.id("ID"), By.className("className"))).sendKeys("Abhishek");;
		
		
		//Select Dropdown
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='g2599-experienceinyears']"));
		 
		Select selectDropdown = new Select(dropDown);
		
		//We can select/de-select from the drop list using these methods of the Select Class.
		selectDropdown.selectByIndex(0);
		Thread.sleep(2000);
		
		selectDropdown.selectByValue("1-3");
		Thread.sleep(2000);
		
		selectDropdown.selectByVisibleText("5-7");
		
		
		selectDropdown.getOptions(); //Fetch all the Webelements of dropdown
		selectDropdown.getFirstSelectedOption(); // Returns a WebElement
		selectDropdown.getAllSelectedOptions(); //Return List of WebElement
		
	
		//Click on  CheckBoxes --> Select Functional testing
		driver.findElement(By.xpath("//input[@name='g2599-expertise[]'][@value='Functional Testing']")).click();
		
		//Click on Multiple CheckBoxes --> Select Automation testing
		driver.findElement(By.xpath("//input[@name='g2599-expertise[]'][@value='Automation Testing']")).click();
		
		//Click on radio button 
		driver.findElement(By.xpath("//input[@value='Post Graduate']")).click();
		
		//Adding comments on textArea
		driver.findElement(By.xpath("//textarea[@name='g2599-comment']")).sendKeys("I am an Automation Tester. I am Learning Selenium");
		
		Thread.sleep(3000);
		
		//Clearing the value 
		driver.findElement(By.xpath("//textarea[@name='g2599-comment']")).clear();
	
		//Whether a Web Element is enabled/displayed/Selected or not --> Here checking the Radio button --> Post Graduate
		//isDisplayed() is the method used to verify a presence of a web element within the webpage
		Boolean displayFlag = driver.findElement(By.xpath("//input[@value='Post Graduate']")).isDisplayed();
		
		//isEnabled() is the method used to verify if the web element is enabled or disabled within the webpage.
		Boolean elabledFlag = driver.findElement(By.xpath("//input[@value='Post Graduate']")).isEnabled();
		
		//sSelected() is the method used to verify if the web element is selected or not
		Boolean selectedFlag = driver.findElement(By.xpath("//input[@value='Post Graduate']")).isSelected();
		
		System.out.println("The Radio button is Displayed ---" + displayFlag);
		System.out.println("The Radio button is Enabled ---" + elabledFlag);
		System.out.println("The Radio button is Selected ---" + selectedFlag);
		
		
		//Interacting with Image --> Fetching the attributes of the image
		WebElement image = driver.findElement(By.xpath("//img[@alt='GlobalSQA']"));
		System.out.println("*********************");
		System.out.println(" The src value is :  " + image.getAttribute("src"));
		
		//Handling Alert (It is an Interface) --> JavaScript PopUp
		//Clicking on the button for alert popup
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		//Fetching the text of the AlertBox
		String alertText = driver.switchTo().alert().getText();
		System.out.println("The Alert Box Says:  "+ alertText);
		
		//Accepting the Alert
		driver.switchTo().alert().accept();
		
		driver.switchTo().alert().accept();
		
		//Dismiss the Alert
		driver.switchTo().alert().dismiss();
		
		//To send some data to the Alert Box
		driver.switchTo().alert().sendKeys("Text");
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		//driver.quit();
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
