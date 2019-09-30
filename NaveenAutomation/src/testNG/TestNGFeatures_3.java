package testNG;

import org.testng.annotations.Test;

public class TestNGFeatures_3 {
	
	// 1. dependsOnMethod
	
	
	@Test(priority = 0)
	public void test1() {
	
		int a = 7/0;
		
		
	}

	@Test(priority =1 ,dependsOnMethods = "test1")
	public void test2() {
		
		
	}
	
}
