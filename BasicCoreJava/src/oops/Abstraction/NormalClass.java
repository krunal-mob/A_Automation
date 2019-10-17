package oops.Abstraction;

public class NormalClass extends AbstractClass{

	public static void main(String[] args) {

		
	
		
		NormalClass NC = new NormalClass();
		//NC.abstractMethod();
		//NC.concreteMethod();



		AbstractClass AC = new NormalClass();
		//AC.concreteMethod();


		NC.callAbstractClassConcreteMethod();

	}

	@Override
	public void abstractMethod() {
		System.out.println("This method have to be defined in Child Class");		
	}



	public  void concreteMethod() {



		System.out.println("This  is the concrete method of NormalClass i.e Child class");


	}



	public  void callAbstractClassConcreteMethod() {

		super.concreteMethod();

	}




}
