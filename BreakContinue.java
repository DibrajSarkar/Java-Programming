
package javaBeginning;


public class BreakContinue {
    public static void main(String [] args){
//    int i;
//    for(i=1;i<=100;i++){
//        if(i==10){
//            break;
//        }
//        System.out.println(i);
//    }

//    int x;
//    for (x=1;x<=10;x++){
//        if(x==5) {
//            continue;
//        }
//    }
//    System.out.println(x);
 
int i;
    for(i=1;i<=100;i+=3){
        if(i==10){
        continue;
        }
        if(i>13){
        break;
        }
        System.out.println(i);;
    }
    }
    
}  
