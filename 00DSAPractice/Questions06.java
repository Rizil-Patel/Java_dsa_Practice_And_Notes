
// to print that number which occurs odd number of time 
public class Questions06 {
    public static int missingNumber(int n, int []arr){
        // Write your code here.
        int ans = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(max <= arr[i]){
                max = arr[i];
            }
        }
        int hash[] = new int[max + 1];
        for(int i = 0;i<n;i++){
            hash[arr[i]] = hash[arr[i]] + 1;
        }
        for(int i = 0;i<max + 1;i++){
            if(hash[i]%2 != 0){
                ans = i;
            }
        }
        return ans;
    }
}
