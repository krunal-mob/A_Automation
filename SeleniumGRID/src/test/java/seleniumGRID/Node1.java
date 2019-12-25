package seleniumGRID;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Node1 {



	@Test
	public void testMethod() throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();

		//Define Desired capabilities
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.MAC);

		//Define Chrome Optiomns --> Recently introduced for chrome
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);


		String hubURL= "http://192.168.0.103:4444/wd/hub"; //Clients should connect to http://192.168.0.103:4444/wd/hub

		WebDriver driver = new RemoteWebDriver(new URL(hubURL), options); //can use cap also instead of options

		driver.get("https://www.guru99.com/introduction-to-selenium-grid.html#5");
		System.out.println(driver.getTitle());


	}








}
