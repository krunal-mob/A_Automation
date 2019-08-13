package functions;

public class Function_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String resultFinal =results(35);
	System.out.println(resultFinal);

	}

	
	public static String results(int marks) {
		
		String res; 
		 if(marks==100) {
			res="You have topped the Exams";
			
		}
		else if(marks>=75 && marks<100) {
			res="You have passed with distinction";
		}
		
		else if(marks>=60 && marks<75)
			res="You have passed First Division";
		 
		else if(marks>=35 && marks<60) {
			
			res="You have just passed";
		}
		
		else {
			
			res="You have Failed";
		
		
	}
		return res;
		 
		 
	
}
	}
