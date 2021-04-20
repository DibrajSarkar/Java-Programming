
package javaBeginning;

import java.util.Scanner;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        int n,m;
        int sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Inital Number:");
        n=input.nextInt();
        System.out.println("Enter Final Number: ");
        m=input.nextInt();
        for (int i = n; i <=m; i++) {
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Sum of Even Number: "+sum);
    }
}
