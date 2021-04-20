
package javaBeginning;

import java.util.Scanner;


public class SumOfOddNumber {
    public static void main(String[] args) {
        int i,n,m;
        int sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter inital Number: ");
        n=input.nextInt();
        System.out.println("Enter Final Number: ");
        m=input.nextInt();
        for ( i = n; i <=m; i++) {
            if(i%2!=0){// i%2==1
                System.out.println(" "+i);
                sum+=i;
            }
        }
        System.out.println("");
        System.out.println("Sum of All Odd Number: "+sum);
}
    
}

