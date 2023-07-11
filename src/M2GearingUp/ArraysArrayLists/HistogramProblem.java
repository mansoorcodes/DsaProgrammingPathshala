package M2GearingUp.ArraysArrayLists;

import java.util.Scanner;
// Rain water problem.

public class HistogramProblem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        // Prefix max
        int[] pMax = new int[n];
        pMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pMax[i] = Math.max(pMax[i-1], arr[i]);
        }
        // Suffix max
        int[] sMax = new int[n];
        sMax[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            sMax[i] = Math.max(sMax[i+1], arr[i]);
        }

        // core logic
        int ans = 0;
        for (int i = 1; i <= n-2; i++) {
//            int leftMax = pMax[i];
//            int rightMax = sMax[i];
//            I did Wrong here. I have to find who is tallest on my left, right
            // but I included myself which is not the correct way.
            int leftMax = pMax[i-1];
            int rightMax = sMax[i+1];
            int deciding = Math.min(leftMax, rightMax);
            if(deciding > arr[i]) ans+= deciding - arr[i];
        }
        System.out.println(ans);
    }
}
