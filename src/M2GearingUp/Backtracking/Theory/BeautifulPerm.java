package M2GearingUp.Backtracking.Theory;

import java.util.Arrays;
import java.util.Scanner;

public class BeautifulPerm {
    static int cnt;
    static int operationsCnt; // curious testing purpose...
    public static int countArrangement(int n) {
        int [] arr = new int[n];
        for(int i = 0; i<n; i++) arr[i] = i+1;
        cnt = 0;
        operationsCnt = 0;
        countBeautifulPerms(arr, 0);
        return cnt;
    }
    public static void countBeautifulPerms(int[] arr, int idx){
        operationsCnt++;
        if(idx == arr.length){
            cnt++;
            // System.out.println(Arrays.toString(arr));
            return;
        }
        for(int i = idx; i< arr.length; i++){
            if(arr[i] % (idx+1) != 0 && (idx+1) % arr[i] != 0) continue;
            swap(arr, idx, i);
            countBeautifulPerms(arr, idx+1);
            swap(arr, idx, i);
        }
    }
    public static void swap(int[] arr, int idx, int i){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(countArrangement(n));
        System.out.println("Operations cnt: "+operationsCnt);
    }
}
