package seleniumGRID;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Node2 {
	
	
	@Test
	public void testMethodNode2() throws MalformedURLException {
		
		DesiredCapabilities cap = DesiredCapabilities.firefox();

		//Define Desired capabilities
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.MAC);

		//Define Chrome Options --> Recently introduced for chrome
		//ChromeOptions options = new ChromeOptions();
		//options.merge(cap);


		String hubURL= "http://192.168.0.103:4444/wd/hub"; //Clients should connect to http://192.168.0.103:4444/wd/hub

		WebDriver driver = new RemoteWebDriver(new URL(hubURL), cap); //can use cap also instead of options
   
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://www.youtube.com/");
		
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
