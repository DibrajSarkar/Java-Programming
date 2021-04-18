// Checking Letter Capital or small using and opearator
package javaBeginning;

import java.util.Scanner;

public class LogicalAndOpearetor {
    public static void main(String [] args ){
    Scanner input =new Scanner (System.in);
    char ch;
    System.out.println("Enter Any Character: ");
    ch =input.next().charAt(0);
    if(ch>='a' && ch<='z'){
        System.out.println("Small Letter ");
    }
    else if (ch>='A' && ch<='Z'){
        System.out.println("Capital Letter ");
    }
    else {
            System.out.println("Not a letter ");
            }
    }
}