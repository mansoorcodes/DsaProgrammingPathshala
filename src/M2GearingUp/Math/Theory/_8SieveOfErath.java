package M2GearingUp.Math.Theory;

import java.util.Scanner;

public class _8SieveOfErath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printSievePrimes(n);
    }

    private static void printSievePrimes(int n) {
        boolean [] primes = new boolean[n+1];
        for (int i = 0; i <= n; i++) {
            primes[i] = true;
        }
        primes[1] = false;
        for (int p = 2; p*p <= n; p++) {
            if(primes[p]) {
                for (int m = p; p*m <= n; m++) {
                    primes[p*m] = false;
                }
//                for (int i = p*2; i <= n; i+=p) { // anyone is fine...
//                    primes[i] = false;
//                }
            }
        }
        for (int i = 1; i < n; i++) {
            if(primes[i]) System.out.println(i+" ");
        }
    }
}
