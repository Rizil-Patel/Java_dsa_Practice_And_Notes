public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for(int turn = 0; turn < arr.length-1; turn++){
            int swap = 0;
            for(int j= 0;j<arr.length-1-turn;j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                    System.out.println("i am not sorted");
                }
            }
            if(swap == 0){
                System.out.println("I am already sorted");
                return;
            }
        }

    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        bubbleSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
