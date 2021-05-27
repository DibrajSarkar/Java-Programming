
package javaBeginning.Array;

import java.util.Arrays;


public class SortingInArray {
    public static void main(String[] args) {
        int [] number={10,-3,18,5,25};
        Arrays.sort(number);
        
        System.out.println("Ascending:");
        for (int i = 0; i < number.length; i++) {
            System.out.print("\t"+number[i]);
        }
        System.out.println(" ");
        
        System.out.println("Decending : ");
        for (int i = number.length -1; i>=0; i--) {
            System.out.print("\t"+number[i]);
        }
        System.out.println(" ");
        
        String [] names={"Abdullah", "Rion","Shohan","Mamun"};
        Arrays.sort(names);// sorting according a to z rules
      
        // Ascending wise printing 
        for (int i = 0; i < names.length; i++) {
            System.out.print(" "+names[i]);
        }
        System.out.println(" ");
        
        // Decending wise printing 
        for (int i = names.length-1; i >=0; i--) {
            System.out.print(" "+names[i]);
        }
    }
}
