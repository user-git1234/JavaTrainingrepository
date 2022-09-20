package day2;

public class CheckingAccount extends Account{

	private double rate = 0.04;
	

	public CheckingAccount(double amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	void interest() {
		// TODO Auto-generated method stub
		double res;
		res = amount + (rate*amount);
		System.out.println("Checking Account Inttrest- "+res);
	}
}
