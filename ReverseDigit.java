
package javaBeginning;

import java.util.Scanner;


public class ReverseDigit {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int reminder,num,temp,sum=0;
        System.out.println("Enter Desire Number: ");
        num=input.nextInt();
        temp=num;
        while(temp!=0)
        {
        reminder=temp%10;
        sum=sum*10 +reminder;
        temp=temp/10;
        }
        System.out.println("Reverse Digit: "+sum);
    }
}
