
package javaBeginning;


public class IncreamentDecrement {
    public static void main(String[] args){
    int x=24;
    int y;
    y=x++;//post inncrement
    y=x;
   System.out.println("Value of X is : "+y);
   y=++x;// pre increment
   System.out.println("Next Value of x: "+y);
   int a=10;
    int b;
    
    b=--a;
    System.out.println("Value of a: "+b);
    b=a--;
    System.out.println("Value of a : "+b);
    }
}
