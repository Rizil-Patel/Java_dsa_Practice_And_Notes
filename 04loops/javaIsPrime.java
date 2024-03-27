import java.util.*;

public class javaIsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n == 2) {
            System.out.println("The entered number " + n + " is prime");
        } else {
            // for (int i = 2; i <= n - 1; i++) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println("The entered number " + n + " is prime");
            } else {
                System.out.println("The entered number " + n + " is not prime");
            }
        }
    }
}
