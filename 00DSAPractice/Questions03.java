// if this is given then try to take it as a single input array and return it
public class Questions03{
    public static void swapNumber(int []a, int []b) {
        // Write your code here.
        a[0] = a[0] + b[0];
        b[0] = a[0] - b[0];
        a[0] = a[0] - b[0];
        return;
    }
}