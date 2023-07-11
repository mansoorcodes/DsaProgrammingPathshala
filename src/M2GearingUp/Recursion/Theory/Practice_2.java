package M2GearingUp.Recursion.Theory;

import java.util.Scanner;

public class Practice_2 {
     static long [] result = {1};
    public static void main(String[] args) {
//        double res = Math.pow(1000, 1000000000);
//        System.out.println(res);
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();
        long k = scn.nextInt();
        long mod = 1000000000+7;
        result [0] = 1;
        System.out.println(powerCalculator(n, k, mod));
        System.out.println(result [0]);
    }

    private static long powerCalculator(long n, long k, long mod) {
        if(k == 0) return 1;
        if(k == 1) return n;
        if(k == 2 || k == 3) {
            result [0] = n % mod;
            result [0] *= result [0];
            result [0] %= mod;
            if(k == 3) {
                result [0] *= (n % mod);
                result [0] %= mod;
            }
        }
        long currVal = powerCalculator(n, k/2, mod);
        if(k > 3) {
            result [0] *= result [0];
            result [0] %= mod;
            if(k %2 == 1) {
                result [0] *= (n % mod);
                result [0] %= mod;
            }
        }
        currVal *= currVal;
        if(k %2 == 1) currVal*= n;
        return currVal;
    }
}
