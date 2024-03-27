import java.util.*;
public class JavaPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Question 1
        // System.out.print("Enter the values of three number a,b,c:");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // float avg = (a+b+c)/3;
        // System.out.println("The average of the three number is "+avg);

        //Question 2
        // System.out.println("Enter the side of the square");
        // int side = sc.nextInt();
        // int areaSquare = side*side;
        // System.out.println("The are of the square is "+areaSquare);

        // Question 3
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float totalPrice = 0.18f*(pen + pencil + eraser);
        System.out.println("Therefore the total price of the shopping is "+totalPrice);
    }
}
