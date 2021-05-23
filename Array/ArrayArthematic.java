
package javaBeginning.Array;

import java.util.Scanner;

public class ArrayArthematic {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        double [] number =new double[5];
        double sum=0;
        System.out.println("Enter Five Number: ");
        
           /* number[0]=input.nextDouble();
            number[1]=input.nextDouble();
            number[2]=input.nextDouble();
            number[3]=input.nextDouble(); 
            number[4]=input.nextDouble();
*/
           // Same Work using Loop 
           for (int i = 0; i <5; i++) {
            number[i]=input.nextDouble();
        }
        
        sum=number[0]+number[1]+number[2]+number[3]+number[4];
        System.out.println("Sum of Five Number: "+sum);
    }
}
