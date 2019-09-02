package basicAnnotations.M3;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseModule3 {

	@BeforeTest
	public void preModule() {
		
		System.out.println("Precondition for module 3");
		
		
	}
	
	@AfterTest
    public void postModule() {
		
		System.out.println("Postcondition for module 3");
		
		
	}
	
	
	
	
	
}
