public class Practice3 {
    public static void printMatrix(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void transposeMatrix(int arr[][]){
        for(int i= 0; i<arr[0].length; i++){
            for(int j= 0; j<arr.length; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int arr[][] = {{4,7,8},{8,8,7}};
        printMatrix(arr);
        System.out.println();
        transposeMatrix(arr);
    }
}
