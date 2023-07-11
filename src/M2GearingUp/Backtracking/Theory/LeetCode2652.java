package M2GearingUp.Backtracking.Theory;

import java.util.Scanner;

public class LeetCode2652 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // O(1) solution...
        int threes = n/3;
        int fives = n/5;
        int sevens = n/7;
        int ans = 0;
        // ans += (fives/2)*(2*5 +(fives-1)*5); // here I did a blunder in programming
        // b/c we are dividing integrely we get 0 not 1/2
        // so only divide the end result after multiplication...
        // ans += (sevens/2)*(2*7 +(sevens-1)*7);

        ans += (threes)* 3 * (2 + threes-1) / 2;
        ans += (fives)* 5 * (2 + fives-1) / 2;
        ans += (sevens)* 7 * (2 + sevens-1) / 2;
        System.out.println(ans);
    }
}
