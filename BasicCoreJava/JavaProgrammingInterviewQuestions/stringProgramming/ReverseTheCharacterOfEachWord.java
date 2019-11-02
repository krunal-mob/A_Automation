package stringProgramming;

public class ReverseTheCharacterOfEachWord {

	public static void main(String[] args) {

		String str = "abhi rony bittu home";

		String[] arry = str.split(" ");

		String finalResult = "";

		for(String word : arry) {

			String revWord = "";

			for(int i = word.length() - 1 ; i>=0 ; i--) {

				revWord = revWord + word.charAt(i);

				//System.out.println(revWord);

			}

			//System.out.println(revWord);
			finalResult = finalResult + revWord + " ";
			
			
		}

		System.out.println(finalResult);

		
	}

}
