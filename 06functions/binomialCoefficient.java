import java.util.*;
public class binomialCoefficient {

    public static int factorial(int n){
        int f = 1;
        for(int i =1;i<=n;i++){
            f *= i;
        }   
        return f;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int coe = factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println(coe);
    }
}
