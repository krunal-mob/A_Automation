package stringProgramming;

public class CountCharacterOccurence {

	public static void main(String[] args) {

		String str = "java is object oriented programming language";

		// We will use length() and replaceAll() method

		int count = str.length() - str.replaceAll("a", "").length();


		System.out.println("The repeated count is -- " + count);

	}

}
