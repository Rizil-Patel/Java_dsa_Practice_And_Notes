import java.util.*;
public class javaPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // question 1
        // System.out.println("Enter the number of your choice: ");
        // int num = sc.nextInt();
        // if( num < 0 ){
        //     System.out.println("The entered number is negative.");
        // }else if( num == 0){
        //     System.out.println("The entered number is zero.");
        // }else{
        //     System.out.println("The entered number is positive.");
        // }

        // Question 2
        // double temp = 103.5;
        // if(temp >= 100){
        //     System.out.println("The patient is having a fever.");
        // }else{
        //     System.out.println("The patient is not having a fever.");
        // }

        // Question 3
        // System.out.println("Enter the day of the week you want to see:");
        // int day = sc.nextInt();
        // switch (day) {
        //     case 1:System.out.println("Monday");
        //         break;
        //     case 2:System.out.println("Tuesday");
        //         break;
        //     case 3:System.out.println("Wednesday");
        //         break;
        //     case 4:System.out.println("Thursday");
        //         break;
        //     case 5:System.out.println("Friday");
        //         break;
        //     case 6:System.out.println("Saturday");
        //         break;
        //     case 7:System.out.println("Sunday");
        //         break;
        //     default:System.out.println("You have entered the wrong day.");
        //         break;
        // }

        // Question 4
        System.out.println("Enter the year:");
        int year = sc.nextInt();
        if( year%4 == 0 ){
            if( year%100 == 0 ){
                if( year%400 == 0 ){
                    System.out.println("It is a leap year.");
                }else{
                    System.out.println("It is not a leap year.");
                }
            }else{
                System.out.println("It is a leap year.");
            }
        }else{
            System.out.println("It is not a leap year.");
        }
    }
}
