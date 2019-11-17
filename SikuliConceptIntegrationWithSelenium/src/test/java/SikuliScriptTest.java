import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SikuliScriptTest {

	
	
	@Test
	public void YouTubeAutomate() throws Throwable {
		
		
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		//Open any Url (Two Ways)
		driver.get("https://www.youtube.com/watch?v=aKjsy-b00QM");
		//driver.navigate().to("https://phptravels.com/demo/");
		
		
		
		//Create the object of Screen Class
		Screen screen = new Screen();
		
		
		//1. Click on Pause
		Pattern pauseImg = new Pattern("PAUSE_Image.png");
		screen.wait(pauseImg,2000);
		screen.click();
		
		//Click on Play
		Pattern playImg = new Pattern("PLAY_Image.png");
		screen.wait(playImg,2000);
		screen.click();
		
		
		
		
	}
	
	
	
}
