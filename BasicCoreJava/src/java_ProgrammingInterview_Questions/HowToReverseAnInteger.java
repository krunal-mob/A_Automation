package java_ProgrammingInterview_Questions;

public class HowToReverseAnInteger {

	
	//Two ways 1> Learn the below code 
	//2> Convert to String/StringBuffer using Wrapper Class and the apply string reverse or 
	// reverse method from StringBuffer.
	//
	
//	//Learn this code
//	// USE MAMD [Multiply , addition, modulus , division all with 10]
//	public static void main(String[] args) {
//		
//    int i = 2009;
//    
//    int rev =0;
//    
//    while(i!=0) {
//    	
//    	rev = rev *10 + i%10;
//    	i = i/10;
//    }
//    
//     System.out.println(rev);  
//		}
//		
	
	
	
	public static void main(String[] args) {
	
	int i = 3001;
	String S = String.valueOf(i);
	String rev = "";
	for (int a=S.length()-1; a>=0 ; a--) {
		
		rev = rev + S.charAt(a);
		}
	System.out.println(rev);
	
	
	}
	
	
	

}
