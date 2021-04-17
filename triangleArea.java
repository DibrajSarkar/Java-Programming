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
public class triangleArea {
    public static void main(String [] args){
    Scanner input=new Scanner (System.in);
    double base, height,result;
    System.out.println("Enter Base: ");
    base=input.nextDouble();
    System.out.println("Enter Height of Triangle: ");
    height=input.nextDouble();
    result=0.5*base*height;
    System.out.println("Area of a Triangle: "+result);
    
    }
}
