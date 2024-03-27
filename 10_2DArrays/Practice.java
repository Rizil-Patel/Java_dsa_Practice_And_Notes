public class Practice {
    public static int findNum(int arr[][],int key){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0;j < arr[0].length; j++){
                if( arr[i][j] == key){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int arr[][] = {{4,7,8},{8,8,7}};
        int ans = findNum(arr, 8);
        System.out.println("The number of 8's found are: " + ans);
    }
}
