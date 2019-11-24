package exceptionHandling;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		try {
			
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			
			System.out.println("This is not possible");
			System.out.println(e.getMessage());
		}
		
		/*
		 * catch (ArithmeticException e) { // TODO: handle exception }
		 *Unreachable catch block for ArithmeticException. 
		 *It is already handled by the catch block for ArithmeticException
		 */
	}

}
