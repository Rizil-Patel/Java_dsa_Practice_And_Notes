// to count the number of flip bits 
public class Questions05 {
    public static int flipBits(int A, int B){
        // Write your code here.
        int count = 0;
        int ans = A ^ B;
        while(ans > 0){
            if((ans & 1) != 0){
                count++;
            }
            ans = ans>>1;
        }
        return count;
    }
}
