package FridayTest;

import java.util.HashMap;
import java.util.Map.Entry;

public class methods {
	HashMap<String, Item> myCart = new HashMap<String,Item>();
	
	public void addtoCart(String name,String category,int q,double price) {
		Item it = new Item(name,category,q,price);
		
		myCart.put(name, it);
		System.out.println("Item added to Cart");
	}
	
	public void removeFromCart(String name) {
		myCart.remove(name);
		System.out.println("Item removed succesfully!!");
	}
	
	public void TotalBill() {
		double bill = 0;
		for (Entry<String, Item> mapElement : myCart.entrySet()) {
			
			bill += mapElement.getValue().quantity * mapElement.getValue().cost;
			
			
		}
		System.out.println("Your Total Bill is  " + bill);
		
		
		}
	
	public void CategoryWiseBill() {
		HashMap<String,Double> categorybills = new HashMap<String,Double>();
		
		for (Entry<String, Item> mapElement : myCart.entrySet()) {
			String cat = mapElement.getValue().category;
			   if(categorybills.containsKey(cat) == false) {
				Double b = 0D;
				b = mapElement.getValue().quantity * mapElement.getValue().cost;
				categorybills.put(cat, b);
			   }
			   else {
				   
				   Double presentbill = categorybills.get(cat);
				   Double bill = 0D;
				   
				   bill = mapElement.getValue().quantity * mapElement.getValue().cost;
				   
				   categorybills.put(cat, presentbill+bill);
			   }
				
			}
	  for(Entry<String,Double> mapElement : categorybills.entrySet()) {
		  System.out.println("Category - " + mapElement.getKey() + " |  Price - " + mapElement.getValue());
			
		}
		
		
		
		
	}
}

