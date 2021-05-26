
package javaBeginning.Array;

import java.util.Scanner;

public class MatrixDigonalElement {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [][]A= new int[3][3];
        int SumOfDigonalElements=0;
        int SumOfUpperElements=0;
        int SumOfLowerElements=0;
        // Getting Values from user
        System.out.println("Enter Elements of A Matrix: ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d] [%d] =",row,col);
                A[row][col]=input.nextInt();
            }
        }
        // Digonal ,upper triagnle,lower triagnle
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row==col) {
                    SumOfDigonalElements=SumOfDigonalElements+A[row][col];
                }
                if (row<col) {
                    SumOfUpperElements=SumOfUpperElements+A[row][col];
                }
                if(row>col){
                    SumOfLowerElements=SumOfLowerElements+A[row][col];
                }
            }
        }
        System.out.println("Sum of Digonal Elements: "+SumOfDigonalElements);
        System.out.println("Sum of Upper Elements: "+SumOfUpperElements);
        System.out.println("Sum of Lower Elements: "+SumOfLowerElements);
    }
}
