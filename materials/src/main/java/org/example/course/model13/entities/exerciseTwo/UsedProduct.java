package materials.src.main.java.org.example.course.Model13.entities.exerciseTwo;

import java.util.Calendar;
import java.util.Date;

public class UsedProduct extends Product{
    private Date manufactureDate;

    public UsedProduct(){
        super();
    }

    public UsedProduct(String nome, double price, Date manufactureDate){
        super(nome, price);
        this.manufactureDate = manufactureDate;
    }

    public StringBuilder getManufactureDate() {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(manufactureDate);
        calendar.get(Calendar.HOUR);

        StringBuilder sb = new StringBuilder("");
        sb.append(calendar.get(Calendar.DATE));
        sb.append("/");
        sb.append((calendar.get(Calendar.MONTH)+1));
        sb.append("/");
        sb.append(calendar.get(Calendar.YEAR));

        return sb;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public void priceTag(){
        System.out.println(super.getNome() + "(used) $"  + String.format("%.2f", super.getPrice()) +
                " (Manufacture date: " + this.getManufactureDate() + ")");
    }
}
