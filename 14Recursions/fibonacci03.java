public class fibonacci03 {
    public static int fib(int n){
        // if(n == 1){
        //     return 1;
        // }
        // if(n == 0){
        //     return 0;
        // }

        //more optimized
        if(n == 0 || n == 1){
            return n;
        }
        int fibnm2 = fib(n - 2);
        int fibnm1 = fib(n - 1);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }
    public static void main(String[] args){
        int n = 5; 
        System.out.println(fib(n));
    }
}
