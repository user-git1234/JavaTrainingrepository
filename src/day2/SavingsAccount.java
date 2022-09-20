package day2;

public class SavingsAccount extends Account{

	private double rate = 0.05;
	
	
	public SavingsAccount(double amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}
	
	void interest() {
		//System.out.println(getAmount());
		double res;
		res = amount + (rate*amount);
		System.out.println("Saving Account Intrest- "+res);
	}

}