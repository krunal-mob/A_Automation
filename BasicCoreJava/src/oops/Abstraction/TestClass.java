package oops.Abstraction;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IciciBank IB = new IciciBank();
		IB.carLoan(); 
		
		RBI R = new IciciBank(); 
		R.carLoan();
		//Important --> We can use Parent class reference 
		//(Here its Interface) to create child class Objects.
		
		USBank UB = new IciciBank();
		UB.debit();
		
	
		 
		
	}

}
