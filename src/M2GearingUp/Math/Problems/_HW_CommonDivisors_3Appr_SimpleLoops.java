package M2GearingUp.Math.Problems;

import java.util.Scanner;

public class _HW_CommonDivisors_3Appr_SimpleLoops {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            long a = scn.nextLong();
            long b = scn.nextLong();
            solution(a,b);
        }
    }
    private static void solution(long a, long b) {
        long x = Math.min(a, b), cnt = 0;
        for (long i = 1; i * i <= x; i++) {
            if (a % i == 0 && b % i == 0) {
                if (i * i == x) cnt++;
                else if (a % (x / i) == 0 && b % (x / i) == 0) cnt = cnt + 2;
                else cnt++;
            }
        }
        System.out.println(cnt);
    }
}