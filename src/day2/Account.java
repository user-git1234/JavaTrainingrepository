package day2;

public abstract class Account {

	public double amount;

	
	
	public Account(double amount) {
		// TODO Auto-generated constructor stub
		this.amount = amount;
	}



	abstract void interest();
	
}
