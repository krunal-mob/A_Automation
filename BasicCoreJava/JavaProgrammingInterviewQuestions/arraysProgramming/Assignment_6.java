package arraysProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment_6 {

	public static void main(String[] args) 
	
	/*
	 * Make an integer array. Write a for loop to print the integer array in
	 * reverse.
	 */
	
	{
		Integer [] Test_Array = new Integer[5]; 
		
		Test_Array[0]= 10;
		Test_Array[1]= 20;
		Test_Array[2]= 30;
		Test_Array[3]= 40;
		Test_Array[4]= 50;
		
		
		
		// METHOD 1
		for (int i=Test_Array.length-1;i>=0;i--) 
		{
			
			System.out.println(Test_Array[i]);
		}
		
		
		
		//METHOD 2 :
		List<Integer> L= Arrays.asList(Test_Array); // To convert the array into List
		
		//System.out.println(L); // List can be directly printed
		
		for(int i=0; i<L.size(); i++) {
			
			//System.out.println(L.get(i)); // for printing the ELements of the List 
			
		 
		}
	
		
		Collections.reverse(L); 
		
		for(int i=0;i<L.size();i++) {
			System.out.println(L.get(i));
		}
		 
		
		
		
		
		
		
		
	}

}
