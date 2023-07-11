package M2GearingUp.ArraysArrayLists;

import java.util.Scanner;

public class SumOfAllSubArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        // here Reverse Lookup is Used
        long m = (long) (10e8+7);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long contribution = (((i+1)%m * (n-i)%m)% m * arr[i] % m) % m;
            ans = (ans % m + contribution % m) % m;
        }
        System.out.println(ans);
    }
}

/*
for(i1 = 0to n-1){
    for(j1 = 0 to n-1){
        for(i2 = i1 to n-1){
            for(j2 = j1 to n-1){
                ans += getSum(arr, i1, j1, i2, j2);
            }
        }
    }
}
 */