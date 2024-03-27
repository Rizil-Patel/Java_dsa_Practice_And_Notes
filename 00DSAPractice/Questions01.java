// Roman number to integer value number 
public class Questions01 {
    public static int romanToInt(String s) {
        // Write your code here
        int num = 0;
        int ans = 0;
        int store[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            store[i] = num;
        }
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && store[i] < store[i + 1]) {
                ans += store[i + 1] - store[i];
                i++;
            } else {
                ans += store[i];
            }
        }
        return ans;
    }
}
