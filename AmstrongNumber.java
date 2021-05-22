
package javaBeginning;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int remainder,num, temp,sum=0;
        System.out.println("Enter Desire Number: ");
        num=input.nextInt();
        temp=num;
        while(temp!=0)
        {
            remainder=temp%10;
            sum= sum+(remainder*remainder*remainder);
            temp=temp/10;
        }
        if(num==sum){
            System.out.println("Your Entered Number is Amstrong Number");
        }
        else
        {
            System.out.println("This is not Amstrong Number: ");
        }
    }
}
