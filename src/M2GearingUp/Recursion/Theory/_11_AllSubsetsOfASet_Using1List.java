package M2GearingUp.Recursion.Theory;

import java.util.ArrayList;
import java.util.Scanner;

public class _11_AllSubsetsOfASet_Using1List {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        boolean decision = false;
        printAllSubsets(arr, n, 0, ans, decision);
    }

    private static void printAllSubsets(int[] arr, int n, int idx, ArrayList<Integer> ans, boolean decision) {
        if(idx == n) {
            System.out.println(ans);
//            if(decision) ans.remove(ans.size()-1);
            return;
        }
        printAllSubsets(arr, n, idx+1, ans, false);
        ans.add(arr[idx]);
        printAllSubsets(arr, n, idx+1, ans, true);
        ans.remove(ans.size()-1);
    }
}
