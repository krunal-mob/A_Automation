package General;

public class HowToFindPrimeNumbers {

	// Prime Number :  a number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11).		
	// 2 is the lowest prime number


	public static boolean isPrime(int num) {

		//Check Corner Cases

		if (num <= 1) {

			return false;
		}

		for (int i = 2 ; i<num ; i++) {

			if(num % i ==0) {
				return false;
			}	
		}
     return true;


	}

	public static void main(String[] args) {


		boolean flag = isPrime(2);
		
		if (flag) {
			
			System.out.println("The number is Prime");
		}
          
		else 
		{
			
			System.out.println("The numner is not Prime");
		}

















	}

}
