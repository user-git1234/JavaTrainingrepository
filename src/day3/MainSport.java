package day3;

import java.util.Scanner;

public class MainSport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factoryObject factobj =new factoryObject();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of Sport ");
		String mySport=sc.nextLine();
		
		Sport sp = factobj.getSport(mySport);
		sp.play();
	}

}
