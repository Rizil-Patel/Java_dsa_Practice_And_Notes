import java.util.*;
public class JavaBasics7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of the radius :");
        int radius = sc.nextInt();
        float area = 3.14f*radius*radius;
        //here 3.14f to be written to tell it is a float type value otherwise it will take the double value by default
        System.out.println("Area of the circle is " + area);
    }
}
