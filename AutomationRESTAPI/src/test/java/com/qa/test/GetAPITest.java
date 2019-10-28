package com.qa.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class GetAPITest extends TestBase {

	TestBase testbase;
	String ServiceUrl;
	String apiUrl;
	String url;
	RestClient restClient;
	
	
	
	@BeforeMethod
	public void setUp() throws Throwable {
		
		
		//initialize base class constructor.
		testbase = new TestBase();
		
		ServiceUrl = prop.getProperty("ServiceURL");
		apiUrl = prop.getProperty("apiURL");
		
		url = ServiceUrl + apiUrl ;
		
		
		
	}
	
	
	@Test
	public void getTest() throws Throwable {
		
	    restClient = new  RestClient ();
		restClient.get(url);
		 
	}

	
	
	

}
