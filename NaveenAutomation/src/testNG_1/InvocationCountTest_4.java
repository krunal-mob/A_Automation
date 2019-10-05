package testNG_1;

import org.testng.annotations.Test;

public class InvocationCountTest_4 {

	//invocationCount	

	@Test (invocationCount = 5)
	public void test() {

		int sum = 10 + 20;

		System.out.println("The Sum is "+sum);








	}
}
