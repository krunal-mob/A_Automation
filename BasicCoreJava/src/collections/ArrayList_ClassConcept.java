package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_ClassConcept {

	public static void main(String[] args) {


		ArrayList<Object> A = new ArrayList<Object>();

		A.add("Abhishek"); 
		A.add("Learning Selenium");
		A.add(27);
		A.add('M');
		A.add(true);
		

		System.out.println(A); // Will print the elements in list manner in [ ] box seperated by comma

		//	A.remove(i); --> To remove any content using index
		//   A.get(i); --> To fetch any value
		// A.size() --> To get the size of the ArrayList

		System.out.println("Printing Using  normal for loop");
		System.out.println("****************************");

		for (int i =0 ; i<A.size(); i++) // Normal for loop
		{

			System.out.println(A.get(i));

		}
		System.out.println("****************************");
		System.out.println("Printing Using  enhanced for loop");
		System.out.println("****************************");

		for(Object O:A) // Enhanced for loop

		{

			System.out.println(O);
		}

		System.out.println("****************************");
		System.out.println("Printing Using  Iterator");
		System.out.println("****************************");

		Iterator<Object> I = A.iterator(); // Using Iterator
		while (I.hasNext())
		{

			System.out.println(I.next());
		}
//------------------------------------------------------------------------------
		//How to print the Arraylist in reverse --> Using ListIterator
		
		System.out.println("$$$$Printing in Reverse direction$$$$");
		
		ListIterator<Object> li = A.listIterator(A.size());
		
		while (li.hasPrevious()) {
			
			System.out.println(li.previous());
		}
		
//------------------------------------------------------------------------------

		ArrayList<Object> A2 = new ArrayList<Object>();
		A2.add("Rony");
		A2.add('M');


		A.addAll(A2); // Adds all the elements of A2 to A
		//A.removeAll(A2); Removes all the elements of A2 from A
		//A.retainAll(A2); Print only the common elements  from A2 and A.
		
		System.out.println("****************************");

		for(Object O:A) // Enhanced for loop

		{

			System.out.println(O);
		}		


		// We will create the object of the Employee class here//
		//How to define user defined class object arrayList

		Employee E1 = new Employee("GANDU", 22, 'M');
		Employee E2 = new Employee("Rony", 10, 'M');

		ArrayList<Employee> E = new ArrayList<Employee>();
		E.add(E1);
		E.add(E2);

		System.out.println("The age of E1 is " + E1.age);
		System.out.println("The age of E2 is " + E2.age);



	}

}
