
package javaBeginning;

import java.util.Scanner;


public class SumOfgivenDigits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0,temp,num,r;
        System.out.println("Enter Any Number: ");
        num=input.nextInt();
        temp=num;
        
        while(temp!=0)
        {
            r=temp%10;
            sum+=r;
            temp=temp/10;
        }
        System.out.println("Sum of Digit: "+sum);
    }
}
