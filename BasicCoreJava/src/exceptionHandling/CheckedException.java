package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		// TODO Auto-generated method stub

		System.out.println("name");
		
		Thread.sleep(600); // Checked exceptions - at the time of compiling 
		
		UncheckedExceptions.test();
		
		System.out.println("surname");
		
		FileInputStream obj = new FileInputStream("");
		
	}

}
