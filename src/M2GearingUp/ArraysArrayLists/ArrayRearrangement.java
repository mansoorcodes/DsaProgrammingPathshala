package M2GearingUp.ArraysArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRearrangement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] >= 0){
                // Cycle starts and all elements are >= 0 Should be CHANGED
                int val = 0;
                int idx = i;
                int nextIdx = arr[idx];
                do {
                    // finally I did it after 2 Hrs of Debugging LOL..
                    val = nextIdx;
                    nextIdx = arr[val];
                    arr[val] = -(idx+1);
                    idx = val;
                    System.out.println(Arrays.toString(arr));
                } while (idx!= i);
            }
        }
        System.out.println(Arrays.toString(arr));
        // Decryption
        for (int i = 0; i < n; i++) {
            arr[i] = -(arr[i]+1);
        }
        // Printing
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
