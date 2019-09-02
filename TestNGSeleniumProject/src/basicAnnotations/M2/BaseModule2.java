package basicAnnotations.M2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseModule2 {

	@BeforeTest
	public void preModule() {
		
		System.out.println("Precondition for module 2");
		
		
	}
	
	@AfterTest
    public void postModule() {
		
		System.out.println("Postcondition for module 2");
		
		
	}
	
	
	
	
	
}

