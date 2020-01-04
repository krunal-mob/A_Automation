package generalProgramming;

public class HowToReverseAnInteger_6 {

	
	//Logic Explanation 
	//Step 1 — Isolate the last digit in number --> lastDigit = number % 10
	//Step 2 — Append lastDigit to reverse --> reverse = (reverse * 10) + lastDigit
	//Step 3 - Remove last digit from number --> number = number / 10
	
//	//Learn this code
//	// USE MAMD [Multiply , addition, modulus , division all with 10]
	public static void main(String[] args) {
	
		System.out.println(revNumber(189));
		
    /*int i = 2009;
    
    int rev =0;
    
    while(i>0) {
   	
    	rev = rev *10 + i%10;
    	i = i/10;
    }

    System.out.println(rev);  
    }*/
		
	}
	public static int revNumber(int num) {
		
		int rev = 0;
		
		while (num>0) {
			
			rev = (num % 10) + (rev *10);
			
			num = num/10;
		}
		return rev;
		
	}
	
	
	
	

}
