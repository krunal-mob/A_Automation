package fileHandling;

import java.io.FileInputStream; // When we use any Class that is outside of our package
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelTest {

	public static void main(String[] args) throws  Exception  

	// FileNotFoundException extends IOException: 
	{


		String path = "/Users/asarkar/Desktop/GitHub_Project/Automation/BasicCoreJava/src/fileHandling/TestExcel_FileHandling.xls";

		FileInputStream file = new FileInputStream(path);
		
		/*
		 * The Logical Flow for accessing an Excel File -->
		 * 
		 *  HSSF --> .xls Format
		 *  XSSF --> .xlsx Format
		 *  
		 *  HSSFWorkBook --> HSSFSheet --> HSSFRow --> HSSFCell --> Cell Data
		 *
		 */
		
  //   XSSFWorkbook Xwb = new XSSFWorkbook(file);
    
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
	 * 
	 * Obfuscation --> the action of making something obscure, unclear, or unintelligible.
	 * 
	 * HSSF -Horrible SpreadSheet Format.
	 */







	public static ReadExcelTest test() { // Here ReadExcel is the return type. 

		return new ReadExcelTest();
	}



}


