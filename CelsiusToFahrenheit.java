/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

import java.util.Scanner;

/**
 
 * @author saabdullah
 */
public class CelsiusToFahrenheit {
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    double celsius,fahrenheit;
    System.out.println("Enter Your temperatur in Celsius: ");
    celsius=input.nextDouble();
    fahrenheit=(1.8*celsius)+32;
    System.out.println("Fahrenheit: "+fahrenheit);
    
    }
    
}
