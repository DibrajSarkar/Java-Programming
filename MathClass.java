
package javaBeginning;

import java.util.Scanner;

public class MathClass {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int a,b;
        System.out.println("Enter two Number: ");
        a=input.nextInt();
        b=input.nextInt();
    int x=2;
    int y=3;
    int max=Math.max(a, b);
//    System.out.println(Math.max(x, y));
//    System.out.println(Math.min(x, y));
    System.out.println("Maximum Number: " +max);
    
    int min=Math.min(a,b);
    System.out.println("Maximum Number: " +min);
    
    int absolute = Math.abs(y);
    System.out.println("Absolute value: "+ absolute);
    double power=Math.pow(x, y);
    System.out.println("x to the power y: "+power);
    
    float k=10.2343f;
    float round=Math.round(k);
    System.out.println("Round Value: "+round);
    System.out.println(Math.PI);
    
    }
    
}
