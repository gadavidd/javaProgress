package materials.src.main.java.org.example.course.Model9.entities;

import java.util.Date;

public class Order {
	private Date date;
	private ProductEncapsulamento product;
	
	public Order(Date date, ProductEncapsulamento product) {
		super();
		this.date = date;
		this.product = product;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public ProductEncapsulamento getProduct() {
		return product;
	}
	public void setProduct(ProductEncapsulamento product) {
		this.product = product;
	}
	
	
}
