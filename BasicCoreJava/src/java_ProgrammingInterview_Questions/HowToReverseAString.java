package java_ProgrammingInterview_Questions;

public class HowToReverseAString {

	
	
	//Two ways -- 1> Using normal for loop 2> Using the reverse() of StringBuffer
	
	
	public static void main(String[] args) {


		String s1 = "Selenium is the best";

		int len = s1.length();

		String rev = "";

		for (int i = len-1 ; i>=0 ; i--) {

			rev = rev + s1.charAt(i); 
		}
		System.out.println(rev);






		//		//Using reverse function of StringBuffer Class
		//		StringBuffer S = new StringBuffer("Selenium");
		//		System.out.println(S.reverse());



	}

}
