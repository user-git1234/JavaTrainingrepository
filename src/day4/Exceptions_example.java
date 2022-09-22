package day4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions_example {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	try {
	System.out.println("Enter number of items:");
	int n=sc.nextInt();
	int items[]=new int[n];
	System.out.println("Enter prices");
		for(int i=0;i<n;i++)
		{
			items[i]=sc.nextInt();
		}
	  System.out.println("Enter index number for details");
	    try {
	    	int index=sc.nextInt();
	    	System.out.println(items[index]);
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	    	e.printStackTrace();
	    	System.out.println("Enter a valid index");
	    }
	}
	catch(InputMismatchException ex)
	{
		ex.printStackTrace();
	}
	
}
}
