package generalProgramming;

public class Print1_Numbers_withoutLoops_8 { // We will use recursion to print the numbers

	public static void main(String[] args) {
		

		printNums(100);
		
	}

	
	
	public static void printNums(int num) {
		
		
		if(num>0) {
			
			printNums(num-1);
			System.out.println(num);
			
			
			
			
		}
	}
	
	
}
