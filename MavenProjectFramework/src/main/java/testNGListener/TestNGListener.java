package testNGListener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aut.qa.utility.TestUtil;

public class TestNGListener  implements ITestListener{

	//We need to make all the methods form default to public to provide our  own implementation


	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub       
	}


	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub       
	}


	public void onTestFailure(ITestResult result) {

		System.out.println("FAILED METHOD");
		
		try {
			
			TestUtil.takeScreenshotFailedTest(result.getMethod().getMethodName());
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}

		
		//These two will give same result i.e the method name
		System.out.println("getName() method --> "+result.getName());
		
		System.out.println("getMethod + getMethodname() method --> "+result.getMethod().getMethodName());


	}


	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub       
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub       
	}


	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub       
	}


	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub       
	}





}
