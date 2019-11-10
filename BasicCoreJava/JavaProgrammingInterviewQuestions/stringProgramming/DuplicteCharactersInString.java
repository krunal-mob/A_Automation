package stringProgramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicteCharactersInString {


	public static void main(String[] args) {

		String str = "jAvaj";

		char arr[] = str.toLowerCase().toCharArray(); //toCharArray() returns the array of char , breaks the given string into its chars 


		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Integer count = 1;
		
		for (int i = 0 ; i<arr.length ; i++) {

			if(!map.containsKey(arr[i])) {

				map.put(arr[i], count);
			}

			else {

				map.put(arr[i], map.get(arr[i])+1);


			}

		}
		
		
		for(Entry<Character, Integer> e : map.entrySet()) {
			
			//System.out.println(e.getKey()+"--"+ e.getValue());
			
			
			
			if (e.getValue()>1) {
				System.out.println("The repeated character is  -- "+e.getKey()+ "  "  + "The Count is--> " + e.getValue());
				
			}
		}
		
		
		
		
		

	}
}
