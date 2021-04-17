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
public class ArithmaticDemo {
    public static void main(String[] args){
    Scanner input=new Scanner (System.in);
    int num1,num2,result;
    System.out.println("Enter First Numbers: ");
    num1=input.nextInt();
    System.out.println("Enter Another Numbers: ");
    num2=input.nextInt();
    
    result=num1+num2;
    System.out.println("Sum is: "+result);
    
    result=num1-num2;
    System.out.println("Sab is: "+result);
    
    result=num1/num2;
    System.out.println("Devide is: "+result);
    
    result=num1%num2;
    System.out.println("Reminder is: "+result);
    
    result=num1*num2;
    System.out.println("Multiple is: "+result);
    
int x,y;
x=3;y=2;

x+=y;// x=x+y,x=3+2;
System.out.println("X = "+x);

x-=y;
System.out.println("X = "+x);//x=x-y=3

x*=y;
System.out.println("X = "+x);//x =x*y=6

x/=y;
System.out.println("X = "+x);//x =x/y=3

x%=y;
System.out.println("X = "+x);// x=x%y=1



    
    }
}