import java.util.Arrays;
import java.util.Collections;
public class InsertionSort {
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static int compare(int a, int b) {
        // a < b -> -ve;
        // a == b -> 0;
        // a >= b -> +ve;
        return a - b;
    }
    public static void main(String[] args){
        Integer arr[] = {5,4,3,1,2};
        // insertionSort(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        // Arrays.sort(arr,2,5);//here the ending index is non inclusive
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
