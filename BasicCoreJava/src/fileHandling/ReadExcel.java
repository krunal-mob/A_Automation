package fileHandling;

import java.io.FileInputStream; // When we use any Class that is outside of our package
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws  Exception  
	
	// FileNotFoundException extends IOException: 
	{
		

String path = "/Users/asarkar/Desktop/GitHub_Project/Automation/BasicCoreJava/src/fileHandling/TestExcel_FileHandling.xls";
	
FileInputStream file = new FileInputStream(path);

HSSFWorkbook WB = new HSSFWorkbook(file);



HSSFSheet sheet=WB.getSheet("Sheet1"); 
// Return type can be identified by simply hovering over the method/
// In this case the return type of getSheet is HSSFSheet.

HSSFRow row=sheet.getRow(0);

HSSFCell cell=row.getCell(0);

String data =cell.getStringCellValue();

System.out.println(data);




	}



		/*
		 * Poi Api --> Set of Jar files to read excel Apache POI (Poor Obfuscation
		 * Implementation) is an API written in Java to support read and write
		 * operations – modifying office files. This is the most common API used for
		 * Selenium data driven tests.
		 */







public static ReadExcel test() { // Here ReadExcel is the return type. 
	
	return new ReadExcel();
}
		
		
		
	}


