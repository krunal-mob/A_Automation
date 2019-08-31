package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class SetDataInExcel {

	public static void main(String[] args) throws IOException {
		// TO write , we need to close the excel
		
		String path = "/Users/asarkar/Desktop/GitHub_Project/Automation/BasicCoreJava/src/fileHandling/TestExcel_FileHandling.xls";
		
		FileInputStream file = new FileInputStream(path);

		HSSFWorkbook WB = new HSSFWorkbook(file);



		HSSFSheet sheet=WB.getSheet("Sheet1"); 
		

		HSSFRow row=sheet.getRow(0);

		HSSFCell cell=row.getCell(0);
		
		cell.setCellValue("Abhishek");
		
		FileOutputStream fileout = new FileOutputStream(path);
		
		WB.write(fileout);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
