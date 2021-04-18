
package javaBeginning;

import java.util.Scanner;

public class EvenOddCheck {
    
    public static void main(String [] args ){
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("Enter your desire positive Number: ");
        num=input.nextInt();
        if(num%2!=1){
         //num%2==0;
            System.out.println("Number is Even");
            
        }
        else{
    System.out.println("Number is Odd");
    }
    }
}
