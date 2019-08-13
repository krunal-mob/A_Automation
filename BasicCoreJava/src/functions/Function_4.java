package functions;

public class Function_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		results(27);
		
		
		
		

	}
	
	public static void results(int marks)
	{
		if(marks==100) {
			System.out.println("You have topped the Exams");
			
		}
		else if(marks>=75 && marks<100) {
			System.out.println("You have passed with distinction");
		}
		
		else if(marks>=60 && marks<75)
			{System.out.println("You have passed First Division");
			}
			
		
		
		else if(marks<60 && marks>35){
			
			System.out.println("You have Just passed");
		}
		
		else if(marks < 35 && marks >=0) {
			
			System.out.println("oops you have failed");
		}
		
		
		else {
			
			System.out.println("This is invalid marks");
		
		
	}
		 

	}}
