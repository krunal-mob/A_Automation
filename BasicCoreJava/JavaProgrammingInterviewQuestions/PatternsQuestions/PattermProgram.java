package PatternsQuestions;

public class PattermProgram {
	
	
	//90 degree star pattern
	//* 
	//* * 
	//* * * 
	//* * * * 


	public static void main(String[] args) {

		pyramidPattern(5);

	}



	public static void pyramidPattern(int n) 
	{ 
		

		// outer loop to handle number of rows 
		//  n in this case 
		for(int i=0; i<n; i++)       { 

			//  inner loop to handle number of columns 
			//  values changing acc. to outer loop     
			for(int j=0; j<=i; j++) 
			{ 
				// printing stars 
				System.out.print("* "); 
			} 

			// ending line after each row 
			System.out.println(); 
		} 
	} 



}




