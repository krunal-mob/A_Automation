package exceptionHandling;

public class UncheckedExceptions {

	
	public static UncheckedExceptions obj; // NullPointerException 
	public static void main(String[] args) {
		
		String str = "anand" ;
		
		//System.out.println(str.charAt(8)); //StringIndexOutOfBoundsException
		
		//System.out.println(10/0); //ArithmeticException
		
		
		obj.test();
		
	}

	
	public static void test() {
		System.out.println("Test method called");
		
	}
}
