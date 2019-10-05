
package testNGDataProvider_3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilityPackage.TestUtilityClass;

public class DataProviderTest {

	static WebDriver driver;

	@BeforeMethod
	public void setUp() {
		
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

		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");

	}

	@DataProvider
	public Iterator<Object[]> getTestData() throws IOException {

		ArrayList<Object[]> testData = 	 TestUtilityClass.getDataFromExcel();
		return testData.iterator();
	}


	@Test(dataProvider = "getTestData")
	public void testMethodDP(String firstName , String lastName, String userName , String password ,String confirmPassword) {

		//enter Data
		driver.findElement(By.id("firstName")).sendKeys(firstName);
		driver.findElement(By.id("lastName")).sendKeys(lastName);
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.name("Passwd")).sendKeys(password);
		driver.findElement(By.name("ConfirmPasswd")).sendKeys(confirmPassword);

	}
	
	
	@AfterMethod
	public void tearDown() {

		driver.quit();




	}

}
