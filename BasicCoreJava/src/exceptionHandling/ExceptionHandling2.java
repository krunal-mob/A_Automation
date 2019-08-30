package exceptionHandling;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		try {
			String str = "anand";
			System.out.println(str.charAt(9));
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			
			System.out.println("This is not possible");
			System.out.println(e.getMessage());
			
		}
catch(StringIndexOutOfBoundsException e) {
			
			System.out.println("This is not possible");
			System.out.println(e.getMessage());
		}
	}

}
