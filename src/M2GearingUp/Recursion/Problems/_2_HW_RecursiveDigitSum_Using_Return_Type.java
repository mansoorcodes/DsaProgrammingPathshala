package M2GearingUp.Recursion.Problems;

import java.util.Scanner;

public class _2_HW_RecursiveDigitSum_Using_Return_Type {
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
        return calculateSuperDigit(sum);
    }
    public static int calculateSuperDigit(String sum){
        if(sum.length() == 1){
            return sum.charAt(0) - '0';
        }
        long num = 0;
        for (int i = 0; i < sum.length(); i++) {
            num += sum.charAt(i)- '0';
        }
        sum = String.valueOf(num);
        return calculateSuperDigit(sum);
    }
}

