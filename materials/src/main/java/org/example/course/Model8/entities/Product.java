package materials.src.main.java.org.example.course.Model8.entities;

public class Product {
		public String name;
		public double price;
		public int quantity;
		
		public double totalValueInStock() {
			return price * quantity;
		}
		
		public void addProducts() {
			quantity ++;
		}
		
		public void addProducts(int addValue) {
			quantity = quantity + addValue;
		}
		
		public void removeProducts() {
			quantity --;
		}
		
		public void removeProducts(int removeValue) {
			quantity = quantity - removeValue;
		}
		
		public String toString(){
			return name 
					+ ", $ " 
					+ String.format("%.2f", price) 
					+ ", " 
					+ quantity 
					+ " units , Total: $ " 
					+ String.format("%.2f", totalValueInStock());
		}

}
