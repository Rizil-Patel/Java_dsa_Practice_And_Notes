import java.util.*;
public class Strings01 {
    public static void printchar(String str){
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static boolean checkPalindrome(String str) {
        for(int i=0; i<str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                //not a palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        char arr[] = {'a', 'b', 'c', 'd', 'e'};
        String str = "abcde";
        String str2 = new String("abcde");

        //strings are immutable
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();//just only takes first word
        // String fullname = sc.nextLine();
        // System.out.println(name);
        // System.out.println(fullname);

        // String name = sc.nextLine();
        // System.out.println(name.length());

        //string concatenation
        // String firstname = "rizil";
        // String lastname = "patel";
        // String fullname = firstname + " " + lastname;
        // System.out.println(fullname);


        // System.out.println(fullname.charAt(4));
        // printchar(fullname);

        //check if a number is palindrome or not
        String givestr = sc.nextLine();
        System.out.println(checkPalindrome(givestr)) ;
    }
}
