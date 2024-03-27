public class invertedHalfPyramid {
    // m -> rows and n -> columns
    public static void printPyramid(int m, int n) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPyramid(4, 4);
    }
}