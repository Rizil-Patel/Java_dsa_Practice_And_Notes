import java.util.*;
public class ArrayLinearSearch {
    public static int linearSearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int number[] = {2,4,6,8,10,12,14,16};
        int key = 10;
        int ans = linearSearch(number, key);
        System.out.println(ans);
    }
}
