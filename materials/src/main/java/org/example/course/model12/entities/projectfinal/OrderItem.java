package materials.src.main.java.org.example.course.model12.entities.projectfinal;

public class OrderItem {
    private int quantity;
    private Product product;

    public OrderItem(){
    }

    public OrderItem(Product product, int quantity){
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subTotal(){
        return product.getPrice()*quantity;
    }
}
