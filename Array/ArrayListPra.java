
package javaBeginning.Array;

import java.util.ArrayList;

public class ArrayListPra {
    public static void main( String [] args ){
    ArrayList <Integer> number =new ArrayList<>();
    
    number.add(10);
    number.add(11);
    number.add(12);
    number.add(13);
    
        System.out.println(" ArrayList Contains: "+number);
        System.out.println(" ");
        System.out.println("Size : "+number.size());
        number.clear();
        System.out.println("After Clear ArrayList Contains: "+number);
    }
}
