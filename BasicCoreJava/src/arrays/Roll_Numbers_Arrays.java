package arrays;

public class Roll_Numbers_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rollNumber[]=new int[7];
		rollNumber[0] = 101;
		rollNumber[1] = 102;
		rollNumber[2] = 103;
		rollNumber[3] = 104;
		rollNumber[4] = 105;
		rollNumber[5] = 106;
		rollNumber[6] = 107;
		
		
		
		
		
		int strLength= rollNumber.length; // Gives the size of array
		
		int sum=0;
		for (int i=0; i<strLength; i++) {
	    // for(i=0; i<=7); i++)
			
			System.out.print(rollNumber[i] + ",");
			
			sum = sum + rollNumber[i]; // Sum of the  integer  array
		}
		 System.out.println(" ");
		System.out.println("The sum of the elements of array is -  " + sum);
		
		

	}

}
