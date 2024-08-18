package materials.src.main.java.org.example.course.Model10.application;

import materials.src.main.java.org.example.course.Model10.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramTwo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the quantity of product:");
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Enter the product name " + (i+1) + " :");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Enter the product price " + (i+1) + " :");
            double price = sc.nextDouble();

            vect[i] = new Product(name,price);
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++){
            sum += vect[i].getPrice();
        }

        double average = sum/n;
        System.out.printf("Average Price: %.2f%n", average);

        sc.close();
    }
}
