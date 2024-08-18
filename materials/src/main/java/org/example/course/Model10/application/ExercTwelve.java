package materials.src.main.java.org.example.course.Model10.application;

import materials.src.main.java.org.example.course.Model10.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExercTwelve {

    public static void main(String[] Args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered?");
        int n = sc.nextInt();
        List<Employee> employeeList = new ArrayList<Employee>();

        for(int i = 0; i < n; i++){
            System.out.println("Employee #" + (i+1) + " :");
            System.out.println("Enter Employee ID:");
            int id = sc.nextInt();

            sc.nextLine();
            System.out.println("Enter Employee Name:");
            String name = sc.nextLine();

            System.out.println("Enter Employee Salary:");
            double salary = sc.nextDouble();

            employeeList.add(new Employee(id,name,salary));
        }

        System.out.println("Enter the employee id that will have salary increase:");
        int id = sc.nextInt();

        List<Employee> result = employeeList.stream().filter(x -> x.getId() == id).collect(Collectors.toList());

        if(result.isEmpty()){
            System.out.println("This id does not exist!");
        } else{
            double percentage = sc.nextDouble();
            result.getFirst().increaseSalary(percentage);
        }

        sc.close();
        System.out.println("List of employees:");
        for(Employee x: employeeList){
            System.out.println(x.toString());
        }
    }
}
