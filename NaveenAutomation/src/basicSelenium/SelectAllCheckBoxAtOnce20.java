package basicSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckBoxAtOnce20 {

	public static void main(String[] args) {
		

		
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/asarkar/Desktop/Abhishek Sarkar/TechBodhi/Drivers/chromedriver 3");

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
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		
		String checkBoxtext = driver.findElement(By.xpath("//label[text()='Option 1']")).getText();
		
		System.out.println(checkBoxtext);
		
		List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		Integer checkBoxCount = allCheckBoxes.size();
		
		System.out.println("The Count of checkboxes present  is --> " + checkBoxCount );
		
		for(WebElement eachCB : allCheckBoxes ) {
			
			System.out.println("The CheckBox Title is ---> "  );
			
			//HTML input tags are void elements & they do not need a closing tag and they are not designed 
			//for holding any text / other elements inside.
			//So, getText() / getAttribute("innerHTML") on the 'input' tag element will not work. Find the parent element of the input tag, 
			//then find the innerText/innerHTML and parse it to get the text you want!.
			
			
			//CLicks on each checkbox
			eachCB.click();
			

		//driver.quit();
		
		
	}

	}}
