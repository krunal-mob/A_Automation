package oops.Inheritance;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Smartphone S=new Smartphone();
		S.internet();
		S.calling();
		S.texting();
		
		
		Mobile M = new Mobile();
		M.texting();
		M.calling();
		
		
		Telephone T = new Telephone();
		T.calling(); 
		
		
		 
	}

}
