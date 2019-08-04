package stringClass;

public class stringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "ABHISHEK";
		
				
			//1. CharAt 
			System.out.println(name.charAt(1));	
			
			//2. ToUpperCase/Lower
			
			System.out.println(name.toLowerCase());
			
			// 3. Split 
			// 4. Equals --> Should be used for string 
			// 5. Split 
			 
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
			
			
	
			
			
			
			
			
			
				

	}

}
