package M2GearingUp.Recursion.DivideAndConquer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SequentialDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        int ld = Integer.toString(low).length();
        int hd = Integer.toString(high).length();
        System.out.println(sequentialDigits(low, high));
    }
    private static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList();
        int ld = Integer.toString(low).length();
        int hd = Integer.toString(high).length();
        int [] nums = new int[10- ld];
        StringBuilder number = new StringBuilder();
        for (int i = 1; i <= ld; i++) {
            number.append(i);
        }
        for (int i = 1; i <= nums.length; i++) {
            nums[i-1] = Integer.parseInt(String.valueOf(number));
            number.deleteCharAt(0);
            char ch = number.charAt(number.length()-1);
            ch++;
            number.append(ch);
        }
        helper(ans, ld, low, high, ld, hd, 0, nums);
        return ans;
    }
    private static void helper(List<Integer> ans, int ld, int low, int high, int digs, int maxDigs, int num, int[] nums) {
        // base case
        if(digs == maxDigs){
            if(num >= low && num <= high) ans.add(num);
            System.out.println(num);
            return;
        }
        if(digs == ld) {
            //
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] >= low && nums[i] <= high && digs != maxDigs) ans.add(nums[i]);
                helper(ans, ld, low, high, digs+1, maxDigs, nums[i], nums);
            }

        }
        if(digs < maxDigs && digs != ld) {
            // do recursion
            for (int i = 0; i < 10-digs; i++) {
                StringBuilder number = new StringBuilder(Integer.toString(num));
                number.deleteCharAt(0);
                char ch = number.charAt(number.length()-1);
                ch++;
                number.append(ch);
                System.out.print(number+" ");
                helper(ans, ld, low, high, digs+1, maxDigs, Integer.parseInt(String.valueOf(number)), nums);
            }
        }
    }
}
