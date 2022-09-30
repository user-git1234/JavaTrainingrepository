package FridayTest;

import java.util.HashMap;
import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To test methods 2,3,4
		methods m = new methods();
		m.myCart.put("Samsung", new Item("Samsung","Electronics",2,10000));
		m.myCart.put("Iphone", new Item("Apple","Electronics",4,50000));
		m.myCart.put("Salt", new Item("Salt","Grocery",3,28));
		m.myCart.put("lentils", new Item("lentils","Grocery",5,35));
		m.myCart.put("legos", new Item("legos","Toys",9,1000));
		m.myCart.put("bike", new Item("bike","Toys",2,1800));
		
		
		
		 
		
	
		System.out.println("1. ADD Items to Cart\n" + "2. Remove Items from Cart\n" +"3. View Category wise Bill\n"+ "4.View Total Bill");
		
		 Scanner sc = new Scanner(System.in);
		 int inputAction =  sc.nextInt();
		 
		 switch(inputAction) {
		 
		 case 1 :
			 System.out.println("Enter the Name of Product");
			 String name = sc.next();
			 System.out.println("Enter the Category of Product");
			 String cat = sc.next();
			 System.out.println("Enter the Quantity of Product");
			 Integer q = sc.nextInt();
			 System.out.println("Enter the cost of product");
			 double c = sc.nextDouble();
			 m.addtoCart(name, cat, q, c);
			 
			 break;
		 
		 case 2 :
			 System.out.println("Enter the name of product to be removed");
			 String rname = sc.next();
			 m.removeFromCart(rname);
			 break;
		
		 case 3 :
			 m.CategoryWiseBill();
		     break;
		     
		 case 4 :
			 m.TotalBill();
			 break;
			 

	}

}
}
