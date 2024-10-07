package materials.src.main.java.org.example.course.model9.entities;

public class ProductEncapsulamento {
	String name;
	private double price;
	private int quantity;

	public ProductEncapsulamento(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public ProductEncapsulamento(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantity = 0;
	}
	
	public ProductEncapsulamento() {
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts() {
		quantity++;
	}

	public void addProducts(int addValue) {
		quantity = quantity + addValue;
	}

	public void removeProducts() {
		quantity--;
	}

	public void removeProducts(int removeValue) {
		quantity = quantity - removeValue;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units , Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
