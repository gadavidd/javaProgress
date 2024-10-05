package materials.src.main.java.org.example.course.Model10.application;

import java.util.Locale;
import java.util.Scanner;

public class ExercFive {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of digits you will type:");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Enter the number - " + (i+1) + " :");
            vect[i] = sc.nextDouble();
        }


        double highestValue = 0.0;
        int posicion = 0;

        for (int j = 0; j < vect.length; j++) {
            if (vect[j] > highestValue) {
                highestValue = vect[j];
                posicion = j;
            }
        }

        System.out.print("The highest value entered is : ");
        System.out.println(highestValue);

        System.out.print("Position of the highest value : ");
        System.out.println(posicion);

        sc.close();
    }
}
