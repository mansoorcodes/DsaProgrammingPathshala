package M2GearingUp.Recursion.DivideAndConquer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Here I'm returning when my (sum == 0)
 * this won't work if arr[i] == 0 or arr[i] == -ve
 * Not works for 0 or -ve elements
 * for eg: arr = [1, 2, -3, 0, 1, -1]
 * then only terminate at leaf node
 *
 * It's always good idea to terminate at Leaf node
 * at if (idx == arr.length) return;
 */

public class SubsetSum1 {
    static int ans = 0;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int sum = scn.nextInt();
        ans = 0;
        subsetSumWithoutReturn(arr, sum, 0);
        System.out.println(ans);

        System.out.println(countOfSubsetsWithTargetSumReturn(arr, sum, 0));
        System.out.println(listOfAllSubsetsWithTargetSum(arr, sum));
    }

    private static int countOfSubsetsWithTargetSumReturn(int[] arr, int sum, int idx) {
        if(sum == 0) {
            return 1;
        }
        if(sum <0) return 0;
        if(idx == arr.length) return 0;
        return countOfSubsetsWithTargetSumReturn(arr, sum - arr[idx], idx+1) + countOfSubsetsWithTargetSumReturn(arr, sum, idx+1);
    }

    private static void subsetSumWithoutReturn(int[] arr, int sum, int idx) {
        if(sum == 0) {
            ans++;
            return;
        }
        if(sum <0) return;
        if(idx == arr.length) return;
        subsetSumWithoutReturn(arr, sum - arr[idx], idx+1);
        subsetSumWithoutReturn(arr, sum, idx+1);
    }
    private static List<List<Integer>> listOfAllSubsetsWithTargetSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        addAllSubsetsToAList(candidates, target, 0, res, ans);
        return ans;
    }
    private static void addAllSubsetsToAList(int[] arr, int sum, int idx, List<Integer> res, List<List<Integer>> ans) {
        if(sum == 0) {
            ans.add(new ArrayList<>(res));
//            System.out.println(new ArrayList<>(res));
            return;
        }
        if(sum <0) return;
        if(idx == arr.length) return;
        res.add(arr[idx]);
        addAllSubsetsToAList(arr, sum - arr[idx], idx+1, res, ans);
        res.remove(res.size()-1);
        addAllSubsetsToAList(arr, sum, idx+1, res, ans);
    }
}
