package fileHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameterization {


	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/asarkar/Desktop/TechBodhi/Drivers/chromedriver 2");


        // Initialize the browser
		//ChromeDriver cd = new ChromeDriver();
		//cd.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");		
       // cd.manage().window().maximize();
		//Thread.sleep(3000);
		//cd.close();
		
		// Access to Excel Sheet via the the Utility class provided by Aanand Sir
		
		Xls_Reader xr = new Xls_Reader("/Users/asarkar/Desktop/GitHub_Project/Automation/BasicCoreJava/src/excel_Files/Gmail_TestFile .xls");
		
		//System.out.println(xr.getCellData("Sheet1", 2, 1)); //Prints Abhishek
		
		int rowCount = xr.getRowCount("Sheet1");
		System.out.println(rowCount);
		int colCount = xr.getColumnCount("Sheet1");
		System.out.println(colCount);
		
			
			
		}
		
		
		
		
		
		
		
		
	}












