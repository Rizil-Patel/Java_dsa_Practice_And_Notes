import java.util.*;

public class decimalToBin {

    public static void decimalToBin(int dec) {
        int pow = 0;
        int binNum = 0;
        int rem;
        int myNum = dec;
        while (dec > 0) {
            rem = dec % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            dec = dec / 2;
        }
        System.out.println("The binary number of " + myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decimalToBin(n);
    }
}
