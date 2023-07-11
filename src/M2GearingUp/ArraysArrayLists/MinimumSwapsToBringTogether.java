package M2GearingUp.ArraysArrayLists;

import java.util.Scanner;

public class MinimumSwapsToBringTogether {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt(); // find elem which are <= k
        int [] arr = new int[n];
        int cntOfLegalElements = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            if(arr[i] <= k) cntOfLegalElements++;
        }
        // SLIDING window technique, Window size is cntOfLegalElem;
        int wSize = cntOfLegalElements;
        int maxLegalElemInWindow = Integer.MIN_VALUE;
        int prevMax = 0;
        for (int i = 0; i < wSize; i++) {
            if(arr[i] <= k) prevMax++;
        }
        maxLegalElemInWindow = prevMax;
        for (int i = 1; i <= n-wSize; i++) {
            int currMax = prevMax - (arr[i-1] <= k? 1: 0) + (arr[(i+wSize-1)%n] <= k? 1: 0);
            maxLegalElemInWindow = Math.max(currMax, maxLegalElemInWindow);
            prevMax = currMax;
        }
        System.out.println(cntOfLegalElements - maxLegalElemInWindow);
    }
}
// circular array --> if n = 11, window size = 4
//
