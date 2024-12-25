package materials.src.main.java.org.example.course.model13.entities.exerciseFour;

public class Individual extends Contributor{
    private double healthExpenditures;

    public Individual(){
    }

    public Individual(String name, Double anualIncome, double healthExpenditures){
        super(name,anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double taxCalculation(){
        double discount = healthExpenditures * 0.5;

        if(getAnualIncome() < 20000.00){
            super.setTax((super.getAnualIncome() * 0.15) - discount);
        } else if (getAnualIncome() >= 20000.00){
            super.setTax((super.getAnualIncome() * 0.25) - discount);
        }
        return super.getTax();
    }
}
