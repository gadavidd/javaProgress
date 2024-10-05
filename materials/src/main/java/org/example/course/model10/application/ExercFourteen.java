package materials.src.main.java.org.example.course.Model10.application;

import java.util.Scanner;

public class ExercFourteen { //Matrix Exercises
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the square matrix:");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for(int i = 0; i < matrix.length; i++){
            System.out.println("Type the " + n + " values of row " + i + " :");
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for(int i = 0; i < matrix.length; i++){
            System.out.print(matrix[i][i] + "  ");
        }
        System.out.println();

        int count = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] < 0){
                    count++;
                }
            }
        }
        System.out.println("Negative number: " + count);

        sc.close();
    }
}
