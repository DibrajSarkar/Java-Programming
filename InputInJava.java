/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

import java.util.Scanner;

/**
 *
 * @author DibrajSarkar
 */
public class InputInJava {
    public static void main(String[] args){
        Scanner Num=new Scanner(System.in);
        Scanner Name=new Scanner(System.in);
        Scanner Num1=new Scanner (System.in);
      int number;
      int number1;
    System.out.println("Enter Your Desire Number: ");
    number=Num.nextInt();
    System.out.println("Enter Your Desire Number: ");
    number1=Num1.nextInt();
    
    System.out.println("Sum of these Two Number is: "+(number+number1));
    String name;
    System.out.print("Enter Your Name: ");
    name=Name.nextLine();
    System.out.println("Your Name is: "+name);
   
    }
    
}