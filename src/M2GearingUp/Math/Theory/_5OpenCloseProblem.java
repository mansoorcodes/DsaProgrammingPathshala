package M2GearingUp.Math.Theory;

import java.util.Scanner;

public class _5OpenCloseProblem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // n denotes no of doors initially all closed
        // in ith round toggle those doors where door number is multiple of i
        // after n rounds how many doors are open
        betterApproach(n);
        mostOptimalApproach(n);
    }

    private static void mostOptimalApproach(int n) {
        System.out.println((int)Math.sqrt(n));
    }

    private static void betterApproach(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int sqrt = (int)Math.sqrt(i);
            if(sqrt * sqrt == i) ans++;
        }
        System.out.println(ans);
    }
}

/**
 * BTW I did it myself before VIVEKAM...
 * Approach naive/ brute force is possible but since it's math problem,
 * there is always a better soln.
 * It is at the end ith door toggles how many times? this is what we want to find out
 * (ith) door can be toggled by it's previous rounds only
 * if those (previous round numbers)(prev) can divide i perfectly. or
 * in other words (prev) has multiple of i then it can change
 * so what are the multiples of prev those all it would change
 * Or if we talk at the end (ith) door is changed by all of its factors once...
 * if even factors --> closed
 * else --> open
 */

/**
 * BEST SOLUTION
 * Just we want how many perfect squares are there below N
 * it's done by me in GFG --> _6GFG3FactorsInRange Problem
 * also in My good notes...
 * So Answer is print(Math.sqrt(n));
 */