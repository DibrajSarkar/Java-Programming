
package javaBeginning.Array;

import java.util.ArrayList;

public class ArrayListPra {
    public static void main( String [] args ){
    ArrayList <Integer> number1 =new ArrayList<>();
    ArrayList <Integer> number2 =new ArrayList<>();
    ArrayList <Integer> number3 =new ArrayList<>();
    
    number1.add(10);
    number1.add(11);
    number1.add(12);
    number1.add(13);
    
        System.out.println(" ArrayList Contains: "+number1);
        System.out.println(" ");
        System.out.println("Size : "+number1.size());
//        number.clear();
//        System.out.println("After Clear ArrayList Contains: "+number);
      boolean is =number1.isEmpty();
        System.out.println("Is it Empty or not: "+is);
        
        number2.add(1);
        number2.add(2);
        number2.add(3);
        number2.add(4);
        
        System.out.println("ArrayList Contains Number2: "+number2);
        
        number3.addAll(number1);
        
        System.out.println("Number 3: "+number3);
        
      boolean result=  number1.equals(number2);
      
        System.out.println("Equals: "+result);
        
      boolean result1=  number1.equals(number3);
      
        System.out.println("Equals: "+result1);
    }
}
