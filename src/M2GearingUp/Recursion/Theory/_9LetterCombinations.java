package M2GearingUp.Recursion.Theory;

import java.util.Scanner;
// https://dev.to/seanpgallivan/solution-letter-combinations-of-a-phone-number-1n91
// above JAVA code uses SB class and paas by value also...

public class _9LetterCombinations {
    static String [] nokia = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String nums = scn.next();
        StringBuilder ans = new StringBuilder();
        String answ = "";
        // letterCombinations(nums, 0, ans); // NO
        letterCombinationsStr(nums, 0, answ); // this works

        // below approach in every recursion State we maintain a copy inside rec func, and
        // it should not be passed to recursion b/c we don't want it to change.
        // but we have to pass something else to rec.

        // letterCombinationsPassByValueOfSB(nums, 0, ans); // NO

        StringBuilder sb = new StringBuilder();
        letterCombinationsPassByValueOfSBWorkingSoln(nums, 0, sb);// this works
    }

    private static void letterCombinationsPassByValueOfSBWorkingSoln(String nums, int idx, StringBuilder sb) {
        // Finally, this is working by creating a new object of SB
        // and passing its reference to recursion
        // this is also the same as using just Strings in the letterCombinationsStr() METHOD...
        if(idx == nums.length()) {
            System.out.println(sb);
            return;
        }
        for (int i = 0; i < nokia[nums.charAt(idx) - '0'].length(); i++) {
            StringBuilder copy = new StringBuilder(sb);
            copy.append(nokia[nums.charAt(idx) - '0'].charAt(i));
            letterCombinationsPassByValueOfSBWorkingSoln(nums, idx+1, copy);
        }
    }

    private static void letterCombinations(String nums, int idx, StringBuilder ans) {
        // not working as expected.
        if(idx == nums.length()) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < nokia[nums.charAt(idx) - '0'].length(); i++) {
            letterCombinations(nums, idx+1, ans.append(nokia[nums.charAt(idx) - '0'].charAt(i)));
        }
    }
    private static void letterCombinationsStr(String nums, int idx, String answ) {
        if(idx == nums.length()) {
            System.out.println(answ);
            return;
        }
        for (int i = 0; i < nokia[nums.charAt(idx) - '0'].length(); i++) {
            letterCombinationsStr(nums, idx+1, answ+(nokia[nums.charAt(idx) - '0'].charAt(i)));
        }
    }
    private static void letterCombinationsPassByValueOfSB(String nums, int idx, StringBuilder ans) {
        // not working as expected.
        StringBuilder copy = ans;
        if(idx == nums.length()) {
            System.out.println(copy);
            return;
        }
        for (int i = 0; i < nokia[nums.charAt(idx) - '0'].length(); i++) {
            letterCombinations(nums, idx+1, new StringBuilder("" + copy.toString() + (nokia[nums.charAt(idx) - '0'].charAt(i))));
        }
    }
}

/**
 * This is what I was looking for since 9AM int the mrng on 6/13/23 FUCKK.
 * class Solution {
 *     final char[][] L = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},
 *     {'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
 *
 *     public List<String> letterCombinations(String D) {
 *         int len = D.length();
 *         List<String> ans = new ArrayList<>();
 *         if (len == 0) return ans;
 *         bfs(0, len, new StringBuilder(), ans, D);
 *         return ans;
 *     }
 *
 *     public void bfs(int pos, int len, StringBuilder sb, List<String> ans, String D) {
 *         if (pos == len) ans.add(sb.toString());
 *         else {
 *             char[] letters = L[Character.getNumericValue(D.charAt(pos))];
 *             for (int i = 0; i < letters.length; i++)
 *                 bfs(pos+1, len, new StringBuilder(sb).append(letters[i]), ans, D);
 *         }
 *     }
 * }
 */