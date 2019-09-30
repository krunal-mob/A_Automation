package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasicAnnotaions_1 {

	//In this Class we will see the sequence of the annotaions executed

	//1
	@BeforeSuite
	public void beforeSuite() {

		System.out.println("Before Suite Method");

	}

	//2
	@BeforeTest
	public void beforeTest() {

		System.out.println("Before Test Method");

	}

	//3
	@BeforeClass
	public void beforeClass() {

		System.out.println("Before Class Method");
	}

	//4 BeforeMethod and AfterMethod will be execute every time for each @Test method.
	@BeforeMethod
	public void beforeMethod() {

		System.out.println("Before Method");
	}


	@Test(priority = 3)
	public void testMethod1() {
		System.out.println("Test Script 1");

	}

	@Test(priority = 2)
	public void testMethod2() {

		System.out.println("Test Script 2");

	}

	@Test(priority = 1)
	public void testMethod3() {

		System.out.println("Test Script 3");
	}


	@AfterMethod
	public void afterMethod() {

		System.out.println("After Method");

	}

	@AfterClass
	public void afterClass() {


		System.out.println("After Class method");
	}



	@AfterTest
	public void afterTest() {

		System.out.println("After Test Method");
	}

	@AfterSuite // This method is not running  
	public void afterSuite() {

		System.out.println("After Suite Method");
	}


}



