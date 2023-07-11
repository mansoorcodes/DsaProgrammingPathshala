package M2GearingUp.Recursion.DivideAndConquer;

import java.util.Scanner;

public class FastExponent {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        //find n^k --> long value.
        System.out.println(powerUsing2(n,k));
        // System.out.println(powerUsing3(n,k));


        // here getting some value but in recursion I'm getting 0 for bigger values multiplication...
//        long cv = 348765082368572323L;
//        cv *= cv;
//        System.out.println(cv);
    }

    private static long powerUsing3(int n, int k) {
        if(k == 0) return 1;
        long currVal = powerUsing3(n, k/3);
        currVal = (currVal * currVal * currVal);
        if(k %3 == 1) currVal *= n;
        if(k %3 == 2) currVal *= (long)n * n;
        return currVal;
    }

    private static long powerUsing2(int n, int k) {
        if(k == 0) return 1L;
        long currVal = powerUsing2(n, k/2);
        currVal *= currVal;
        if(k %2 == 1) currVal *= n;
        return currVal;
    }
}
