package loops;

public class DoWhile_Loop { // Generally we don't use this in selenium , 
	// here the logic will execute at least once

	public static void main(String[] args) {
		
		
		int ticket=20;
		
		do {
			System.out.println("The ticket number is " + ticket);
			ticket++;
		}
		while(ticket<50);

	}

}
