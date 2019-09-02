package stringClass;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// String -  1. Belongs to java.lang.String 
		             
		
		String name = "ABHISHEK";
		
				
			//1. CharAt --> Returns a character at specified index.
			System.out.println(name.charAt(1));	
			
			//2. ToUpperCase/ToLowerCase
			
			System.out.println(name.toLowerCase());
			
			// 3. Split --> WIll return array of String
			// 4. Equals/EqualsIgnoreCase --> Should be used for string 
			// 5. trim ---> eliminates white spaces before and after string
			 
			String str = "U1,U2,U3";
			String[] users = str.split(",");
			System.out.println(users); // Can't be printed because its an array ->For loop
			
			for (int i=0; i<users.length; i++)
			{
				
				System.out.println(users[i]);
				
			
			}

			//7. Replace
			
			//8. Substring (Two functions )
			//9. Contains
			
			String Str = "I am new to Selenium  m";
			
			//Occurence of first m
			System.out.println(Str.indexOf('m'));
			
			//Occurence of Second m
			System.out.println(Str.indexOf('m', 4));
			System.out.println(Str.indexOf('m', Str.indexOf('m')+1));
			
			
	
			
			
			
			
			
			
				

	}

}
