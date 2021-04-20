
package javaBeginning;

import java.util.Scanner;


public class SumOfGivenNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,m;
        System.out.println("Enter Inital Number:");
        n=input.nextInt();
        
        System.out.println("Enter final Number:");
        m=input.nextInt();
        
        int sum=0;
        for (int i = n; i <=m; i++) {
            sum+=i;
            
        }
        System.out.println("Sum is :"+sum);
    }
}
