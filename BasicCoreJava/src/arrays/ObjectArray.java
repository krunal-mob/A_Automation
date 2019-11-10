package arrays;

import java.lang.reflect.Method;

public class ObjectArray {

	String a = "abhi";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object objArray[]=new Object[5];
		
		objArray[0]=100;
		objArray[1]='M';
		objArray[2]=true;
		objArray[3]="Abhishek";
		objArray[4]=12.22;
		
		System.out.println(objArray[4]);
		
	
		
		//Enhanced for loop
		
		for (Object o:objArray) 
		
		{
			
			System.out.println(o);
		}
		
		
		
		
		
		
	}

	
	
	
}
