package variablesAndDatatypes;

public class LocalGlobal {
	
	int i;
	String s;
	
	public void method1() {
		
		int i = 1;
		
		System.out.println(i);
		LocalGlobal LG = new LocalGlobal();
		System.out.println(LG.i);
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		LocalGlobal LG = new LocalGlobal();
		LG.method1();

	}

}
