package M2GearingUp.Math.Theory;

import java.util.Scanner;

public class _9PrimeFactorization {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write prime factors of n
        primeFactors(n);
    }

    private static void primeFactors(int n) {
        int num = n;
        for (int p = 2; p*p <= num; p++) {
            while (n % p == 0){
                System.out.print(p+" ");
                n /= p;
            }
        }
        if(n != 1) System.out.print(n);
    }
}
