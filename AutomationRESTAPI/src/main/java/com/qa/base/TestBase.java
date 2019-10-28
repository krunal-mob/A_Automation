package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

	public Properties prop;
	FileInputStream fis;

	public TestBase() {

		prop= new Properties();

		
			 
			try {
				fis = new FileInputStream("/Users/asarkar/Desktop/GitHub_Project/Automation/AutomationRESTAPI/src/main/java/com/qa/config/congig.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		
		
		
		
		
		
	
		}
	
	


}
