
package javaBeginning;

import java.util.Scanner;


public class SerisOddNumberSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter last Number: ");
        n=input.nextInt();
        for (int i = 1; i <=n; i+=2) {
            System.out.println(i+" ");
            sum+=i;
        }
        System.out.println("");
        System.out.println("Sum of Odd Number until your provide number: "+sum);
    }
}
