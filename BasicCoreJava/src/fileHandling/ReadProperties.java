package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws Exception {


		FileInputStream file = new FileInputStream("/Users/asarkar/Desktop/GitHub_Project/Automation/BasicCoreJava/src/fileHandling/OR.properties");

		Properties or = new Properties();
		or.load(file);
		System.out.println(or.getProperty("name"));


	}

}
