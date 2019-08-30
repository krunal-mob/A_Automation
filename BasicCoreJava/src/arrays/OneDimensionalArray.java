package arrays;

public class OneDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = new String[7]; // First way of creating Array
		str[0] = "Abhishek";
		str[1] = "Abhay";
		str[2] = "Suraj";
		str[3]= "Abhi";
		str[4]= "Rony";
		str[5] = "ABhijeet";
		str[6] = "Tech Bodhi";
		
		 System.out.println(str[8]); 
		
		
		// lowest bound/ index = 0
		// Upper bound/ index = n-1 (n is the size of the array)
		 // If the we give the index no. that is more than the size of array,  
		 // Exception : ArrayIndexOutOfBoundsException
		
		for(int i=0; i<=6; i++) {
			
			
			System.out.println(str[i]); // Print all the values of arrays
		}
		
		
		
		
		int phone[] = new int[7];  // Second way of creating array 
		
		phone[0]=1234;
		
		System.out.println(phone[0]);
		
		
		int [] size = {10,20,30 ,40}; // Third way of creating array
		
		for (int i=0;i<size.length;i++) {
			
			System.out.println(size[i]);
		}

	}

}
