package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.Configaration;

public class ApplicationLibrary {

	public WebDriver launchBrowser(String browserName) {

		WebDriver driver = null;

		if (browserName.equalsIgnoreCase("Chrome")) {


			System.setProperty("webdriver.chrome.driver", Configaration.chromeDriverPath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		}

		else if (browserName.equalsIgnoreCase("Firefox")){

			driver = new FirefoxDriver();
		}
		return driver;



	}






	public void navigate(WebDriver driver,String url) {

		driver.get(url);


	}
	
	public boolean isElementPresent(WebDriver driver, By element) {
		
		if (driver.findElements(element).size()>=1) {
			return true;
			
		}
		
		else 
			return false;
	}
	
}
