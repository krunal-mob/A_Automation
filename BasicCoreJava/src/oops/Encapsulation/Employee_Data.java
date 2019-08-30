package oops.Encapsulation;

public class Employee_Data {
	
	
	//Private Variables
	private int ssn;
	private String EmpName;
	private int EmpAge;
	
	//Getters and Setters -Right CLick--> Source-->Generate getter and Setters
	 
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public int getEmpAge() {
		return EmpAge;
	}

	public void setEmpAge(int empAge) {
		EmpAge = empAge;
	}

	
	public static void main(String[] args) {
		
		Employee_Data E = new Employee_Data();
		E.setSsn(10013);
		E.setEmpName("Abhishek");
		E.setEmpAge(27);
		
		
		System.out.println("The SSN no. of the employee is "+ E.getSsn());
		System.out.println("The Name of the employee is "+ E.getEmpName());
		System.out.println("The  Age of the employee is "+ E.getEmpAge());

	} 
	
}
