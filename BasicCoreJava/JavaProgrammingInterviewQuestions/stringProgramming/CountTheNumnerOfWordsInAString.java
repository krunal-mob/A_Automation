package stringProgramming;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.Multiset.Entry;

public class CountTheNumnerOfWordsInAString {

	public static void main(String[] args) {


		String str = "I am learning Java Selenium Java java Selenium";

		//We will first  split  the string on the  basis of space , split() method
		//will return an array of String. Now we will use HashMap to store the key value 

		Map<String, Integer> map = new HashMap<String, Integer>();

		Integer count = 1;

		String arr[] = 	str.split(" "); //str.toUpperCase().split(" ");

		for (int i=0 ; i<arr.length; i++) {

			if (!map.containsKey(arr[i])) {

				map.put(arr[i], count);
			}
			else {

				map.put(arr[i], map.get(arr[i])+1);
			}
}
		
		//To print the values
		for(java.util.Map.Entry<String, Integer> e : map.entrySet()) {
			
			System.out.println(e.getKey() + "  -- " +  e.getValue());
			
	
		}
			
			
			
			
		}
		
		
		
		

	}


