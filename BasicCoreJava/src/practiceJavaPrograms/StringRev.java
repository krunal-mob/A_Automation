package practiceJavaPrograms;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A = "18811";
		String revString = "";
		
		
		
		for(int i = A.length()-1 ; i >= 0; i--) {
			
			revString = revString + A.charAt(i);
			
		}
		
		
		if (A.equalsIgnoreCase(revString)) {
			
			
			
			System.out.println("This String is Palindrome ");
		}
		else {
			System.out.println("OOPS --  This String is not  Palindrome ");
			
			
		}
		
		
	}

}
