package materials.src.main.java.org.example.course.Model8.application;

import materials.src.main.java.org.example.course.Model8.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductInStock {

public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Name: ");
		product.name = sc.nextLine();
				
		System.out.println("Price: ");
		product.price = sc.nextDouble();

		System.out.println("Quantity: ");
		product.quantity = sc.nextInt();

		System.out.println("Product data: " + product);
		
		System.out.println("Enter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());
		
		System.out.println("Product data: " + product);
		
		System.out.println("Enter the number of products to be removed from stock: ");
		product.removeProducts(sc.nextInt());
		
		System.out.println("Product data: " + product);
		
		sc.close();
	}
}
