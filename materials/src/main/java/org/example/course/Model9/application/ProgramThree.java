package materials.src.main.java.org.example.course.Model9.application;

import materials.src.main.java.org.example.course.Model9.entities.ProductEncapsulamento;

import java.util.Locale;
import java.util.Scanner;
public class ProgramThree {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Name: ");
		String name = sc.nextLine();
				
		System.out.println("Price: ");
		double price = sc.nextDouble();
		
		System.out.println("Quantity: ");
		int quantity = sc.nextInt();
		
		ProductEncapsulamento product = new ProductEncapsulamento(name,price,quantity);
		
		product.setName("Computer");	
		System.out.println("Name of Product: " + product.getName());
		System.out.println("Quantity in Stock: " + product.getQuantity());
		System.out.println("Value in Stock: " + product.totalValueInStock());
		
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
