package testNGParameters_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest { //How to pass the parameters  form testNG_1.XML file 

	WebDriver driver;


	@Test
	@Parameters({"Browser","URL","UserID","Password"})
	public void  loginTest(String Browser,String URL , String UserID , String Password ) {

		if(Browser.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "/Users/asarkar/Desktop/TechBodhi/Drivers/chromedriver 2");

			// Instantiate the Chrome Browser by taking WebDriver reference and ChromeDriver Object
			driver = new ChromeDriver();

			//Delete All Cookies
			driver.manage().deleteAllCookies();

			//Maximize the Window
			driver.manage().window().maximize();

			//Put PageloadTimeout -->To wait for the page to load properly
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

			//Put Implicit timeout for all the elements of the script 
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}

		else if(Browser.equalsIgnoreCase("Firefox")) 

		{
			driver = new FirefoxDriver();
		}

		else 

		{

			System.out.println("INVALID Browser");

		}


		//Open any Url (Two Ways)
		driver.get(URL);


		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_usernm']")).sendKeys(UserID);
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_adminpassword']")).sendKeys(Password );
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
		driver.switchTo().alert().accept();
	}




}
