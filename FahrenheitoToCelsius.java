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
public class FahrenheitoToCelsius {
    public static void main(String [] args){
    Scanner input=new Scanner(System.in);
    double cel,fah;
    System.out.println("Enter Fahrenheit: ");
    fah=input.nextDouble();
    cel=5/9*fah-32;
    System.out.println("Temperature in Celsius: "+cel);
    
    }
    
}
