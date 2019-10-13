package testNG_1;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest_5 {

	//this will stop the execution after the specified tie  secs.
	
	  @Test(priority = 2,timeOut = 10)
	  
	  public void timeOutTest() {
	  
	  int i = 1;
	  
	  while (i==1) { System.out.println(i); }
	  
	  
	  }
	 
	
	
	//expectedException 
	@Test(priority = 1 , expectedExceptions = ArithmeticException.class)
	public void expectedException() {
		
		int sum = 20/0;
		
	}
	
}
