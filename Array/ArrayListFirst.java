
package javaBeginning.Array;

import java.util.ArrayList;
import java.util.Iterator;


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
        
        Iterator itr =number.iterator();
        while(itr.hasNext()){
            System.out.print(" "+itr.next());
        }
//        for(int x: number){
//            System.out.print(" "+x);
//        }

        System.out.println( );
        System.out.println(number);
        
          
    }
}
