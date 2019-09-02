package java_ProgrammingInterview_Questions;

import java.util.HashSet;
import java.util.Set;

public class HowToFindDuplicateElementsInArray {

	//Two ways 1> Normal nested for loop 
	//2 >  Using HashSet
	
	
	public static void main(String[] args) {
		
    //First Method
		
		String  progLanguage[] = {"java", "python" , "ruby" , "java",};
		
		for(int i = 0 ; i<progLanguage.length; i++) {
			
			for(int j=i+1 ; j<progLanguage.length ; j++) {
				
				if(progLanguage[i]==progLanguage[j]) {
					
				
                System.out.println(progLanguage[i]);
				}
				
				
				
			}
		}
		
	
		System.out.println("*****************************");
		
		//Using HashSet
		
	
		
	}

}
