import java.util.*;
public class JavaBasics6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a and b :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int product = a*b;
        System.out.println("Product of a and b is"+ product);
        System.out.println("Sum of a and b is"+sum);
    }
}
