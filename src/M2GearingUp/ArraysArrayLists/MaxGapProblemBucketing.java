package M2GearingUp.ArraysArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class MaxGapProblemBucketing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        // find min, max elem
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        // find minAns possible in sorted array. Here gap == minAns
        // n-1 == no of Gaps in b/w min and max in sorted array...
        // here before dividing with n-1 CHECK if it will be 0...
        // If so our ans is 0 b/c maximum gap is zero
        // also if our (max == min) or all elements are same then also ans == 0...
        // so return 0 before dividing with 0;
        if(max - min == 0) {
            System.out.println(0);
            return;
        }
        int gap = (max-min)/(n-1); // her made mistake not adding () properly.
        if((max - min)%(n-1) != 0) gap++; // here if all elements are not in equlibrium
        int [] minBkt = new int[n];
        int [] maxBkt = new int[n];
        Arrays.fill(minBkt, Integer.MAX_VALUE);
        Arrays.fill(maxBkt, Integer.MIN_VALUE);
        // fill the bkts with elements
        // formula is bkt.No = (arr[i]-min)/gap
        for (int i = 0; i < n; i++) {
            int bktNo = (arr[i]-min)/gap;
            // here division with 0 is not occurring b/c we already would have returned...
            minBkt[bktNo] = Math.min(arr[i], minBkt[bktNo]);
            maxBkt[bktNo] = Math.max(arr[i], maxBkt[bktNo]);
        }
        int ans = 0;
        for (int i = 0; i <= n-2; i++) {
            int r = minBkt[i+1];
            int l = maxBkt[i];
            while(r == Integer.MAX_VALUE){
                // here if any empty bkt is there i'll go check next bkt...
                i++;
                r = minBkt[i+1];
            }
            ans = (Math.max(minBkt[i+1] - l, ans));
            // here if any empty bkts are there they will do this
            // --> Math.max((IntMax - IntMin) == -1 , ans);
            // as our ans is +ve  we are safe here // NO THIS IS FALSE I WAS WRONG...
            // here my logic broke b/c I was doing --> (IntMax - ele) and its contributing to my ans

        }
        System.out.println(ans);
    }
}
