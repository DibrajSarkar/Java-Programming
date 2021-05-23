package javaBeginning.Array;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] number = new int[5];
        number[0] = 10;
        number[1] = 11;
        number[2] = 12;
        number[3] = 14;
        number[4] = 15;
        int len=number.length;
        
        System.out.println("Size of Array"+len);
        System.out.println(number[3]);
        
        double [] num=new double[3];
        num[0]=1.11;
        num[1]=1.12;
        num[2]=1.13;
        double  sum=num[0]+num[1]+num[2];
        System.out.println("");
        System.out.println(num[2]);
        

    }
}
