public class lastOccuernece {
    public static int lastOccuernece(int arr[],int key,int i){ 
        if(i == arr.length - 1){
            return -1;
        }
        int isfound = lastOccuernece(arr, key, i+1);
        if(isfound == -1 && arr[i] == key){
            return i;
        }
        return isfound;   
    }
    public static void main(String[] args){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(lastOccuernece(arr, 5, 0));
    }
}
