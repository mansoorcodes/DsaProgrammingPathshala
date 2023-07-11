package M2GearingUp.Math.Theory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class _10FastFactorization {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // pre processing
        int NUM = 1000000;
        int [] primes = new int[NUM+1];
        int [] SPF = new int[NUM+1];
        ArrayList<Integer> onlyPrimes = new ArrayList<>();
        preProcessing(primes, SPF, onlyPrimes, NUM);
        int t = scn.nextInt();
        while (t-- >0){
            int n = scn.nextInt();
            ArrayList<Integer> primeFactors = new ArrayList<>();
            while (SPF[n] != -1){
                primeFactors.add(SPF[n]);
                n /= SPF[n];
            }
            if(n > 1) {
                primeFactors.add(n);
            }
            int cnt = 1;
            for (int i = 0; i < primeFactors.size()-1; i++) {
                int curr = primeFactors.get(i);
                int next = primeFactors.get(i+1);
                if(curr == next){
                    cnt++;
                }else{
                    System.out.println(curr+" "+cnt);
                    cnt = 1;
                }
            }
            System.out.println(primeFactors.get(primeFactors.size()-1)+" "+cnt);
        }
    }
    private static void preProcessing(int[] primes, int[] SPF, ArrayList<Integer> onlyPrimes, int NUM) {
        primes[1] = 0;
        Arrays.fill(primes, 1);
        Arrays.fill(SPF, -1);
        for (int p = 2; p*p <= NUM; p++) {
            if(primes[p] == 1){
                for (int m = p; p*m <= NUM; m++) {
                    if(SPF[p*m] == -1){
                        // also if(primes[p*m] == 1) This Means
                        // it's getting cut for the first time
                        primes[p*m] = 0;
                        SPF[p*m] = p;
                    }
                }
            }
        }
        for (int p = 2; p <= NUM; p++) {
            if(primes[p] == 1) onlyPrimes.add(p);
        }
    }
}
