
package javaBeginning;

import java.util.Scanner;


public class SequireSeries {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num, sum=0;
        System.out.println("Enter Last Number: ");
        num=input.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(i*i+" ");
            sum+=i*i;
        }
        System.out.println("");
        System.out.println("Squire of Input Number: "+sum);
    }
}
