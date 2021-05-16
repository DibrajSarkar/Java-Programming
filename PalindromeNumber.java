
package javaBeginning;

import java.util.Scanner;


public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int remainder,num,temp,sum=0;
        System.out.println("Enter Your desire Number: ");
        num=input.nextInt();
        temp=num;
        while(temp!=0)
        {
           remainder=temp%10;
           sum=sum*10+remainder;
           temp=temp/10;
        }
        if(num==sum){
           System.out.println("This is a palindrome Number");
        }
        else
        {
            System.out.println("This is Not a palindrome Number");
        }
        
        }
    }

