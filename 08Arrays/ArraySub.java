import java.util.*;
public class ArraySub {
    public static void subArray(int numbers[] ,int n){
        int ts = (n*(n+1))/2;
        int sumArray[] = new int[ts];
        int l=0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length;j++){
                int sum = 0;
                for(int k = i;k<=j;k++){
                    sum += numbers[k];
                    System.out.print(numbers[k]+" ");
                }
                sumArray[l] = sum;
                l++;
                System.out.println();
            }
            System.out.println();
        }
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<sumArray.length; i++) {
            System.out.print(sumArray[i]+" ");
        }
        System.out.println();
        for(int i = 0;i<sumArray.length; i++) {
            if(largest < sumArray[i]) {
                largest = sumArray[i];
            }
            if(smallest > sumArray[i]) {
                smallest = sumArray[i];
            }
        }
        System.out.println("largest sum is : "+largest);
        System.out.println("smallest sum is : "+smallest);
    }
    public static void main(String[] args){
        int numbers[] = {2,4,6,8,10};
        subArray(numbers,numbers.length);
    }
}
