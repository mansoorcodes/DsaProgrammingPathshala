package M2GearingUp.Recursion.DivideAndConquer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SubsetSum2 {
    static int cnt;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        int sum = scn.nextInt();
        cnt = 0;
        subsetSum2(arr, sum, 0);
        System.out.println(cnt);

        System.out.println(getAllSubsetSum2(arr, sum));
        System.out.println(getAllSubsetSum2UsingLoops(arr, sum));

    }

    private static List<List<Integer>> getAllSubsetSum2(int[] arr, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        addAllSubsetSum2ToList(ans, arr, sum, 0, res);
        return ans;
    }

    private static void addAllSubsetSum2ToList(List<List<Integer>> ans, int[] arr, int sum, int idx, List<Integer> res) {
        if(sum < 0) return;
        if(idx == arr.length){
            if(sum == 0) ans.add(new ArrayList<>(res));
            return;
        }
        res.add(arr[idx]);
        addAllSubsetSum2ToList(ans, arr, sum-arr[idx], idx, res);
        res.remove(res.size()-1);
        addAllSubsetSum2ToList(ans, arr, sum, idx+1, res);
    }


    private static void subsetSum2(int[] arr, int sum, int idx) {
        if(sum <0) return;
        if(idx == arr.length){
            if(sum == 0) cnt++;
            return;
        }
        subsetSum2(arr, sum-arr[idx], idx);
        subsetSum2(arr, sum, idx+1);
    }

    private static List<List<Integer>> getAllSubsetSum2UsingLoops(int[] arr, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        addAllSubsetSum2ToListUsingLoops(ans, arr, sum, 0, res);
        return ans;
    }

    private static void addAllSubsetSum2ToListUsingLoops(List<List<Integer>> ans, int[] arr, int sum, int idx, List<Integer> res) {
        if(idx == arr.length){
            if(sum == 0) ans.add(new ArrayList<>(res));
            return;
        }
        int tempSum = sum;
        List<Integer> tempRes = new ArrayList<>(res);
        // this temp res idea is possible b/c I draw Recursion Tree diagram i.e.,
        // I Dry Run PEN PAPER IMPORTANT...
        while (tempSum >= 0){
            if(tempSum != sum) tempRes.add(arr[idx]);
            addAllSubsetSum2ToListUsingLoops(ans, arr, tempSum, idx+1, tempRes);
//            if(tempSum != sum) res.remove(res.size()-1);
            tempSum -= arr[idx];
        }
    }
}

/**
 * i/p:
 11
 6 5 7 1 8 2 9 9 7 7 9
 6
 */