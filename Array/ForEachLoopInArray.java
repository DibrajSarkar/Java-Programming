
package javaBeginning.Array;

public class ForEachLoopInArray {
    public static void main(String[] args) {
        String [] names=new String[4];
        names[0]="SA Abdullah";
        names[1]="Rion Al Noman";
        names[2]="Java";
        names[3]="QA Engineer";
        
//        for (int i = 0; i <names.length; i++) {
//            System.out.println(names[i]);
//        }
      for(String x : names){
          System.out.println(x);
      }
      int [] num={10,12,13,15,14,100,200,144};
      int sum=0;
      for(int y : num){
          sum=sum+y;
      }
      System.out.println("Total Sum is: "+sum);
    }
}
