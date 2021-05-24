
package javaBeginning.Array;

import java.util.Scanner;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [] number=new int[5];
        System.out.println("Enter Five Number: ");
        
        for (int i = 0; i < number.length; i++) {
            number[i]=input.nextInt();
             System.out.println(number[i]);
        }
       int max=number[0];
        for (int i = 1; i <number.length; i++) {
            if (max<number[i]) {
                max=number[i];
            }
        }
        System.out.println("Maximum Number: "+max);
    }
}
