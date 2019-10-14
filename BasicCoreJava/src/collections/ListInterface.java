package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
	
		/*
		 * List<stringProgramming> L = new ArrayList<>(); // Generics -
		 * 
		 * L.add("Abhishek"); 
		 * L.add("Abhi"); 
		 * L.add("Tech Bodhi");
		 * 
		 * 
		 * // Easiest is to use is Enhanced for loop
		 * 
		 * for (stringProgramming S : L) {
		 * 
		 * System.out.println(S); }
		 */
		
		
		  List<String> L1 = new LinkedList<String>(); // LinkedList<stringProgramming> --> < > can
		 // be left blank 
		  L1.add("ABHI"); 
		  L1.add("ABHISHEK"); 
		  L1.add("TECH BODHI");
		  
		  for(String S1:L1) { System.out.println(S1);
		  
		  
		  }
		 
		
		
		List<String> L3 = new Vector<String>(); 
		
		L1.add("ABHI");
		L1.add("ABHISHEK");
		L1.add("TECH BODHI");
		
		for(String S1:L3) {
			System.out.println(S1);
	}
	
	
	
		
		
		
		
		// Vector --> Synchronized/ Thread safe 
		//Increases by 100 % 
	

}
	}
