package materials.src.main.java.org.example.course.Model10.application;

import materials.src.main.java.org.example.course.Model10.entities.StudentGrades;

import java.util.Locale;
import java.util.Scanner;

public class ExercTen {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of digits you will type:");
        int n = sc.nextInt();

        StudentGrades[] studentsGrades = new StudentGrades[n];

        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("Enter the " + (i+1) + "a person name");
            String name = sc.nextLine();

            System.out.println("Enter the first grade of " + (i+1) + "a person");
            double firstGrade = sc.nextDouble();

            System.out.println("Enter the second grade of " + (i+1) + "a person");
            double secondGrade = sc.nextDouble();

            studentsGrades[i] = new StudentGrades(name,firstGrade,secondGrade);
        }

        sc.close();

        System.out.println("Approved students:");
        for(int i = 0; i < n; i++){
            if(studentsGrades[i].getFinalGrade() >= 6.0){
                System.out.println(studentsGrades[i].getName());
            }

        }
    }
}
