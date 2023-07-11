package M2GearingUp.Math.Problems;
// https://codeforces.com/problemset/problem/230/B

import java.util.Scanner;

public class _HW_T_Primes_CF_230_B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long [] arr = new long[n];
        long maxNum = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextLong();
            if(arr[i] > maxNum) maxNum = arr[i];
        }

        // this is the size of our sieve
        // while multiplying, we have to Long it (long)..
        int size = (int) Math.sqrt(maxNum);
        boolean [] primes = new boolean[size+1];
        int [] primeFactorsCnt = new int[size+1];
        preComputation(primes, primeFactorsCnt,size);

        // traverse arr and find its prime factor cnt
        for (int i = 0; i < n; i++) {
            int num = (int) Math.sqrt(arr[i]);
            // if !perfect Square print NO.
            if((long)num *num == arr[i]){
                System.out.println(primes[num]?"YES": "NO");
            }else{
                System.out.println("NO");
            }
        }
    }

    private static void preComputation(boolean[] primes, int[] primeFactorsCnt, int size) {
        // sieve
        for (int i = 2; i <= size; i++) {
            primes[i] = true;
        }
        for (int p = 2; p*p <= size; p++) {
            if(primes[p]) {
                for (int m = p; p*m <= size; m++) {
                    primes[p*m] = false;
                }
            }
        }
        // System.out.println(Arrays.toString(primes));
//        // update no of prime factors
//        for (int p = 2; p <= size; p++) {
//            if(primes[p]){
//                for (int i = p; i <= size; i++) {
//                    if(i*i % p == 0) primeFactorsCnt[i]++;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(primeFactorsCnt));
        // this above logic is not correct for finding whatever
        // I need to find another logic for above array --> primeFactorsCnt[i]....
        // simply my answer is if sqrt(arr[i]) is prime then YES else NO
    }
}









//        while (n-- >0){
// this was my first shit logic Use Sieve...
////            // malli dengindi edge case
////            if(num == 1) {
////                System.out.println("NO");
////                continue;
////            }
////            long sqrt = (long)Math.sqrt(num);
////            if(sqrt*sqrt == num) System.out.println("YES");
////            else System.out.println("NO");
//        }