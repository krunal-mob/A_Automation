package utilityPackage;

import java.io.IOException;
import java.util.ArrayList;

import fileHandling.Xls_Reader;



public class TestUtilityClass {


	static Xls_Reader reader;


	public static ArrayList <Object[]> getDataFromExcel() throws IOException {


		ArrayList <Object[]> myData = new ArrayList <Object[]> ();


		//Putting in try-catch block , there might be chances of wrong file address 
		try {

			reader = new Xls_Reader("/Users/asarkar/Desktop/GitHub_Project/Automation/NaveenAutomation/Gmail_TestFile .xls");

		}

		catch (Exception e) {

			e.printStackTrace();		

		}

		//Get the row count 
		int rowCount = reader.getRowCount("Sheet1");
		
		
		//Print the number of rows
		System.out.println(rowCount);

		for (int rowNUM =2 ;rowNUM <= rowCount ; rowNUM++) {

			String firstName = reader.getCellData("Sheet1", rowNUM, 1);
			String lastName = reader.getCellData("Sheet1", rowNUM, 2);
			String userName = reader.getCellData("Sheet1", rowNUM, 3);
			String password = reader.getCellData("Sheet1", rowNUM, 4);
			String confirmPassword = reader.getCellData("Sheet1", rowNUM, 5);

			Object ob[] = {firstName ,lastName , userName  , password , confirmPassword};


			myData.add(ob);


		}

		return myData; 	

	}

}
