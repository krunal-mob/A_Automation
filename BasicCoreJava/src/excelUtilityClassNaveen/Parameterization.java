package excelUtilityClassNaveen;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import fileHandling.Xls_Reader;

public class Parameterization {



	@Test
	public void testParameterize() throws IOException, InterruptedException {

		//Create the object of "Xls_Reader" class

		Xls_Reader xReader = new Xls_Reader("/Users/asarkar/Desktop/GitHub_Project/Automation/BasicCoreJava/src/excel_Files/Gmail_TestFile .xls");
		Xls_Reader_NaveenAutomationLab xReaderNAL = new Xls_Reader_NaveenAutomationLab("/Users/asarkar/Desktop/GitHub_Project/Automation/BasicCoreJava/src/excel_Files/Gmail_TestFile .xls"); 
		
		
		
		
		int rowCount=xReader.getRowCount("Sheet1");
		System.out.println(rowCount);
		
		//Add column
		xReaderNAL.addColumn("Sheet1", "Status");
		
		

		for (int rowNUM = 2 ;  rowNUM <=rowCount ; rowNUM++) {


			String firstName = xReader.getCellData("Sheet1", rowNUM, 1);
			String lastName = xReader.getCellData("Sheet1", rowNUM, 2);
			String userName = xReader.getCellData("Sheet1", rowNUM, 3);
			String password = xReader.getCellData("Sheet1", rowNUM, 4);
			String confirmPassword = xReader.getCellData("Sheet1", rowNUM, 5);
			
			System.out.println(firstName);
			System.out.println(lastName);
			System.out.println(userName);
			System.out.println(password);
			System.out.println(confirmPassword);
			
			
			
			
			//Webdriver Code
			
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
			driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");


			driver.findElement(By.id("firstName")).sendKeys(firstName);
			driver.findElement(By.id("lastName")).sendKeys(lastName);
			driver.findElement(By.id("username")).sendKeys(userName);
			driver.findElement(By.name("Passwd")).sendKeys(password);
			driver.findElement(By.name("ConfirmPasswd")).sendKeys(confirmPassword);
			
			xReaderNAL.setCellData("Sheet1", "Status", rowNUM , "Pass");
			
			Thread.sleep(3000);
			
			driver.close();
			}

			//xReader.getCellData("Sheet1", rowNum, colNum)



		}





	
	

}
