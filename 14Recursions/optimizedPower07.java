public class optimizedPower07 {
    // O(logn)
    public static int optimizedPower(int a,int n){

        if(n == 0){
            return 1;
        }

        int halfpower = optimizedPower(a, n/2);
        int halfpowersq = halfpower * halfpower;

        if(n%2 != 0){
            halfpowersq = a*halfpowersq;
        }

        return halfpowersq;
    }
    public static void main(String[] args){
        int a = 2;
        int n = 10;
        System.out.println(optimizedPower(a, n));
    }
}
