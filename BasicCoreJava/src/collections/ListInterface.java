package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
	
		/*
		 * List<String> L = new ArrayList<>(); // Generics -
		 * 
		 * L.add("Abhishek"); 
		 * L.add("Abhi"); 
		 * L.add("Tech Bodhi");
		 * 
		 * 
		 * // Easiest is to use is Enhanced for loop
		 * 
		 * for (String S : L) {
		 * 
		 * System.out.println(S); }
		 */
		
		/*
		 * List<String> L1 = new LinkedList<String>(); // LinkedList<String> --> < > can
		 * be left blank L1.add("ABHI"); L1.add("ABHISHEK"); L1.add("TECH BODHI");
		 * 
		 * for(String S1:L1) { System.out.println(S1);
		 * 
		 * 
		 * }
		 */
		
		
		List<String> L1 = new Vector<String>(); 
		
		L1.add("ABHI");
		L1.add("ABHISHEK");
		L1.add("TECH BODHI");
		
		for(String S1:L1) {
			System.out.println(S1);
	}
	
	
	// Arraylist --> Data Structure 
	//	--> uses Dynamic Array 
		// Storing and accessing is best / faster
		// Manipulations --> Slow
		//Arraylist increases its size by 50 % when space is over
		
		// Linked list --> uses doubly linked list
		// <Manipulations --> Faster 
		
		
		// Vector --> Synchronized/ Thread safe 
		//Increases by 100 % 
	

}
	}
