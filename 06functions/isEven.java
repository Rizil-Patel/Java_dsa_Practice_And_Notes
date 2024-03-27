import java.util.*;
public class isEven {
    public static boolean EvenNum(int num) {
        if(num % 2 == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(EvenNum(n));
    }
}
