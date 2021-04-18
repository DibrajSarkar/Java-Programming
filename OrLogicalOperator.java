package javaBeginning;

import java.util.Scanner;


public class OrLogicalOperator {
    public static void main(String [] args){
    Scanner input =new Scanner(System.in);
    char ch;
    System.out.println("Enter Any Character: ");
    ch=input.next().charAt(0);
    if(ch=='a'|| ch=='A' || ch=='E' || ch=='e' || ch=='I'||ch=='i' || ch=='o'|| ch=='O'|| ch=='u' ||ch=='U' ){
        System.out.println("Vowel");
    }
    else{
    System.out.println("Consonant");
    }
    }
}

    
