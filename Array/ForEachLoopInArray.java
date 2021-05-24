
package javaBeginning.Array;

public class ForEachLoopInArray {
    public static void main(String[] args) {
        String [] names=new String[4];
        names[0]="SA Abdullah";
        names[1]="Rion Al Noman";
        names[2]="Java";
        names[3]="QA Engineer";
        for (int i = 0; i <names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
