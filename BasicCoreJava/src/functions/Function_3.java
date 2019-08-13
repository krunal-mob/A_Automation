package functions;

public class Function_3 {

	public static void main(String[] args) {
		
		boolean Value = eligible(44);
		
		if(Value) { // It means that is taking this as true , No need to Compare 
			// using '==' and '.equals operator' for boolean value.
 			System.out.println("Hurray You are Eligible");
			
		}
		else {
			System.out.println("Oops You are not Eligible");
		}
		

	}

	
	
	
	public static boolean eligible(int age) {
		
		
		if(age >=18 && age<=30) {
			return true;
		}
		
		else 
		
		{
		return false;
		}
		
	
	}
}
