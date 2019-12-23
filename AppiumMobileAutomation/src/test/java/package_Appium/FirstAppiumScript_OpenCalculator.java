package package_Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class FirstAppiumScript_OpenCalculator {
	
	RemoteWebDriver remoteWebdriver; //Class
	
	WebDriver webDriver; //Interface
	
	AppiumDriver<MobileElement> appiumDriver; //Class
	
	static AndroidDriver<MobileElement>  androidDriver; //Class
	
	IOSDriver<MobileElement> iosDriver; //Class
	
	
	public static void main(String[] args) {
		
		try {
			openCalculator();
			
		} catch (MalformedURLException e) {
			
			e.getCause();
			e.getMessage();
			e.printStackTrace();
		}

	}
	
	
	public static void openCalculator() throws MalformedURLException {
		
	//1. Set the Desired Capabilities
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "OnePlus 7 Pro");
		cap.setCapability("udid", "4c660678");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.oneplus.calculator");
		cap.setCapability("appActivity", "com.oneplus.calculator.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		androidDriver = new AndroidDriver<MobileElement>(url,cap);
		
		System.out.println("Application Started");
		
	}

}
