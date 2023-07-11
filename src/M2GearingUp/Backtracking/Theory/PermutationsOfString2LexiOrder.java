package M2GearingUp.Backtracking.Theory;

import java.util.Scanner;

public class PermutationsOfString2LexiOrder {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scn.next());
        // Sort this String before passing to recursion...
        printAllPermutationsUsingBacktrackingInLexiOrder(sb, 0);

        //StringBuilder sbTest = new StringBuilder(scn.next());
        //testingPurposeOfShiftLeftRightFunctions(sbTest);

    }

    private static void printAllPermutationsUsingBacktrackingInLexiOrder(StringBuilder sb, int idx) {
        if(idx == sb.length()-1){
            System.out.println(sb);
            return;
        }
        int cnt = 1;
        for (int i = idx; i < sb.length(); i++) {
            swap(idx, i, sb);
            cnt++;
            if(cnt > 2) shiftRight(sb, i, idx);
            printAllPermutationsUsingBacktrackingInLexiOrder(sb, idx+1);
            if(cnt > 2) shiftLeft(sb, i, idx);
            swap(idx, i, sb);
        }
    }

    private static void shiftLeft(StringBuilder sb, int i, int idx) {
        // this func places idx+1 at i and shifts everything to left... in between
        char ch = sb.charAt(idx +1);
        for (int j = idx+1; j <= i-1; j++) {
            char temp = sb.charAt(j+1);
            sb.setCharAt(j, temp);
        }
        sb.setCharAt(i, ch);
    }

    private static void swap(int idx, int i, StringBuilder sb) {
        char ch = sb.charAt(idx);
        sb.setCharAt(idx, sb.charAt(i));
        sb.setCharAt(i, ch);
    }

    private static void shiftRight(StringBuilder sb, int i, int idx){
        // this func places i at idx+1 and shifts everything right... in between
        char ch = sb.charAt(i);
        for (int j = i; j >= idx+2; j--) {
            char temp = sb.charAt(j-1);
            sb.setCharAt(j, temp);
        }
        sb.setCharAt(idx+1, ch);
    }
    private static void testingPurposeOfShiftLeftRightFunctions(StringBuilder sbTest) {
        System.out.println(sbTest);
        shiftRight(sbTest, 8, 4);
        System.out.println(sbTest);
        shiftLeft(sbTest, 8, 4);
        System.out.println(sbTest);
    }
}
