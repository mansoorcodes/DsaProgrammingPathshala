package M2GearingUp.ArraysArrayLists;

import java.util.Scanner;

public class BestTimeToBuyAndSellStocks1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scn.nextInt();
        }
        // calculate Prefix min []
        int [] pMin = new int[n];
        pMin[0] = prices[0];
        for (int i = 1; i < n; i++) {
            pMin[i] = Math.min(pMin[i-1], prices[i]);
        }

        // and Suffix Max []
//        int [] sMax = new int[n];
//        sMax[n-1] = prices[n-1];
//        for (int i = n-2; i >= 0; i--) {
//            sMax[i] = Math.max(sMax[i+1], prices[i]);
//        }

        //core logic
        int ans = Integer.MIN_VALUE;
        int currMaxFromRight = Integer.MIN_VALUE;
        for (int i = n-1; i >= 0; i--) {
            currMaxFromRight = Math.max(currMaxFromRight, prices[i]);
            ans = Math.max(ans, currMaxFromRight - pMin[i]);
            //ans = Math.max(ans, sMax[i]-pMin[i]);
        }
        System.out.println(ans);
    }
}
