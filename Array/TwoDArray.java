
package javaBeginning.Array;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [] [] num=new int[2][3];
        System.out.println("Enter Six Value: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                num[row][col]=input.nextInt();
            }
        }
        // Printing avobe value
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+num[row][col]);
            }
        }
    }
}
