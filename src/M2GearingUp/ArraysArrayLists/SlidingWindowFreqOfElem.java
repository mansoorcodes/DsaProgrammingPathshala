package M2GearingUp.ArraysArrayLists;

import java.util.Scanner;

/*
4 (k)
2 2 1 2 4 6 2 5 2 1
2 (x)
3 2 1 2 1 2 2 (freq)
 */
public class SlidingWindowFreqOfElem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt(); //window size
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt(); // find x
        // sliding window starts
        int freq = 0;
        for (int i = 0; i < k; i++) {
            if(arr[i] == x) freq++;
        }
        System.out.print(freq+" ");
        for (int i = k; i < n; i++) { // here i is the last elem of window
            freq += (arr[i] == x? 1: 0) - (arr[i-k] == x? 1:0);
            System.out.print(freq+" ");
        }
    }
}
