public class Questions07 {
    public static int findXOR(int L, int R){
        // Calculate the XOR of the given range
        return calculateXOR(R) ^ calculateXOR(L - 1);
    }
    
    // Function to calculate the XOR of numbers from 1 to n
    private static int calculateXOR(int n) {
        switch (n % 4) {
            case 0:
                return n;
            case 1:
                return 1;
            case 2:
                return n + 1;
            default:
                return 0;
        }
    }
}
