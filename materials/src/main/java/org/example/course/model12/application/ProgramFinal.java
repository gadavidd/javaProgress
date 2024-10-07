package materials.src.main.java.org.example.course.model12.application;

import materials.src.main.java.org.example.course.model12.entities.enums.OrderStatus;
import materials.src.main.java.org.example.course.model12.entities.projectfinal.Client;
import materials.src.main.java.org.example.course.model12.entities.projectfinal.Order;
import materials.src.main.java.org.example.course.model12.entities.projectfinal.OrderItem;
import materials.src.main.java.org.example.course.model12.entities.projectfinal.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramFinal {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client: ");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(clientName,clientEmail,birthDate);
        sc.nextLine();

        System.out.print("Status: ");
        String status = sc.nextLine();

        Order order =  new Order(client, new Date(), OrderStatus.valueOf(status));

        System.out.print("How many items to this order?");
        int orderCount = sc.nextInt();


        for(int i = 0; i < orderCount; i++){
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String nameProduct = sc.nextLine();

            System.out.print("Product price: ");
            double priceProduct = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(nameProduct,priceProduct);

            order.addItem(new OrderItem(product, quantity));
        }

        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.print("Order moment: ");
        order.getStringMoment();
        System.out.print("Order Status: ");
        System.out.println(order.getStatus());
        System.out.print("Client: ");
        System.out.println(order.getClient().getName() + " (" + order.getClient().getStringBirthDate() + ") " + " - " +
                order.getClient().getEmail());
        System.out.println("Order items: ");

        for(OrderItem orderItem : order.getItemList()){
            Product product = orderItem.getProduct();
            System.out.println(product.getName() + ", $" + product.getPrice() + ", Quantity: " + orderItem.getQuantity() +
                    ", Subtotal: $" + orderItem.subTotal());
        }

        System.out.println("Total price: $" + order.total());

        sc.close();
    }
}
