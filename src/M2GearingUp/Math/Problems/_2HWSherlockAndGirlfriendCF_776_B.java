package M2GearingUp.Math.Problems;

import java.util.Scanner;

// https://codeforces.com/contest/776/problem/B

public class _2HWSherlockAndGirlfriendCF_776_B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n == 1){
            System.out.println(1);
            System.out.print(1);
            return;
        }
        if(n == 2){
            System.out.println(1);
            System.out.print(1+" "+1);
            return;
        }
        int [] jewels = new int[n+5];
        int color = 2;
        int p = 2;
        for (; p*p <= n+1; p++) {
            if(jewels[p] == 0){
                jewels[p] = 1;
                // color++;
                // here rule is color compare only with primes and it's factors
                // all primes can have same color
                // all multiples of primes can have same color
                // at the end only 2 colors
                for (int m = p; p*m <= n+1; m++) {
                    if(jewels[p*m] == 0) jewels[p*m] = color;
                }
            }
        }
        for (p = (int)Math.sqrt(n+1); p <= n+1; p++) {
            if(jewels[p] == 0) jewels[p] = 1;
        }

        /**
         * corner cases failed...
         * n = 1,2 colors = 1;
         * n = 3 colors = 2;
          */

        System.out.println(color);
        for (int i = 2; i <= n+1; i++) {
            System.out.print(jewels[i]+" ");
        }
    }
}
