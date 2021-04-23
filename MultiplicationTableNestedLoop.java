
package javaBeginning;

import java.util.Scanner;


public class MultiplicationTableNestedLoop {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n,m;
        System.out.println("Enter initial Number: ");
        n=input.nextInt();
        System.out.println("Enter Final Number: ");
        m=input.nextInt();
        for (int i = n; i <=m; i++){//outerloop {
            for (int j = 0; j <=10; j++)//inner loop .when inner loop conditions false then go outerloop {
                System.out.println(i+" X "+j+" = " +i*j);
            }
        }
}
    
