public class numberPyramid {
    public static void printNumberPyramid(int n){
        int count = 1;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){ 
                System.out.print(count+" ");
            }
            count++;
            System.out.println();
        }
    }
    public static void main(String[] args){
        printNumberPyramid(5);
    }
}
