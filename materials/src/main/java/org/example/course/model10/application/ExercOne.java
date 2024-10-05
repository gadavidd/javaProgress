package materials.src.main.java.org.example.course.Model10.application;

import java.util.Locale;
import java.util.Scanner;

public class ExercOne {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of digits you will type:");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Enter the number - " + (i+1) + " :");
            vect[i] = sc.nextInt();
        }

        System.out.println("Negative numbers entered:");
        for (int j : vect) {
            if (j < 0) {
                System.out.println(j);
            }
        }

        sc.close();
    }
}
