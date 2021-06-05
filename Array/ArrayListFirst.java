
package javaBeginning.Array;

import java.util.ArrayList;


public class ArrayListFirst {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("Size = "+number.size());
        
        // Adding elements in Arraylist
        number.add(10);
        number.add(11);
        number.add(12);
        number.add(13);
        number.add(4,40);
        
        System.out.println(number);
          
    }
}
