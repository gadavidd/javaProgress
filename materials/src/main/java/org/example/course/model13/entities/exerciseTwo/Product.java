package materials.src.main.java.org.example.course.Model13.entities.exerciseTwo;

public class Product {
    private String nome;
    private double price;
    public Product(){
    }

    public Product(String nome, double price){
        this.nome = nome;
        this.price = price;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void priceTag(){
        System.out.println(nome + " $ " + String.format("%.2f", price));
    }
}
