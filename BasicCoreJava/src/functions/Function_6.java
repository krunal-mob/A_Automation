package functions;

public class Function_6 {

	public static void main(String[] args) {
		
		int[] marks= {80,90,80,80,50,70};
		
		
		String S=finalResult90(marks);
		System.out.println(S);
		
		// TODO Auto-generated method stub

	}

	
	
	public static String finalResult90(int arr[]){
		
		int sum=0;
		
		
		
		for (int i=0;i<arr.length;i++) {
			
			sum=sum+arr[i];  // Sum of the elements of  integer array
			
			
			
		//	System.out.println(arr[i]);
			
			
		}
		System.out.println(sum);
		double percentage =(sum*100)/600;
		System.out.println(percentage);
		
		
		String res; 
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
		return res;}
}
