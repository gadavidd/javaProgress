package materials.src.main.java.org.example.course.Model10.application;

import java.util.Locale;
import java.util.Scanner;

public class ExercEight {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of digits you will type:");
        int n = sc.nextInt();

        double[] vect = new double[n];

        int nEvens = 0;
        double averageEvens = 0.0;

        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("Enter the number - " + (i+1) + " :");
            vect[i] = sc.nextInt();
            if(vect[i] % 2 == 0){
                nEvens++;
                averageEvens += vect[i];
            }
        }

        if (averageEvens == 0){
            System.out.println("No even number");
        } else {
            averageEvens = averageEvens/nEvens;
            System.out.printf("Average even numbers: \n %.3f%n", averageEvens);
        }

        sc.close();
    }
}
