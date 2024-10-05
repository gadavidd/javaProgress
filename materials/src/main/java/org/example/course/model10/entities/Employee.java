package materials.src.main.java.org.example.course.Model10.entities;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public void increaseSalary(double percentage){
        this.salary = salary*(1+(percentage/100));
    }
    @Override
    public String toString() {
        return id + ", " + name + ", " + salary;
    }
}
