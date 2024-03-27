public class OddOrEven {
    public static void OddOrEvenfxn(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("The entered number is even");
        }else{
            System.out.println("The entered number is odd");
        }
    }

    // sometimes you should take the (i - 1) also becoz in some there is not the zero based indexing
    public static int getIthBit(int n ,int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setIthBit(int n ,int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static int clearIthBit(int n ,int i){
        int bitMask = 1<<i;
        return n & ~bitMask;
    }
    public static int updateIthBit(int n ,int i,int newbit){
        // if(newbit == 0){
        //     return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int Bitmask = newbit<<i;
        return n | Bitmask;
    }

    public static int clearIBit(int n ,int i){
        int Bitmask = (~0)<<i;
        return n & Bitmask;
    }

    public static int clearRangeOfBits(int n,int i,int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean ifPowOfTwo(int n){
        return (n & (n-1)) == 0;
    }

    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int FastExpo(int n ,int a){
        int ans= 1;
        while(n > 0) {
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
    public static void main(String[] args){
        OddOrEvenfxn(3);
        OddOrEvenfxn(0);
        OddOrEvenfxn(10);
        System.out.println(getIthBit(10, 3));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(14, 2));
        System.out.println(updateIthBit(14, 2, 0));
        System.out.println(clearIBit(15, 2));
        System.out.println(clearRangeOfBits(10, 2, 4));
        System.out.println(ifPowOfTwo(8));
        System.out.println(countSetBits(15));
        System.out.println(FastExpo(3, 3));
    }
}
