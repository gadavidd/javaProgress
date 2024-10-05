package materials.src.main.java.org.example.course.Model10.application;

import materials.src.main.java.org.example.course.Model10.entities.PeopleHeightMeter;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class ExercEleven {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of digits you will type:");
        int n = sc.nextInt();
        PeopleHeightMeter[] datePeople = new PeopleHeightMeter[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter the " + (i+1) + "a person height:");
            double height = sc.nextDouble();

            System.out.println("Enter the " + (i+1) + "a person gender:");
            sc.nextLine();
            String gender = sc.nextLine();

            datePeople[i] = new PeopleHeightMeter(gender, height);
        }

        sc.close();

        double higherHeight = 0.0;
        double lowerHeight = 3.00;
        double averageFemale = 0.0;
        int menNumber = 0;
        int femaleNumber = 0;

        for(PeopleHeightMeter people: datePeople){
            if(people.getHeight() > higherHeight){
                higherHeight = people.getHeight();
            }
            if(people.getHeight() < lowerHeight){
                lowerHeight = people.getHeight();
            }
            if(Objects.equals(people.getGender(), "F")){
                averageFemale += people.getHeight();
                femaleNumber++;
            }
            if(Objects.equals(people.getGender(), "M")){
                menNumber++;
            }
        }

        System.out.printf("Higher Height: \n %.2f%n", higherHeight);
        System.out.printf("Lower Height: \n %.2f%n", lowerHeight);
        System.out.printf("Media of the height of women: \n %.2f%n", averageFemale/femaleNumber);
        System.out.printf("Number of men: \n %s%n", menNumber);
    }
}
