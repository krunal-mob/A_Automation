package basicAnnotations.M3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scenario_5 {
	
	@Test
	public void test1() {
		
		System.out.println("Test Case 1 for scenario 5");
	}
	
	@Test
	public void test2() {
		
		System.out.println("Test Case 2 for scenario 5");
	}
	
	@Test
	public void test3() {
		
		System.out.println("Test Case 3 for scenario 5");
	}
	
	@BeforeMethod
	public void testCasePreCondition() {
		
		System.out.println("Test Case Pre condition");
	}
	
	
	@AfterMethod
public void testCasePostCondition() {
		
		System.out.println("Test Case Post condition");
	}
	
	
	@BeforeClass
	public void preScenario() {
		
		System.out.println("Pre condition for scenario 5");
	}

	@AfterClass
    public void postScenario() {
		
		System.out.println("Post condition for scenario 5");
	}
	
}

