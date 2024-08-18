package materials.src.main.java.org.example.course.Model10.application;

import java.util.Locale;
import java.util.Scanner;

public class ExercSeven {//Values under average
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of digits you will type:");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double average = 0;

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Enter the number - " + (i+1) + " :");
            vect[i] = sc.nextDouble();
            average += vect[i];
        }

        average = average/n;
        System.out.printf("Vector Average: %.3f%n",average);

        System.out.println("Under average elements:");
        for (double value:vect) {
            if (value < average) {
                System.out.println(value);
            }
        }

        sc.close();
    }
}
