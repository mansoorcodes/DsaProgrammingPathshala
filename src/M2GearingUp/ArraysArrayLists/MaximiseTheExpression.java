package M2GearingUp.ArraysArrayLists;

import java.util.Scanner;

public class MaximiseTheExpression {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = scn.nextInt(), q = scn.nextInt(), r = scn.nextInt();
        long [] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextLong();
        }

        // our own Prefix Max
        long [] pMax = new long[n];
        pMax[0] = p * arr[0];
        for (int i = 1; i < n; i++) {
            pMax[i] = Math.max(pMax[i-1], p * arr[i]);
        }
        // our own Suffix Max
        long [] sMax = new long[n];
        sMax[n-1] = r * arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            sMax[i] = Math.max(sMax[i+1], r * arr[i]);
        }

        // core Logic
        // fixing j and finding our own Max on left and right
        long ans = Long.MIN_VALUE;
        for (int j = 0; j <= n-1; j++) {
            ans = Math.max(pMax[j] + q* arr[j] + sMax[j], ans);
        }
        System.out.println(ans);
    }
}
