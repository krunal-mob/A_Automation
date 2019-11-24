package functions;

public class AccessModifiers {
	
	//Public ---> Throughout the Project
	//Private ----> Within the Class
	//Protected ---> Within the package and outside the package using child class
	// default/ No Access Modifiers ---->  Within  the package

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		AccessModifiers A = new AccessModifiers();
		A.publicFunction();
		A.privateFunction();
		A.protectedFunction();
		A.defaultFunction();
	
		
		}
	
		
	public void publicFunction() {
		
		System.out.println("Public Function");
		

	}
	
	private void privateFunction() {
		
		System.out.println("Private Function");
	}
	
	protected void protectedFunction() {
		
		System.out.println("Protected Function");
		
	}
	
	void defaultFunction() {
		
		System.out.println("Default Function ");
	}

}
