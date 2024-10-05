package materials.src.main.java.org.example.course.Model10.application;

import materials.src.main.java.org.example.course.Model10.entities.PeopleHeightAndAge;

import java.util.Locale;
import java.util.Scanner;

public class ExercThree {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many people will be registered?");
        int n = sc.nextInt();
        PeopleHeightAndAge[] people = new PeopleHeightAndAge[n];

        for (int i = 0; i < people.length; i++) {
            sc.nextLine();
            System.out.println("Enter the " + (i+1) + "a person name");
            String name = sc.nextLine();

            System.out.println("Enter the " + (i+1) + "a person age");
            int age = sc.nextInt();

            System.out.println("Enter the " + (i+1) + "a person height price");
            double height = sc.nextDouble();

            System.out.println("\n");
            people[i] = new PeopleHeightAndAge(name,age,height);
        }

        sc.close();

        double averageHeight = 0.0;
        for (int i = 0; i < n; i++){
            averageHeight += people[i].getHeight();
        }

        averageHeight = averageHeight/people.length;

        int sum = 0;
        String [] lessSixteen = new String[n];
        for (int i = 0; i < n; i++) {
            if (people[i].getAge() < 16) {
                lessSixteen[sum] = people[i].getName();
                sum++;
            }
        }

        double percentage = ((double)sum/ (double)people.length) * 100;
        System.out.printf("Average Height: %.2f%n", averageHeight);
        System.out.println("Percentage of people under sixteen :" + percentage + " %");
        System.out.println("People under sixteen years of age :");

        for (int i = 0; i < sum; i++) {
            System.out.println(lessSixteen[i]);
        }
    }
}