import java.util.*;

public class Practice1 {
    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // int ans = countVowels(str);
        // System.out.println("The number of lowercase vowels are " + ans);

        // String strnew = "ShradhaDidi";
        // String str1 = "ApnaCollege";
        // String str2 = "ShradhaDidi";
        // System.out.println(strnew.equals(str1) + " " + strnew.equals(str2));

        String string2 = "ApnaCollege".replace("l","");
        System.out.println(string2);
    }
}
