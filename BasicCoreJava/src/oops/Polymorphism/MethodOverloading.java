package oops.Polymorphism;

public class MethodOverloading 
 // When the method name is the same with 
//different arguments/parameters within the same class

// Ways to achieve method overloading 
// Method 1: By changing the number of parameters.
//Method 2: By changing the Data types of the parameters
// Method 3: By changing the Order of the parameters

//What happens when method signature is same and the return type is different?

//The compiler will give error as the return value alone is not sufficient 
//for the compiler to figure out which function it has to call


{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MethodOverloading M = new MethodOverloading();
		M.sum();
		M.sum(1);
		M.sum(2, 3);
	}

	
	
	public void sum() {
		
		System.out.println("This is Sum() function without any parameters");
	}
	
	public void sum (int i) {
		
		System.out.println("This is Sum() function with one parameter");
		System.out.println(i);
	}
	
	public void sum(int i, int j ) {
		
		System.out.println("This is Sum() function with 2 parameters");
		System.out.println(i);
		System.out.println(j);
	}
}
