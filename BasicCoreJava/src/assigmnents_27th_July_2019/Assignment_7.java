package assigmnents_27th_July_2019;

public class Assignment_7 {

	public static void main(String[] args) { 
		
		//Print alternate elements of String array 
		
		String [] Test_Array = {"ABHI", "RONY", "Abhishek","Sarkar" , "Mobiquity", "Selenium", "Java"};
		
		for(int i=0; i<Test_Array.length; i=i+2) {
			
			System.out.println(Test_Array[i]);
		}
		
	}

}
