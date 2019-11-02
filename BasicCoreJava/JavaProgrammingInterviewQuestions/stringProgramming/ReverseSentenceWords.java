package stringProgramming;

public class ReverseSentenceWords {

	public static void main(String[] args) {



		String str = "I am learning selenium";

		String[] arry =  str.split(" ");


		/*
		 * for (int i =0 ; i<arry.length ; i++) {
		 * 
		 * System.out.println(arry[i]); }
		 */
		String 	finalString = "";

		for (int i = arry.length -1; i>=0 ; i--) {

			finalString = finalString + arry[i] + " ";



			//System.out.println(arry[i]);

			//System.out.print(arry[i] + " ");
		}


		System.out.println(finalString);
	}

}
