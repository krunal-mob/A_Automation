package oops.Abstraction;

public class IciciBank implements RBI , USBank  {

	@Override
	public void debit() {
		System.out.println("ICICI----Debit");		
	}

	@Override
	public void credit() {
		System.out.println("ICICI----Credit");		
	}

	@Override
	public void transferMoney() {
		System.out.println("ICICI----TransferMoney");		
	}

	@Override
	public void homeLoan() {
		System.out.println("ICICI----HomeLoan");		
	}

	@Override
	public void carLoan() {
		System.out.println("ICICI---- CarLoan");		
	}

	@Override
	public void educationLoan() {
		System.out.println("ICICI----educationLoan");		
	}

}
