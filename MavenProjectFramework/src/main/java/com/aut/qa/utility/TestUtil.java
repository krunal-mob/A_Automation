package com.aut.qa.utility;

import com.aut.qa.base.TestBase;

public class TestUtil extends TestBase  {
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	
	public static long IMPLICIT_WAIT = 10;
	
	
	public void switchToMainPanelFrame() {
		
		driver.switchTo().frame("mainpanel");
		
		
	}
	
	public void switchToLeftPanelFrame() {
		
		driver.switchTo().frame("leftpanel");
		
	}
	
	
	
	
	
	

}
