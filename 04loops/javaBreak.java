import java.util.*;
public class javaBreak {
  public static void main(String[] args){
    int i;
    for( i = 0; i < 5;i++){
        if( i == 3){
            break;
        }
    }
    System.out.println("i am out of the loop at i = " + i);
  }  
}
