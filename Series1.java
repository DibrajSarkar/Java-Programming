
package javaBeginning;

import java.util.Scanner;


public class Series1 {
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            int n,sum=0;
         System.out.println("Enter The last Number: ");
         n=input.nextInt();
         for (int i = 0; i < 10; i++) {
             System.out.print(i + " ");
             sum+=i;
        }
         System.out.println("");
         System.out.println("Sum of Number: "+sum);
    }
}
