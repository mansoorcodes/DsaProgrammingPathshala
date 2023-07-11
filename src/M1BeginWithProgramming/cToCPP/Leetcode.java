package M1BeginWithProgramming.cToCPP;

import java.util.Scanner;

public class Leetcode {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String columnTitle = scn.next();
        System.out.println(titleToNumber(columnTitle));
    }
    public static int titleToNumber(String columnTitle) {
        int p = 1;
        int ans = 0;
        for(int i = columnTitle.length() - 1; i>= 0; i--){
            char ch = columnTitle.charAt(i);
            ans += p * ((ch - 'A') + 1);
            p *= 26;
        }
        return ans;
    }
}
