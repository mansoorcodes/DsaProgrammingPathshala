package M2GearingUp.Math.Problems;

import java.util.Scanner;

public class _HW_DivisorSimulation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- >0){
            int n = scn.nextInt();
            if(n == 1) {
                System.out.println(0);
                continue;
            }
            // finding factors in rootN time.
            int ans = 1;
            for (int i = 2; i*i <= n; i++) {
                if(n%i == 0){
                    ans += i;
                    // add the counterpart only if it's not a perfect square
                    // or same as => don't add same factors 2 times...
                    if(i*i != n) ans += n/i;
                }
            }
            System.out.println(ans);
        }
    }
}
