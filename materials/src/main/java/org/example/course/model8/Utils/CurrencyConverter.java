package materials.src.main.java.org.example.course.Model8.Utils;

public class CurrencyConverter {
	public static final double IOF = 1.06;
	
	public static double dollarsInReais(double priceDollar, double quantityDollar) {
		return (IOF*quantityDollar)*priceDollar;
	}

}
