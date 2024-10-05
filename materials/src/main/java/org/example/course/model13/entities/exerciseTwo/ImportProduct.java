package materials.src.main.java.org.example.course.Model13.entities.exerciseTwo;

public class ImportProduct extends Product{
    private double customsFee;
    public ImportProduct() {
    }

    public ImportProduct(String nome, double price, double customsFee){
        super(nome, price);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    public double totalPrice(){
        return customsFee + super.getPrice();
    }

    @Override
    public void priceTag(){
        System.out.println(super.getNome() + " $"  + String.format("%.2f", totalPrice()) +
                " (Customs fee: " + String.format("%.2f", this.getCustomsFee()) + ")");
    }
}
