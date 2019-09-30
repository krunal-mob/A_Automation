package testNG;

import org.testng.annotations.Test;

public class InvocationCountTest {

	//invocationCount	

	@Test (invocationCount = 5)
	public void test() {

		int sum = 10 + 20;

		System.out.println("The Sum is "+sum);








	}
}
