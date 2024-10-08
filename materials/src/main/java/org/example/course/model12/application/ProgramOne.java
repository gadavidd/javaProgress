package materials.src.main.java.org.example.course.model12.application;

import materials.src.main.java.org.example.course.model12.entities.projectOne.Order;
import materials.src.main.java.org.example.course.model12.entities.enums.OrderStatus;

import java.util.Date;

//EnumTest
public class ProgramOne {

    public static void main(String[] args){
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        //String to Enum
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
