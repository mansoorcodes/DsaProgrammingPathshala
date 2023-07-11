package M2GearingUp.Recursion.Problems;

import java.util.Scanner;

public class _2_HW_RecursiveDigitSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String n = scn.next();
        int k = scn.nextInt();
        System.out.println(superDigit(n, k));
    }
    public static int superDigit(String n, int k) {
        // Write your code here
        long num = 0;
        for (int i = 0; i< n.length(); i++) {
            num += n.charAt(i) - '0';
        }
        num *= k;
        String sum = Long.toString(num);
        int[] ans = {0};
        calculateSuperDigit(sum, ans);
        return ans[0];
    }
    public static void calculateSuperDigit(String sum, int []ans){
        if(sum.length() == 1){
            ans[0] = sum.charAt(0) - '0';
            return;
        }
        long num = 0;
        for (int i = 0; i < sum.length(); i++) {
            num += sum.charAt(i)- '0';
        }
        sum = String.valueOf(num);
        calculateSuperDigit(sum, ans);
    }
}
