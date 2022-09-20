package day2;

public class Averagesum {

	int a,b,c,d, sum=0;
	double avg = 0.0;
	
	void func(int a, int b)
	{
		
		sum = a + b;
		avg = sum/2;
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + avg);
	}
	
	void func(int a, int b, int c)
	{
		
		sum = a + b + c;
		avg = sum/3;
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + avg);
	}
	
	void func(int a, int b, int c, int d)
	{
		
		sum = a + b + c + d;
		avg = sum/4;
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + avg);
	}
	
}
