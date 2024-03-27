import java.util.*;
public class javaStoreReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lastDigit;
        int revNumber = 0;
        while(n > 0){
            lastDigit = n % 10;
            revNumber = (revNumber * 10) + lastDigit;
            n /= 10;
        }
        n = revNumber;
        System.out.println(n);
    }
}
