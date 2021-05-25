package javaBeginning.Array;

import java.util.Scanner;

public class MatrixInArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        
        System.out.println("Enter Six Value: ");
        // Getting input for A Matrix
        for (int row = 0; row <2; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col]=input.nextInt();
            }
        }
        //Printing A Matrix 
        System.out.print("A : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+A[row][col]);
            }
        }
    }
}
