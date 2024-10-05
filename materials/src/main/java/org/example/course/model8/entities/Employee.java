package materials.src.main.java.org.example.course.Model8.entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	public double liquidSalary;
	
	public double netSalary() {
		liquidSalary = grossSalary - tax;
		return liquidSalary;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += (percentage/100)*grossSalary;
	}

	
	public String toString() {
		return "Employee: "
				+ this.name
				+ ", $ "
				+ String.format("%.2f", netSalary());
	}
}
