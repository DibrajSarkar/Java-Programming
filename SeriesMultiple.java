
package javaBeginning;
import java.util. Scanner;
public class SeriesMultiple {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
       int n,m;
       int sum=1;
        System.out.println("Enter inital number: ");
        n=input.nextInt();
        System.out.println("Enter Last Number: ");
        m=input.nextInt();
       
        for (int i = n;i<=m; i++) {
            System.out.println(i+" ");
            sum*=i; 
        }
        System.out.println("Sum of Multiple :"+sum);
    }
}