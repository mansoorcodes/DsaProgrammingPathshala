package M2GearingUp.Math.Problems;

/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class _2AssignCntOfDivisorsOfMultiQ
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        // Scanner scn = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int NUM = 1000000;
        // pre processing
        int [] primes = new int[NUM+2];
        int [] SPF = new int[NUM+2];
        preProcessing(primes, SPF, NUM);
        // int t = scn.nextInt();
        int t = Integer.parseInt(br.readLine());
        while (t-- >0){
            // int q = scn.nextInt();
            int q = Integer.parseInt(br.readLine());
            String[] in = br.readLine().trim().split("\\s+");
            int [] arr = new int[in.length];
            for(int i = 0; i < q; i++){
                arr[i] = Integer.parseInt(in[i]);
                // int n = scn.nextInt();
                if(arr[i] == 1) {
                    System.out.print(0+" ");
                    continue;
                }
                ArrayList<Integer> primeFactors = new ArrayList<>();
                while (SPF[arr[i]] != -1){
                    primeFactors.add(SPF[arr[i]]);
                    arr[i] /= SPF[arr[i]];
                }
                if(arr[i] > 1) {
                    primeFactors.add(arr[i]);
                }
                int cnt = 1;
                for (int j = 0; j < primeFactors.size()-1; j++) {
                    int curr = primeFactors.get(j);
                    int next = primeFactors.get(j+1);
                    if(curr == next){

                    }else{
                        cnt++;
                    }
                }
                System.out.print(cnt+" ");
                // System.out.print(primeFactors);
            }
            System.out.println();
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