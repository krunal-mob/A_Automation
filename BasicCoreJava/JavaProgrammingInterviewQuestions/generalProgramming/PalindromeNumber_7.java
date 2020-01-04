package generalProgramming;

public class PalindromeNumber_7 {


	// This is the logic for Palindrome number

	// For stringProgramming , just print the reverse and if the reverse of string is equal to original string 

	public static void main(String[] args) {


		         isPalindrome(10001);

	}


	// 101, 202, 3003, 109901 etc
	public static void isPalindrome(int num) {


		int remainder=0;
		
		int rev=0;
		
		int originalNum  = num;;

		

		while (num>0) {
			remainder = num % 10;
			rev = (rev * 10 ) + remainder;
			num = num/10;
		}

		if (rev == originalNum) {

			System.out.println("The Number is Palindrome");

		}

		else {
			System.out.println("The number is not palindrome");

		}

	}}
