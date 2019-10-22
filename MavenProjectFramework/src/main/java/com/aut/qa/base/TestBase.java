package com.aut.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.aut.qa.utility.TestUtil;


public class TestBase {

	public	static WebDriver driver;

	static public Properties prop;

	//Constructor
	public TestBase()  {

		try {

			prop = new Properties();
			FileInputStream fis = new FileInputStream("/Users/asarkar/Desktop/GitHub_Project/Automation/MavenProjectFramework/src/main/java/com/aut/qa/config/config.properties");

			try {

				prop.load(fis);
				
				System.out.println(prop.getProperty("browser"));

			} catch (IOException e) {

				e.printStackTrace();
			}


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void initialization() {

		String BROWSER = prop.getProperty("browser");
		

		if (BROWSER.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "/Users/asarkar/Desktop/TechBodhi/Drivers/chromedriver 2");

			driver = new ChromeDriver();
		}

		else if(BROWSER.equalsIgnoreCase("FF")) {

			System.setProperty("webdriver.gecko.marionette", "/Users/asarkar/Desktop/TechBodhi/Drivers/geckodriver");

			driver = new FirefoxDriver();
		}

		else if (BROWSER.equalsIgnoreCase("safari")) {


			driver = new SafariDriver();

		}

		else if (BROWSER.equalsIgnoreCase("opera")) {


			System.setProperty("webdriver.opera.driver", "/Users/asarkar/Desktop/TechBodhi/Drivers/operadriver");		

			driver = new OperaDriver();

		}
		else 
		{

			System.out.println("This is an INVALID BROWSER");
		}



		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT ,TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);


		String URL = prop.getProperty("url");

		driver.get(URL);


	}

}
