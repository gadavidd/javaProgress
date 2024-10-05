package materials.src.main.java.org.example.course.Model10.application;

import materials.src.main.java.org.example.course.Model10.entities.PersonAndAge;

import java.util.Locale;
import java.util.Scanner;

public class ExercNine { //Oldest person

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of digits you will type:");
        int n = sc.nextInt();

        PersonAndAge[] people = new PersonAndAge[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter the person name " + (i+1) + " :");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Enter the person age " + (i+1) + " :");
            int age = sc.nextInt();

            people[i] = new PersonAndAge(name,age);
        }

        sc.close();

        String oldestPersonName = "";
        int oldestPersonAge = 0;
        for(int i = 0; i < people.length; i++){
            if(people[i].getAge() > oldestPersonAge){
                oldestPersonAge = people[i].getAge();
                oldestPersonName = people[i].getName();
            }
        }

        System.out.println("the oldest person : " + oldestPersonName);


    }
}
