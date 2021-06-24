
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
    }
}
