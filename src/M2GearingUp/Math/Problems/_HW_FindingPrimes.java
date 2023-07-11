package M2GearingUp.Math.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _HW_FindingPrimes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // sieve and Prefix Primes...
        int max = 1000000;
        int [] primes = new int[max+1];
        sieve(primes, max);

//        // revers sieve
//        int [] reversePrimes = new int[max+1];
//        reverseSieve(reversePrimes, max);

        // preComputation
        int [] primesTillNum = new int[max+1];
        preCompute(primesTillNum, max, primes);

        int t = scn.nextInt();
        while (t-- >0){
            int n = scn.nextInt();
            System.out.println(primesTillNum[n]);
        }
    }

    private static void preCompute(int[] primesTillNum, int max, int[] primes) {
        //
        for (int num = 0; num <= max; num++) {
            primesTillNum[num] = primes[num] - primes[num/2];
        }
    }

    private static void sieve(int[] primes, int max) {
        Arrays.fill(primes, 1);
        primes[0] = 0;
        primes[1] = 0;
        for (int p = 2; p*p <= max; p++) {
            if(primes[p] == 1) {
                for (int m = p; p*m <= max; m++) {
                    primes[p*m] = 0;
                }
            }
        }
        // prefix primes
        for (int i = 1; i <= max; i++) {
            primes[i] += primes[i-1];
        }
    }
    private static void reverseSieve(int[] reversePrimes, int max) {
        Arrays.fill(reversePrimes, 1);
        reversePrimes[0] = 0;
        for (int num = max; num >= 2; num--) {
            if(reversePrimes[num] == 1){
                ArrayList<Integer> factors = getFactors(num);
                for (int f = factors.size()-1; f >= 0; f--) {
                    if(factors.get(f) != num) reversePrimes[factors.get(f)] = 1;
                }
            }
        }
    }

    private static ArrayList<Integer> getFactors(int num) {
        ArrayList<Integer> factors = new ArrayList<>();
        int rootN =  (int)Math.sqrt(num);
        for (int i = 1; i <= rootN; i++) {
            if(num % i == 0){
                if(i*i == num) factors.add(i); // means n is perfect square
                else{
                    factors.add(i);
                    factors.add(num / i);
                }
            }
        }
        return factors;
    }
}
