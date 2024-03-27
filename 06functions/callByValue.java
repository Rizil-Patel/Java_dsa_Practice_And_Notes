public class callByValue {
    // callByValue
    public static void swap(int a, int b) {
        // swaping two variables
        a = a + b;//5 + 10
        b = a - b;//15 - 10
        a = a - b;//15 - 5
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        swap(a, b);
        System.out.println(a);
        System.out.println(b);
    }
}
