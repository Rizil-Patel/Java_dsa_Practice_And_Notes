public class Questions09 {
    public static int power(int N, int R){
        int ans = 1;

        int mod=1000000007;

        // Multipling 'N', 'R' times.
        for (int i = 1; i <= R; i++)
        {
            ans = (int)((ans *(1l)* N) % mod);
        }
        return ans;
    }
}
