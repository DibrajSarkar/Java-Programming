
package javaBeginning.Array;

import java.util.ArrayList;


public class ArrayListFirst {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        
        
        System.out.println();
        
        // Adding elements in Arraylist
        number.add(10);
        number.add(11);
        number.add(12);
        number.add(13);
        number.add(4,40);
        
        for(int x: number){
            System.out.print(" "+x);
        }
       
        System.out.println( );
        System.out.println("Array Contrains: "+number);
        
          // Removing Elements 
          number.remove(2);
          System.out.println(" After Removing : Array Contains: "+number);
          number.removeAll(number);
          
          // Removing All Elements from array
          System.out.println(number);
          
    }
}
