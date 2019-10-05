package excelUtilityClassNaveen;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import fileHandling.Xls_Reader;


public class DataDrivenTest {



	//To read XLS files, an HSSF implementation is provided by POI library.
	//To read XLSX, XSSF implementation of POI library will be the choice.


	@Test
	public void testMethodDDT() throws IOException, InterruptedException {


		//Create the Object of  "xReader" class.
		//Get data form Excel
		Xls_Reader xReader = new Xls_Reader("/Users/asarkar/Desktop/GitHub_Project/Automation/BasicCoreJava/src/excel_Files/Gmail_TestFile .xls");

		String firstName = xReader.getCellData("Sheet1", 2, 1);
		System.out.println(firstName);

		String lastName = xReader.getCellData("Sheet1", 2, 2);
		System.out.println(lastName);

		String userName = xReader.getCellData("Sheet1", 2, 3);
		System.out.println(userName);

		String PassWord = xReader.getCellData("Sheet1", 2, 4);
		System.out.println(PassWord);

		String confirmPassWord = xReader.getCellData("Sheet1", 2, 5);
		System.out.println(confirmPassWord);




		//Webdriver Code
		System.setProperty("webdriver.chrome.driver",
				"/Users/asarkar/Desktop/TechBodhi/Drivers/chromedriver 2");

		// Instantiate the Chrome Browser by taking WebDriver reference and
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
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");

		driver.findElement(By.id("firstName")).sendKeys(firstName);
		driver.findElement(By.id("lastName")).sendKeys(lastName);
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.name("Passwd")).sendKeys(PassWord);
		driver.findElement(By.name("ConfirmPasswd")).sendKeys(confirmPassWord);

		Thread.sleep(5000);

		driver.quit();



	}






}



