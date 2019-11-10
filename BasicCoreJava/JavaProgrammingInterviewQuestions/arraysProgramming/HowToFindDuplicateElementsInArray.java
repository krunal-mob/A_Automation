package arraysProgramming;

import java.util.HashSet;
import java.util.Set;

public class HowToFindDuplicateElementsInArray {

	public static void main(String[] args) {



		String  progLanguage[] = {"java", "python" , "ruby" , "java", "python", "ruby"};

		//Brute Force Method
		int arrSize = progLanguage.length;


		for(int i = 0 ; i<arrSize; i++) {

			for(int j=i+1 ; j<arrSize ; j++) {


				if(progLanguage[i]==progLanguage[j]) {



					System.out.println(progLanguage[i]);




				}




			}


			System.out.println("*****************************");




		}

	}}