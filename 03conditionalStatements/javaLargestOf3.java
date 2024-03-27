import java.util.*;
public class javaLargestOf3 {
    public static void main(String[] args){
        int a = 5;
        int b = 8;
        int c = 3;
        if((a > b) && (a > c)){
            System.out.println("A is the largest number i.e "+a);
        }else if(b > c){
            System.out.println("B is the largest number i.e "+b);
        }else{
            System.out.println("C is the largest number i.e "+c);
        }
    }
}
