package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap_ClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Abhishek");
		hm.put(2, "Sarkar");
		hm.put(3, "Rony");
		hm.put(4, "Bittu");
		
		hm.remove(4); //  Removing and value using key. 
		
		
		
	//	get(key) --> method present inside HashMap 
		
		
		System.out.println(hm);
		System.out.println(hm.get(2)); //--> Print 'Sarkar' at the console.
		
		// This only prints the Value of the provided key.
		
		//--Imp --> To traverse the HashMAp i.e to print the key-value pair together
		// we us the below technique.
		
		// To traverse a HashMap , we use Entry Interface.
		
		for(Entry<Integer, String> e : hm.entrySet()) {
			
			System.out.println(e);
			System.out.println("$$$$$$$$$$");
			System.out.println(e.getKey() + "   " + e.getValue());
			
			 // getKey()  and getValue() present inside Entry Interface.
		}
		
		
		//--> Important from interview Point of view
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Abhi", 20, 'M');
		Employee e2 = new Employee("Abhishek", 30, 'M');
		Employee e3 = new Employee("Rony", 40, 'M');
		
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		System.out.println("******************");
		
		for (Entry<Integer, Employee> er : emp.entrySet()) {
			
			Employee E = er.getValue();
			
			System.out.println(er.getKey()+ "   " + E.name +" "+ E.age + " "+ E.gender);
		}
		
		
	}

}
