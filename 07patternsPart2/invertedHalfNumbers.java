public class invertedHalfNumbers {
    public static void invertedNumbers(int m,int n){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        invertedNumbers(5,5);
    }
}
