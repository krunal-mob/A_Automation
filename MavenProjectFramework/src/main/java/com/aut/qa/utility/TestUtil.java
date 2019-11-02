package com.aut.qa.utility;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import com.aut.qa.base.TestBase;

public class TestUtil extends TestBase  {

	public static long PAGE_LOAD_TIMEOUT = 20;

	public static long IMPLICIT_WAIT = 10;



	public void switchToMainPanelFrame() {

		driver.switchTo().frame("mainpanel");

	}

	public void switchToLeftPanelFrame() {

		driver.switchTo().frame("leftpanel");

	} 


	//This screenshot method is for general utility whenever we want to take the screenshot in 
	//our test scripts
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String currentDir = System.getProperty("user.dir");

		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));

	}
	

	//This screenshot method is created for testNG Listener for the failedTestCases
	public static void takeScreenshotFailedTest(String testMethodName) throws IOException {
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		

		FileUtils.copyFile(scrFile, new File("/Users/asarkar/Desktop/GitHub_Project/Automation/MavenProjectFramework/FailedTestCaseScreenShots/" + testMethodName  + "_FailedShot.jpeg" ));

	}


}

