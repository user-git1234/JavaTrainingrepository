package FridayTest;

public class Item {
	 String  category;
     String name;
     Integer quantity;
     double cost;
	public Item(String name, String category, Integer quantity,double cost) {
		
		this.name = name;
		this.category = category;
		this.cost = cost;
		this.quantity = quantity;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getCost() {
		return cost;
	}
	public void setPrice(double cost) {
		this.cost = cost;
	}
	
	
	public String getcategory() {
		return category;
	}
	
	
}
