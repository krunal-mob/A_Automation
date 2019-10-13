package java_ProgrammingInterview_Questions;

public class PalindromeNumber {


	// This is the logic for Palindrome number

	// For String , just print the reverse and if the reverse of string is equal to original string 

	public static void main(String[] args) {


		         isPalindrome(10081);

	}


	// 101, 202, 3003, 109901 etc
	public static void isPalindrome(int num) {


		int remainder=0;
		int sum=0;
		int temp =0;

		temp = num;

		while (num>0) {
			remainder = num % 10;
			sum = (sum * 10 ) + remainder;
			num = num/10;
		}

		if (temp == sum) {

			System.out.println("The Number is Palindrome");

		}

		else {
			System.out.println("The number is not palindrome");

		}

	}}
