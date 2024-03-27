// division of numbers without using modulo , divide sign and multiplication sign 
public class Questions04 {
    public static int divideTwoInteger(int dividend, int divisor) {
        // Write your code here.
        int numdivisor = Math.abs(divisor);
        int numdividend = Math.abs(dividend);
        int count = 0;
        while(numdividend >= numdivisor){
            numdividend -= numdivisor;
            count++;
        }
        return (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)  ? -count : count;
    }

    // bits method to solve the question 
    // public static int divideTwoInteger(int dividend, int divisor)
    // {
    //     // Initially store  whether dividend, divisor are negative or positive.

    //     boolean isDividendNegative = false;
    //     if(dividend < 0)
    //     {
    //         dividend *= -1;
    //         isDividendNegative = true;
    //     }

    //     boolean isDivisorNegative = false;
    //     if(divisor < 0)
    //     {
    //         divisor *= -1;
    //         isDivisorNegative = true;
    //     }

    //     long b = divisor;
    //     long a = dividend;

    //     long quotient = 0;

    //     for(int i = 30; i >= 0; i--)
    //     {
    //         if((b<<i) <= a)
    //         {
    //             a -= (b<<i);
    //             quotient |= (1<<i);
    //         }
    //     }

    //     // Both are negative.
    //     if(isDividendNegative && isDivisorNegative)
    //     {
    //         return (int)quotient;
    //     }

    //     // Both are positive.
    //     if(!isDividendNegative && !isDivisorNegative)
    //     {
    //         return (int)quotient;
    //     }

    //     // One is negative and one is positive.
    //     return -1*(int)quotient;
    // }
}
