package day2;

public class MainAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount sa = new SavingsAccount(5000.00);
		sa.interest();
		CheckingAccount ca = new CheckingAccount(5000.00);
		ca.interest();
	}

}
