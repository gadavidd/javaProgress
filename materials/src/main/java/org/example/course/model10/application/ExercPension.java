package materials.src.main.java.org.example.course.Model10.application;

import materials.src.main.java.org.example.course.Model10.entities.Pension;

import java.util.Locale;
import java.util.Scanner;

public class ExercPension {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();

        int[] rent = new int[10];
        String[] names = new String[10];
        String[] emails = new String[10];

        for(int i = 0; i < n; i++){
            sc.nextLine();

            System.out.println("Enter the name of the #" + (i+1) + "  rent");
            String name = sc.nextLine();

            System.out.println("Enter the email of the #" + (i+1) + "  rent");
            String email = sc.nextLine();

            System.out.println("Enter the room's number of the #" + (i+1) + "  rent");
            int roomNumber = sc.nextInt();

            rent[roomNumber] = roomNumber;
            names[roomNumber] = name;
            emails[roomNumber] = email;
        }

        Pension pension = new Pension(rent, names, emails);
        pension.getRents();

        sc.close();
    }
}
