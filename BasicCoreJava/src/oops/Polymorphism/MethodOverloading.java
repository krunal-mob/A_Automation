package oops.Polymorphism;

public class MethodOverloading 
 // When the method name is the same with 
//different arguments/parameters within the same class

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
