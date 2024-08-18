package materials.src.main.java.org.example.course.Model10.application;

import java.util.Locale;
import java.util.Scanner;

public class ExercTwo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of digits you will type:");
        int n = sc.nextInt();
        double[] vect = new double[n];


        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Enter a number :");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++){
            sum += vect[i];
        }

        System.out.print("Values: ");

        for (int i = 0; i < vect.length; i++){
            System.out.print(vect[i]);
            System.out.print("  ");
        }

        System.out.println();

        double average = sum/vect.length;
        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Average: %.2f%n", average);

        sc.close();
    }
}
