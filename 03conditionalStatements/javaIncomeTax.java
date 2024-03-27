import java.util.*;
public class javaIncomeTax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        int income = sc.nextInt();
        if( income < 500000){
            System.out.println("You need to pay "+ 0 + " tax");
        }else if( income >= 500000 && income < 1000000){
            System.out.println("You need to pay "+ 0.2*income + " tax");
        }else{
            System.out.println("You need to pay "+ 0.3*income + " tax");
        }
    }
}
