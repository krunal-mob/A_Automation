package TestNGListener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShot {

	 WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		
		
		
	}
	
	@Test
	public  void takeScreenshotAtEndOfTest() throws IOException {
		
		Assert.assertEquals(false, true);
		
		
		}
	
	
	@AfterMethod
	public void  tearDoen() {
		
		
		
		
		
	}
	
}
