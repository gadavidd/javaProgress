package materials.src.main.java.org.example.course.Model10.application;

import java.util.Scanner;

public class ExercFifteen {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        for(int i = 0; i < matrix.length; i++){
            System.out.println("Type the " + m + " values of row " + i + " :");
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter a number to check its occurrence:");
        int number = sc.nextInt();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == number){
                    System.out.println("Position " + i + ", " + j + ":");
                    if(j != 0){
                        System.out.println("Left: " + matrix[i][j-1]);
                    }
                    if(j+1 < matrix[0].length){
                        System.out.println("Right: " + matrix[i][j+1]);
                    }
                    if(i != 0){
                        System.out.println("Up: " + matrix[i-1][j]);
                    }
                    if(i+1 < matrix.length){
                        System.out.println("Down: " + matrix[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
