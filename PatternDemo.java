
package javaBeginning;

import java.util.Scanner;

public class PatternDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Desire Line: ");
        int num=input.nextInt();
        for (int row = num; row>=1; row--) {
            for (int col = 1; col <=row; col++) {
                System.out.print(" "+col);
            }
            System.out.println("");
        }
        
    }
}
