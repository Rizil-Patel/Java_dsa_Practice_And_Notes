import java.util.*;

public class javaPrintReverseNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem;
        while(n > 0){
            rem = n % 10;
            System.out.print(rem);
            n /= 10;
        }
    }
}
