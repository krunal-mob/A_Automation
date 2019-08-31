package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Test_Xls_Reader {

	public static void main(String[] args) throws Exception {
		
	Xls_Reader xl = new Xls_Reader("/Users/asarkar/Desktop/GitHub_Project/Automation/BasicCoreJava/src/fileHandling/TestExcel_FileHandling.xls");
	int rows = xl.getRowCount("Sheet1");
	int column = xl.getColumnCount("Sheet1");
	
	
	//	System.out.println(rows + "****" + column);
	
	for (int i = 1; i<=rows; i++) {
		
	
		
		for (int j=1 ; j<=column ; j++) {
			
			System.out.println(xl.getCellData("Sheet1", i, j)); 
		}
		
		
		
		
		
	}

	}
	

}
