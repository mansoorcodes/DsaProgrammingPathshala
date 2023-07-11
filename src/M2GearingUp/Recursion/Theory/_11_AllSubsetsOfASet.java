package M2GearingUp.Recursion.Theory;

import java.util.ArrayList;
import java.util.Scanner;

public class _11_AllSubsetsOfASet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        printAllSubsets(arr, n, 0, "");

        // this below implementation was done on air using Kitchen Tiles as array...
        ArrayList<String> ans = new ArrayList<>();
        System.out.println(printAllSubSetsByRecursiveFaith(arr, n, 0));
    }

    private static ArrayList<String> printAllSubSetsByRecursiveFaith(int[] arr, int n, int idx) {
        if(idx == n) {
            ArrayList<String > res = new ArrayList<>();
            res.add("");
            return res ;
        }
        ArrayList<String> currRes = printAllSubSetsByRecursiveFaith(arr, n, idx+1);
        ArrayList<String> currAns = new ArrayList<>();
        for (int i = 0; i < currRes.size(); i++) {
            String str = currRes.get(i);
            currAns.add(str);
            str += arr[idx];
            currAns.add(str);
        }
        return currAns;
    }

    private static void printAllSubsets(int[] arr, int n, int idx, String ans) {
        if(idx == n) {
            System.out.println(ans);
            return;
        }
        printAllSubsets(arr, n, idx+1, ans);
        printAllSubsets(arr, n, idx+1, ans+ arr[idx]);
    }
}
