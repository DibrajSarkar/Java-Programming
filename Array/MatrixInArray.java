package javaBeginning.Array;

import java.util.Scanner;

public class MatrixInArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] A = new int[2][3];
        int[][] B = new int[2][3];

        System.out.println("Enter six of A Matrix: ");
        // Getting input for A Matrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d] [%d] =", row, col);
                A[row][col] = input.nextInt();
            }
        }
        // Getting input for B Matrix
        System.out.println("Enter six value for B Matrix: ");

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B[%d] [%d] =", row, col);
                B[row][col] = input.nextInt();
            }
        }
        //Printing A Matrix 
        System.out.print("A : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + A[row][col]); 
            }
        }
        System.out.println(" ");
        //Printing B Matrix

        System.out.print("B : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + B[row][col]);
            }
        }
        System.out.println(" ");
    }
}
