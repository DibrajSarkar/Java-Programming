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
public class CircleArea {
    public static void main(String [] args ){
    Scanner input=new Scanner(System.in);
    double radius,Area;
    System.out.println("Enter Redius  a circle: ");
    System.out.println(2 << 4);
   radius=input.nextDouble();
   Area=3.14159*(radius*radius);
   System.out.println("Area of A Circle: "+Area);
   
    }
}
