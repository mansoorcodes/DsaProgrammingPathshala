package M2GearingUp.Math.Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class _HW_CommonDivisors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- >0){
            int a = scn.nextInt();
            int b = scn.nextInt();
            // since a, b <= 10^9 we can't create SPF[10^9];
            // we have to rootN
            ArrayList<Integer> primesA = new ArrayList<>();
            ArrayList<Integer> countA = new ArrayList<>();
            primeFactors(a, primesA, countA);

            ArrayList<Integer> primesB = new ArrayList<>();
            ArrayList<Integer> countB = new ArrayList<>();
            primeFactors(b, primesB, countB);

            long ans = 1; // handle this if a, b don't have common.
            // so if nothing is common b/w a & b then ans is never updated
            // b/c if atleast 1 prime is common, and it's count is 1 then ans will become 2
            // least possible ans == 2...
            // above comments doesn't apply here
            /**
             * here if there are no common prime factors b/w a and b then ans = 1
             * b/c 1 is the common factor of everything...
             * so don't check the above condition just print ans.
             */
            for (int i = 0; i < primesA.size(); i++) {
                int pa = primesA.get(i);
                for (int j = 0; j < primesB.size(); j++) {
                    int pb = primesB.get(j);
                    if(pa == pb){
                        ans *= (Math.min(countA.get(i), countB.get(j)) + 1);
                    }
                }
            }
            System.out.println(ans);
        }
    }
    private static void primeFactors(int n, ArrayList<Integer> primes, ArrayList<Integer> count) {
        int num = n;
        for (int p = 2; p*p <= num; p++) {
            if(n % p == 0) primes.add(p);
            else continue;
            int cnt = 0;
            while (n % p == 0){
                cnt++;
                n /= p;
            }
            count.add(cnt);
        }
        if(n != 1) {
            primes.add(n);
            count.add(1);
        }
        System.out.println(primes);
        System.out.println(count);
    }
}
