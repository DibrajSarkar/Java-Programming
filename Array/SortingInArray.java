
package javaBeginning.Array;

import java.util.Arrays;


public class SortingInArray {
    public static void main(String[] args) {
        int [] number={12,12,24,54,45,56};
        Arrays.sort(number);
        
        for (int i = 0; i < number.length; i++) {
            System.out.println(" "+number[i]);
        }
    }
}
