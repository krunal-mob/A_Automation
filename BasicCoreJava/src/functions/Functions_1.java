package functions;

public class Functions_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a= 10;
		int b= 20;
		
		System.out.println(a+b);
		
		System.out.println("I am calling Sum Function");
		
		sum(10,30);
		message();
		System.out.print("The multiplication is   ");
		multiplication(10, 10);
		System.out.print("The division is   ");
        division(100, 10);
	}
	
	
	
	// Function Signature is 5.
	// public- Access Modifier [Public, Private, Protected, Default]
	//static- Type [Static / Non-Static(No Keyword)]
	// void-Return Type [Void, datatype, classes , interface, Array etc]
	//sum - Name
	//()-Parameter / Arguments
	public static void sum(int a, int b) {
		
		System.out.println(a+b);
		/*
		 * int a =10; int b=20; System.out.println(a+b);
		 */
	}
	
	public static void message() {
		
		System.out.println("I am Learning Selenium");
	}
	
	public static void multiplication(int a, int b) {
		
		System.out.println(a*b);
		
		
	}
	
public static void division(int a, int b) {
		
		System.out.println(a/b);
		
		
	}

}
