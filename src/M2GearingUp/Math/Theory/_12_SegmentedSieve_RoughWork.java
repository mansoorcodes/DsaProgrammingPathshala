package M2GearingUp.Math.Theory;
/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class _12_SegmentedSieve_RoughWork
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        // apply sieve to rootR
        int rootR = 100000;
        int [] sievePrimes = new int[rootR+1];
        ArrayList<Integer> primesUntilRootR = sieve(sievePrimes,rootR);

//        for (int i = 0; i < range; i++) {
//            segmentedSievePrimes[i] = (int) L+i;
//        }
//
//        System.out.println(primesUntilRootR);
//        System.out.println(Arrays.toString(sievePrimes));

//        System.out.println(Arrays.toString(segmentedSievePrimes));
        int t = scn.nextInt();
        while(t-- >0){
            long L = scn.nextLong();
            long R = scn.nextLong();

            int range = (int)(R - L + 1); // no of elements from L to R both included..
            int [] segmentedSievePrimes = new int[range];
            segmentedSieve(segmentedSievePrimes, range, primesUntilRootR, L, R);
            ArrayList<Long> segmentedPrimesList = new ArrayList<>();

            for (int p = 0; p < range; p++) {
                if(segmentedSievePrimes[p] == 1) segmentedPrimesList.add(p+L);
            }
            //        System.out.println(segmentedPrimesList);

            int size = segmentedPrimesList.size();
            long ans = 1;
            int m = (int)1e9+7;
            for (int i = 0; i < size; i++) {
                long p = segmentedPrimesList.get(i);
                ans = (ans%m * p%m) % m;
            }
            System.out.println(ans);
        }

    }
    private static void segmentedSieve(int[] segmentedSievePrimes, int range, ArrayList<Integer> primesUntilRootR, long L, long R) {
        Arrays.fill(segmentedSievePrimes, 1);
        int size = primesUntilRootR.size();
        for (int i = 0; i < size; i++) {
            int p = primesUntilRootR.get(i);
            // find the first multiple of p
            // take ceil division to get valid multiple of p whose p*m lies in range [L,R]
            int m = (int)Math.ceil((L*1.0)/p);
            for (; (long) p *m <= R; m++) {
                long idx = ((long)p * m) -L;
                if((int)(idx+ L) / p != 1) segmentedSievePrimes[(int)idx] = 0;
                // here we should not cut those primes themselves. that's why it's the condition
            }
        }
    }
    private static ArrayList<Integer> sieve(int [] sievePrimes, int rootR) {
        ArrayList<Integer> primesUntilRootR = new ArrayList<>();
        Arrays.fill(sievePrimes, 1);
        sievePrimes[0] = 0;
        sievePrimes[1] = 0;
        for (int p = 2; p*p <= rootR; p++) {
            if(sievePrimes[p] == 1){
                // primesUntilRootR.add(p);
                // this here is wrong b/c it can't add all primes.
                for (int m = p; p*m <= rootR; m++) {
                    sievePrimes[p*m] = 0;
                }
            }
        }
        for (int p = 2; p <= rootR; p++) {
            if(sievePrimes[p] == 1) primesUntilRootR.add(p);
        }
        return primesUntilRootR;
    }
}