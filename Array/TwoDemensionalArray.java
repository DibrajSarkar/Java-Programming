
package javaBeginning.Array;


public class TwoDemensionalArray {
    public static void main(String[] args) {
        int [][]num=new int[2][3];
        num[0][0]=12;
        num[0][1]=13;
        num[0][2]=22;
        num[1][0]=14;
        num[1][1]=15;
        num[1][2]=16;
        
        System.out.println("Print Value like Matrix: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+num[row] [col]);
                
            }
            System.out.println(" ");
        }
        //System.out.println(num[0][2]);
    }
}
