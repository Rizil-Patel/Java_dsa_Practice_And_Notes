import java.util.*;
public class javaElseIf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("You are the adult person");
        }else if(age >= 13 && age < 18){
            System.out.println("You are the teenager");
        }else{
            System.out.println("You are child");
        }
    }
}   
