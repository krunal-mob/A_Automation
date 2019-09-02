package basicAnnotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	
	@BeforeSuite
	public void setUp() {
		
		
		System.out.println("PreCondition for Suite ");
	}
	
	
	@AfterSuite
       public void tearDown() {
		
		
		System.out.println("PostCondition for Suite ");
	}

}
