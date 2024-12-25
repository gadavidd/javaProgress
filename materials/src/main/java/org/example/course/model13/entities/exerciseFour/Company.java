package materials.src.main.java.org.example.course.model13.entities.exerciseFour;

public class Company extends Contributor{
    private double numberEmployees;

    public Company(){
    }

    public Company(String name, Double anualIncome, double numberEmployees){
        super(name, anualIncome);
        this.numberEmployees = numberEmployees;
    }

    public double getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(double numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    @Override
    public double taxCalculation(){

        if(numberEmployees > 10){
            super.setTax((super.getAnualIncome() * 0.14));
        } else {
            super.setTax((super.getAnualIncome() * 0.16));
        }

        return super.getTax();
    }
}
