package M2GearingUp.ArraysArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class ReArrangeArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        // my Complain boy logic
        int nextVal = 0;
        int currIdx = arr[0];
        int nextIdx;
        for (int i = 0; i < n; i++) {
            nextIdx = arr[currIdx];
            arr[currIdx] = nextVal;
            nextVal = currIdx;
            currIdx = nextIdx;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
