
package javaBeginning;

import java.util.Scanner;

public class SeriesProblem {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double num,result=1;
        System.out.println("Enter last number: ");
        
        num=input.nextDouble();
        
        for (double  i =  num; i<=10; i++) {
            System.out.println(i+" ");
            result*=i;
        }
        
        System.out.println("Result : " +result);
    }
}
