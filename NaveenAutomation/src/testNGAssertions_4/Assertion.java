
package testNGAssertions_4;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

	//Hard Assert – Hard Assert throws an AssertException immediately when an assert statement fails 
	//and test suite continues with next @Test
	@Test(priority = 1)
	public void hardAssert() {


		System.out.println("Hard Assert method Started ");

		Assert.assertTrue(false); 

		System.out.println("Hard Assert method Failed");


	}

	
	
	//Soft Assert – Soft Assert collects errors during @Test. Soft Assert does not throw an exception 
	//when an assert fails and would continue with the next step after the assert statement.
	//If there is any exception and you want to throw it then you need to use assertAll() method 
	//as a last statement in  the @Test
	
	@Test(priority = 0)
	public void softAssert() {


		SoftAssert softAssert = new SoftAssert();

		System.out.println("Soft Assert method Started ");

		softAssert.assertTrue(false); 

		System.out.println("Soft Assert method Failed");

		softAssert.assertAll();

	}


}
