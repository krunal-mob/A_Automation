package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] data = new String[5][2]; // 5 Rows and 2 Column
		
		System.out.println(data.length); // Print the number of rows
		System.out.println(data[0].length); // Print the number of columns 
		
		
	
		
		//Row 1
	
		data[0][0]= "U1"; //Column 1 
		data[0][1]= "P1"; //Column 2 
		
		//Row 2
		
		data[1][0]= "U2";
		data[1][1]= "P2";
		
		//Row 3
		
		data[2][0]= "U3";
		data[2][1]= "P3";
		
		//Row 4
		
		data[3][0]= "U4";
		data[3][1]= "P4";
		
		//Row 5
		
		data[4][0]= "U5";
		data[4][1]= "P5";
		
		for (int i=0 ;i<data.length ; i++ )
		{
			for (int j=0 ; j<data[0].length; j++) // j<data[0].length 
				
				
		 {
				
				System.out.print(data[i][j] + " ");
			}
			
			System.out.println();
		}
		
		
	}

}
