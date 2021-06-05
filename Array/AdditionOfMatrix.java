package javaBeginning.Array;

import java.util.Scanner;

public class AdditionOfMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        // Getting Value of A Matrix
        System.out.println("Enter the elements of A Matrix : ");
        System.out.println(2 << 4);
        System.out.println(2<<3);

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d] [%d] =", row, col);
                A[row][col] = input.nextInt();
            }
        }
        // Getting Input value for B Matrix
        System.out.println("Enter the elements of B Matrix: ");

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B[%d] [%d] =", row, col);
                B[row][col] = input.nextInt();
            }
        }
      
        // Printing value of A Matrix
        System.out.println("A : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {

                System.out.print("\t" + A[row][col]);
            }
        }
          System.out.println("");
        // printing Value of B Matrix
        System.out.println("B : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
               
                System.out.print("\t" + B[row][col]);
            }
        }
       // Addition of A and B Matrix: 
        System.out.println("\n\n");
        System.out.println("A+B: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t"+(A[row][col]+B[row][col]));
            }
        }
    }
}
