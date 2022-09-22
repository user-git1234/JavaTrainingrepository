package day4;

import java.util.Scanner;

public class Candidate_Main  {

	public static void main(String[] args) throws InvalidSalaryException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Name : ");
		String name=sc.nextLine();
		System.out.print("Gender : ");
		String gender=sc.nextLine();
		System.out.print("Expected Salary: ");
		int expsalary=sc.nextInt();
		
		if(expsalary<10000)
		{
			throw new InvalidSalaryException("Enter the Right Salary");
		}
		else
		{
			System.out.println(new Candidate(name,gender,expsalary));
		}

	}

}
