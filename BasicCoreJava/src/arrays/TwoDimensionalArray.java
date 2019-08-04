package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] data = new String[5][2]; // 2 Rows and 5 Columns
		
		
	
		
		//Row 1
	
		data[0][0]= "U1";
		data[0][1]= "P1";
		
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
		
		for (int i=0 ;i<=4 ; i++ )
		{
			for (int j=0 ; j<=1; j++) // j<data[0].length 
				
				
		 {
				
				System.out.print(data[i][j]+  " ");
			}
			System.out.println();
		}
		
		
	}

}
