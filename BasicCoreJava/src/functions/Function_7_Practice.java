package functions;

public class Function_7_Practice {

	public static void main(String[] args) {
		
		int[] marks= {35,90,34,80,50,70};
		
		
		String S=finalResult90(marks);
		System.out.println(S);
		
		// TODO Auto-generated method stub

	}

	
	
	public static String finalResult90(int arr[]){
		
		int sum=0;
		String res=""; 
		
		
		for (int i=0;i<arr.length;i++) {
			
			//sum=sum+arr[i]; 
			// Sum of the elements of  integer array
			
			
			if(arr[i]<35) {
				
			res= "You have failed" ;
			return res;
				 
				 
			 }
			
			else {
				
				sum=sum+arr[i];
			}
		}
		
		
		        System.out.println("The sum is " +sum);
				double percentage =(sum*100)/600;
				System.out.println("The Percentage is "+percentage);
				
				
				
				
				
				
				 if(percentage==100) {
					res="You have topped the Exams";
					
				}
				else if(percentage>=75 && percentage<100) {
					res="You have passed with distinction";
				}
				
				else if(percentage>=60 && percentage<75)
					res="You have passed First Division";
				 
				else if(percentage>=35 && percentage<60) {
					
					res="You have just passed";
				}
				
				else {
					
					res="You have Failed";
			}
				return res;
			
			
			
		//	System.out.println(arr[i]);
			
			
		
		
		
		
		}
}
