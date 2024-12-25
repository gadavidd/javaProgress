package materials.src.main.java.org.example.course.model13.application;

import materials.src.main.java.org.example.course.model13.entities.exerciseFour.Company;
import materials.src.main.java.org.example.course.model13.entities.exerciseFour.Contributor;
import materials.src.main.java.org.example.course.model13.entities.exerciseFour.Individual;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] Args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        List<Contributor> list = new ArrayList<>();

        for(int i = 1; i<=n; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if(ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                double numberEmployees = sc.nextInt();


                list.add(new Company(name, anualIncome, numberEmployees));
            }
        }

        System.out.println("TAXES PAID: ");

        double sum = 0.0;
        for(Contributor contributor: list) {
            System.out.println(contributor.getName() + ": $ " + String.format("%.2f", contributor.taxCalculation()));
            sum += contributor.taxCalculation();
        }

        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}
