package M2GearingUp.Recursion.DivideAndConquer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static M2GearingUp.Recursion.Theory._11_AllSubsetsOfASet_UsingBitMasking.printAllSubSetsBitMasking;

public class SubsetSum1WithNegativeElements {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int sum = scn.nextInt();
        System.out.println();
        System.out.println(countOfSubsetsWithTargetSumReturn(arr, sum, 0, false));
        System.out.println(listOfAllSubsetsWithTargetSum(arr, sum));
        printAllSubSetsBitMasking(arr, n); // imported from another class...
    }


    private static int countOfSubsetsWithTargetSumReturn(int[] arr, int sum, int idx, boolean isFound) {
        if(idx == arr.length) {
            if(sum == 0 && !isFound) return 1;
            else return 0;
        }
        int ans = 0;
        if(sum == 0 && !isFound) {
            ans ++;
            isFound = true;
        }
        return ans + countOfSubsetsWithTargetSumReturn(arr, sum - arr[idx], idx+1, false) + countOfSubsetsWithTargetSumReturn(arr, sum, idx+1, isFound);
    }

    private static List<List<Integer>> listOfAllSubsetsWithTargetSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        addAllSubsetsToAList(candidates, target, 0, res, ans, false);
        return ans;
    }
    private static void addAllSubsetsToAList(int[] arr, int sum, int idx, List<Integer> res, List<List<Integer>> ans, boolean isFound) {
        if(idx == arr.length) {
            if(sum == 0 && !isFound) ans.add(new ArrayList<>(res));
            return;
        }
        if(sum == 0 && !isFound) {
            ans.add(new ArrayList<>(res));
            isFound = true;
//            System.out.println(new ArrayList<>(res));
        }
        res.add(arr[idx]);
        addAllSubsetsToAList(arr, sum - arr[idx], idx+1, res, ans, false);
        res.remove(res.size()-1);
        addAllSubsetsToAList(arr, sum, idx+1, res, ans, isFound);
    }
}

/**
 * i/p:
 * 5
 * -1 -2 4 1 3
 * 3
 *
 * o/p:
 * 7
 * [[-1, 4], [-1, 4], [-1, 4], [-1, 1, 3], [-2, 4, 1], [-2, 4, 1], [3]]
 *
 * Wrong Answer repeating answers...
 *
 *
 * I fixed this using a boolean condition
 * when I found an answer I don't want to add my answer in all my right calls
 * b/c all my right calls i.e., all my right diagonal calls are exactly the same...
 * So, I shouldn't add to my answer...
 * WOOOW WOW WOW WOOOOOOOOOOOWWWW
 */

/*
[] ==> 0
[3] ==> 3..................(4)
[1] ==> 1
[1, 3] ==> 4
[4] ==> 4
[4, 3] ==> 7
[4, 1] ==> 5
[4, 1, 3] ==> 8
[-2] ==> -2
[-2, 3] ==> 1
[-2, 1] ==> -1
[-2, 1, 3] ==> 2
[-2, 4] ==> 2
[-2, 4, 3] ==> 5
[-2, 4, 1] ==> 3............(3)
[-2, 4, 1, 3] ==> 6
[-1] ==> -1
[-1, 3] ==> 2
[-1, 1] ==> 0
[-1, 1, 3] ==> 3............(2)
[-1, 4] ==> 3...............(1)
[-1, 4, 3] ==> 6
[-1, 4, 1] ==> 4
[-1, 4, 1, 3] ==> 7
[-1, -2] ==> -3
[-1, -2, 3] ==> 0
[-1, -2, 1] ==> -2
[-1, -2, 1, 3] ==> 1
[-1, -2, 4] ==> 1
[-1, -2, 4, 3] ==> 4
[-1, -2, 4, 1] ==> 2
[-1, -2, 4, 1, 3] ==> 5

 */