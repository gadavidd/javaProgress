package materials.src.main.java.org.example.course.model13.entities.exerciseFour;

public abstract class Contributor {
    private String name;
    private Double anualIncome;
    private Double tax;
    public Contributor(String name, Double anualIncome){
        this.name = name;
        this.anualIncome = anualIncome;
    }
    public Contributor(){
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public Double getTax(){return tax;}
    public Double setTax(Double tax){return this.tax = tax;}
    public double taxCalculation(){
        return tax;
    }
}
