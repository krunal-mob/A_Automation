package com.aut.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aut.qa.utility.TestUtil;


public class TestBase {

public	static WebDriver driver;
	static Properties prop;

	//Constructor
	public TestBase()  {


		

		
		try {
			
			prop = new Properties();
			FileInputStream fis = new FileInputStream("/Users/asarkar/Desktop/GitHub_Project/Automation/NaveenAutomation/src/basicSelenium/config.properties");
		
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}
	
	public static void initialization() {

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "/Users/asarkar/Desktop/GitHub_Project/Automation/MavenProjectFramework/Drivers/chromedriver 2");

			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("FF")) {
			
			System.setProperty("webdriver.firefox.marionette", "/Users/asarkar/Desktop/GitHub_Project/Automation/MavenProjectFramework/Drivers/geckodriver");
			
			driver = new FirefoxDriver();
		}


		
		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT ,TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		
		String URL = prop.getProperty("url");
		
		driver.get(URL);


	}

}
