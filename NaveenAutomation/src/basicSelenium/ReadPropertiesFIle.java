package basicSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadPropertiesFIle {
	
	
	@Test
	public void testMethod() throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream  fIS = new FileInputStream("/Users/asarkar/Desktop/GitHub_Project/Automation/NaveenAutomation/src/basicSelenium/config.properties");
		
		//We need to load the the File 
		prop.load(fIS);
		
		System.out.println("The name is :  "+prop.getProperty("name"));
		System.out.println("The name is :  "+prop.getProperty("Name"));// Give "Null"
		System.out.println("The age is : " + prop.getProperty("age"));
	} 
	
	
	
	

}
