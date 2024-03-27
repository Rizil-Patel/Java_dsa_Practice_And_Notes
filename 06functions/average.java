import java.util.*;
public class average {
    public static float avgOfNum(float a , float b,float c) {
        return (a+b+c)/3;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float avg = avgOfNum(a, b, c);
        System.out.println(avg);
    }
}
