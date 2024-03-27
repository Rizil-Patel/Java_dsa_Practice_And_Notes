public class ArrayBinarySearch {
    public static int BinarySearch(int numbers[],int key){
        int start = 0;
        int end = numbers.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            // comparisons 
            if(numbers[mid] == key){
                return mid;
            }
            // right
            if(numbers[mid] < key){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;
        int ans = BinarySearch(numbers, key);
        if(ans == -1) {
            System.out.println("Not Found");
        }else{
            System.out.println("The key is found at index: " + ans);
        }
    }
}
