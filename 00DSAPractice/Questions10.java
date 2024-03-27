// to find the power of a number raised to n 
public class Questions10 {
    public static double myPow(double x, int n) {
        // Write Your Code Here
        double ans = 1.0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                ans = (ans * (1d) * x);
            }
        }else if(n == 0){
            ans = 1.0;
        }else{
            int new1 = Math.abs(n);
            for (int i = 1; i <= new1; i++) {
                ans = (ans * (1d) * x);
            }
        }
        return ( n > 0) ? ans : 1/ans;
    }
}
