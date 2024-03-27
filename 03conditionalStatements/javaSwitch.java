import java.util.*;
public class javaSwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:System.out.println("Samosa");
                break;
            case 2:System.out.println("Burger");
                break;
            case 3:System.out.println("Pizza");
                break;
            case 4:System.out.println("mango shake");
                break;
            default:System.out.println("We realize that we were dreaming");
                break;
        }
    }
}

// note : char can only take the single value only for the multiple values you need to take the string 