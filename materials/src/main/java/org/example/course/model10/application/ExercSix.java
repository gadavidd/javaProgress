package materials.src.main.java.org.example.course.Model10.application;

import java.util.Locale;
import java.util.Scanner;

public class ExercSix {//Vector sum
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of digits you will type:");
        int n = sc.nextInt();

        int[] vectA = new int[n];
        int[] vectB = new int[n];


        System.out.println("Type Vector A");
        for (int i = 0; i < vectA.length; i++) {
            sc.nextLine();
            System.out.println("Enter the number - " + (i+1) + " :");
            vectA[i] = sc.nextInt();
        }

        System.out.println("Type Vector B");
        for (int i = 0; i < vectA.length; i++) {
            sc.nextLine();
            System.out.println("Enter the number - " + (i+1) + " :");
            vectB[i] = sc.nextInt();
        }

        sc.close();

        int[] vectC = new int[n];

        System.out.println("Resultant vector");
        for (int i = 0; i < vectC.length; i++) {
            vectC[i] = vectA[i] + vectB[i];
            System.out.println(vectC[i]);
        }
    }
}
