import java.util.*;
public class representation {
    public static void largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if( largest < matrix[i][j]){
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println(largest);
    }

    public static void smallest(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if( smallest > matrix[i][j]){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println(smallest);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int m = matrix.length, n = matrix[0].length;
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        largest(matrix);
        smallest(matrix);
    }
}
