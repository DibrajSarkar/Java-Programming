
package javaBeginning;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,count=0;
        System.out.println("Enter Any positive Number: ");
        num=input.nextInt();
        for (int i = 2; i <num; i++) {
            if (num%i==0) {
                count++;
                break;
            }
        }
        if (count==0) {
            System.out.println("It's a Prime Number:");
        }
        else{
            System.out.println("It's not a Prime Number:");
        }
    }
}
