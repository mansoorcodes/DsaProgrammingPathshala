package M2GearingUp.ArraysArrayLists;

import java.util.Scanner;

public class ArrayNesting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == -1) continue;
            int cnt = 0;
            int nextIdx = 0, currIdx = i;
            while (arr[currIdx] != -1){
                nextIdx = arr[currIdx];
                arr[currIdx] = -1;
                currIdx = nextIdx;
                cnt++;
            }
            ans = Math.max(ans, cnt);
        }
        System.out.println(ans);
    }
}
