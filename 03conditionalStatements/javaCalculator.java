import java.util.*;

public class javaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the operation you want to perform :");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("The sum of two number " + a + " and " + b + " is " + (a + b));
                break;
            case '-':
                System.out.println("The difference of two number " + a + " and " + b + " is " + (a - b));
                break;
            case '*':
                System.out.println("The multiple of two number " + a + " and " + b + " is " + (a * b));
                break;
            case '/':
                System.out.println("The division of two number " + a + " and " + b + " is " + (a / b));
                break;
            case '%':
                System.out.println("The modulo of two number " + a + " and " + b + " is " + (a % b));
                break;
            default:
                System.out.println("Enter the correct operation");
                break;
        }
    }
}

// single quotation marks are used to indicate the chars and double quotation marks are used for the string 