public class TilingProblem08 {
    public static int tiling(int n){//2 x n

        // base case
        if(n == 0 || n == 1){
            return 1;
        }

        // // vertical tiles placed
        // int fnm1 = tiling(n - 1);

        // // horizontal tiles placed
        // int fnm2 = tiling(n - 2);
        
        // int total  = fnm1 + fnm2;
        // return total;

        return tiling(n-1) + tiling(n -2);
    } 

    public static void main(String[] args){
        int n = 3;
        System.out.println(tiling(n));
    }
}
