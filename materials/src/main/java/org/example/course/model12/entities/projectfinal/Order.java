package materials.src.main.java.org.example.course.model12.entities.projectfinal;

import materials.src.main.java.org.example.course.model12.entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> itemList = new ArrayList<>();

    public Order(){
    }

    public Order(Client client, Date moment, OrderStatus status){
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }
    public void getStringMoment(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(moment);
        calendar.get(Calendar.HOUR);

        System.out.println(calendar.get(Calendar.DATE) + "/" + (calendar.get(Calendar.MONTH)+1) + "/" + calendar.get(Calendar.YEAR) + "  "
                + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public List<OrderItem> getItemList(){
        return itemList;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item){
        itemList.add(item);
    }

    public void removeItem(OrderItem item){
        itemList.remove(item);
    }

    public double total(){
        double sum = 0;

        for(OrderItem orderItem:itemList){
            sum += orderItem.subTotal();
        }

        return sum;
    }
}
