package basicAnnotations.M1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseModule1 {

	@BeforeTest
	public void preModule() {
		
		System.out.println("Precondition for module 1");
		
		
	}
	
	@AfterTest
    public void postModule() {
		
		System.out.println("Postcondition for module 1");
		
		
	}
	
	
	
	
	
}
