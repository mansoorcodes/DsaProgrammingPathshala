package M2GearingUp.Math.Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * A number is called
 * Happy Prime if there are exactly 2 distinct prime divisors of it.
 * Find the number of
 * Happy Prime numbers between 1 and N both inclusive.
 */
public class _2HAlmostPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int NUM = 1000000;
        // pre processing
        int [] primes = new int[NUM+2];
        int [] SPF = new int[NUM+2];
        preProcessing(primes, SPF, NUM);
        int t = Integer.parseInt(br.readLine());
        while (t-- >0){
            int n = Integer.parseInt(br.readLine());
            int ans = 0;
            for (int i = 2; i <= n; i++) {
                int num = i;
                ArrayList<Integer> primeFactors = new ArrayList<>();
                while (SPF[num] != -1){
                    primeFactors.add(SPF[num]);
                    num /= SPF[num]; // blunder here we are changing the loop control variable inside loop
                    // we should not change loop control variable inside
                    // we have to create a copy of it and change the copy...
                }
                if(num > 1) {
                    primeFactors.add(num);
                }
                if(primeFactors.size() == 2 && !Objects.equals(primeFactors.get(0), primeFactors.get(1))){
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
    private static void preProcessing(int[] primes, int[] SPF, int NUM) {
        Arrays.fill(primes, 1);
        Arrays.fill(SPF, -1);
        primes[1] = 0;
        for (int p = 2; p*p <= NUM; p++) {
            if(primes[p] == 1){
                for (int m = p; p*m <= NUM; m++) {
                    if(primes[p*m] == 1){
                        // also if(primes[p*m] == 1) This Means
                        // it's getting cut for the first time
                        primes[p*m] = 0;
                        SPF[p*m] = p;
                    }
                }
            }
        }
    }
}
