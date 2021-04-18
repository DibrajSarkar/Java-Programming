
package javaBeginning;

import java.util.Scanner;


public class IfElse {
    public static void main(String [] args){
    Scanner input=new Scanner (System.in);
    int num;
    System.out.println("Enter Your Desire Number: ");
    num=input.nextInt();
    
    if(num>0){
    System.out.println("Number is Positive");
    }
    else if(num<0){
        System.out.println("Number is Negative");
    }
    else{
        System.out.println("Zero");
    }
    }
}
 