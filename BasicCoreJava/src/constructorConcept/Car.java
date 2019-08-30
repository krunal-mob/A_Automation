package constructorConcept;

public class Car {
	String model;
	int price;
	String modelType;
	
	
	public Car(String model,int price,String modelType) {
		
		this.model = model;
		this.price = price;
		this.modelType = modelType;
		
		
	}

	public static void main(String[] args) {
		

		// TODO Auto-generated method stub
		Car c1= new Car("Honda", 10, "Jazz");
		Car c2 = new Car("Audi", 20, "Q4");
		
		System.out.println(c1.model + " " + c1.price + " " + c1.modelType);	
		System.out.println(c2.model + " " + c2.price + " " + c2.modelType);

	}

}
