import java.util.*;
public class CheckPalindrome {
    public static boolean isCheck(int n){
        int myNum = n;
        int rem;
        int revNum = 0;
        while(n > 0){
            rem = n%10;
            revNum = (revNum * 10) + rem;
            n = n / 10;
        }
        if(myNum == revNum){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isCheck(n));
    }
}
