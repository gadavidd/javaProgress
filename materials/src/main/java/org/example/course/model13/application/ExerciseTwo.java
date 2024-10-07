package materials.src.main.java.org.example.course.model13.application;

import materials.src.main.java.org.example.course.model13.entities.exerciseTwo.Product;
import materials.src.main.java.org.example.course.model13.entities.exerciseTwo.ImportProduct;
import materials.src.main.java.org.example.course.model13.entities.exerciseTwo.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ExerciseTwo {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> list = new ArrayList<>();

        for(int i = 1; i <= n;i++) {
            System.out.println("Product # " + i + " data:");
            System.out.print("Common, used or imported (c/u/i?) ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            if (ch == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportProduct(name, price, customsFee));
            } else if (ch == 'u') {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                list.add(new UsedProduct(name, price, manufactureDate));
            } else {
                list.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for(Product product: list) {
            product.priceTag();
        }

        sc.close();
    }
}
