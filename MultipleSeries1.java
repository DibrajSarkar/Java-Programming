
package javaBeginning;

import java.util.Scanner;

public class MultipleSeries1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,result=1;
        System.out.println("Enter Last Number: ");
        num=input.nextInt();
        
        for (int i = 1; i <=num; i+=2) {
            System.out.println(i+" ");
            result*=i;
        }
        System.out.println(" ");
        System.out.println("Multiple : "+result);
    }
}
