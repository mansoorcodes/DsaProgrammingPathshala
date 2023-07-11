package M2GearingUp.Recursion.Theory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _9LetterCombinationsLeetcodeReturnList {
    static final char[][] nokia = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},
            {'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String D = scn.next();
        letterCombinations(D);
    }

    public static List<String> letterCombinations(String D) {
        int len = D.length();
        List<String> ans = new ArrayList<>();
        if (len == 0) return ans;
        bfs(0, len, new StringBuilder(), ans, D);
        return ans;
    }

    public static void bfs(int idx, int len, StringBuilder sb, List<String> ans, String nums) {
        if (idx == len) {
            ans.add(sb.toString());
            System.out.println(sb);
        }
        else {
            char[] letters = nokia[Character.getNumericValue(nums.charAt(idx))];
            for (int i = 0; i < letters.length; i++)
                bfs(idx+1, len, new StringBuilder(sb).append(letters[i]), ans, nums);
        }
    }
//   private static void letterCombinationsPassByValueOfSBWorkingSoln(String nums, int idx, StringBuilder sb) {
//        // this also not working...
//        if(idx == nums.length()) {
//            System.out.println(sb);
//            return;
//        }
//        for (int i = 0; i < nokia[nums.charAt(idx) - '0'].length(); i++) {
//            StringBuilder copy = new StringBuilder(sb);
//            copy.append(nokia[nums.charAt(idx) - '0'].charAt(i));
//            letterCombinations(nums, idx+1, copy);
//        }
//    }
}