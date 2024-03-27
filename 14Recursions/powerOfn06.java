public class powerOfn06 {

    public static int powerOfn(int x, int n){
        if(n == 0){
            return 1;
        }
        int xnm1  = powerOfn(x, n-1);
        int xn = x * xnm1;
        return xn;
    }
    public static void main(String[] args){
        int n = 5;
        int x = 2;
        System.out.println((powerOfn(x, n)));
    }
}
