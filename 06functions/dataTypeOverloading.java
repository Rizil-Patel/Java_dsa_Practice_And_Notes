public class dataTypeOverloading {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        float c = 3.5f;
        float d = 5.5f;
        System.out.println(sum(a, b));
        System.out.println(sum(c, d));
    }
}
