package stringProgramming;

public class GenericFunctionToIsolateLast4Digit {

	public static void main(String[] args) {


		/*
		 * Java String substring method is overloaded and has two variants.
		 * 
		 * 1--> substring(int beginIndex): This method returns a new string that is a
		 * substring of this string. The substring begins with the character at the
		 * specified index and extends to the end of this string. 
		 * 
		 * 2--> substring(int beginIndex, int endIndex): The substring begins at the specified beginIndex
		 * and extends to the character at index endIndex – 1. Thus the length of the
		 * substring is (endIndex – beginIndex).
		 * 
		 * beginIndex is inclusive and endIndex is exclusive in both substring methods.

		 * 
		 * Both the string substring methods can throw IndexOutOfBoundsException if any of the below conditions met.
         
          1--> if the beginIndex is negative 
          2--> endIndex is larger than the length of this String object
          3--> beginIndex is larger than endIndex
		 * 
		 * 
		 * 
		 */
		
		String s1 = "1111 Order ID is 1234";
		
		System.out.println("FIRST FOUR Digit of the String -->  " + s1.substring(0,4));
		
		System.out.println("Last FOUR Digit of the String -->  " + s1.substring(s1.length()-4));
		





	}

}
