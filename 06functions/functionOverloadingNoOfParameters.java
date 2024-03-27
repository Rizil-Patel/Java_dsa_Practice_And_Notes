import java.util.*;
public class functionOverloadingNoOfParameters {

    public static int sumOfTwoNum(int a, int b) {
        return a + b;
    }

    public static int sumOfThreeNum(int a, int b,int c) {
        return a + b + c;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(sumOfTwoNum(a, b));
        System.out.println(sumOfThreeNum(a, b, c));
    }
}
