package M2GearingUp.Math.Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HardestProblemEver {
    /**
     * Use BufferReader class for taking inputs outputs
     * b/c Scanner is failing...
     *
     * public static void main(String[] args) throws IOException {
     * IOException should be there for readLine();
     *
     * int t = Integer.parseInt(br.read()); <-- this doesn't work
     * int n = Integer.parseInt(String.valueOf(br.read())); <-- this works...
     * Wrap using String.valueOf();
     *
     */
    public static void main(String[] args) throws IOException {
        // Scanner scn = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int t = Integer.parseInt(String.valueOf(br.read()));
        // int t  = scn.nextInt();
        String[] line1 = br.readLine().split(" ");
        int t=Integer.parseInt(line1[0]);
        while (t-- >0){
            // int n = Integer.parseInt(String.valueOf(br.read()));
            String[] line2 = br.readLine().split(" ");
            int n=Integer.parseInt(line2[0]);
            String[] arr= br.readLine().split(" ");

            // int [] arr = new int[n];

//            for (int i = 0; i < n; i++) {
//                // arr[i] = Integer.parseInt(String.valueOf(br.read()));
//            }
            // here I didn't consider array with size (n == 1)
            if(n <= 1) {
                System.out.println(0);
                continue;
            }
            printAns(arr);
        }
    }
    private static void printAns(String [] arr) {
        int n = arr.length;
        int gcd=gcd(Integer.parseInt(arr[0]), Integer.parseInt(arr[1])); // here I made a mistake I calculated gcd here
        // but it wont go inside for loop down it will just go to the last line and print 0.
        // but I have to consider array with 2 elements and
        // if their gcd is 1 then I have to print 1.....
        for (int i = 2; i < n; i++) {
            gcd = gcd(gcd, Integer.parseInt(arr[i]));
            if(gcd == 1) {
                System.out.println(1);
                return;
            }
        }
        /**
         * this is old code
         * System.out.println(0);
         * I didn't add check for gcd >1
         */
        // below lines are updated lines
        if(gcd>1) System.out.println(0);
        else System.out.println(1);
    }
    private static int gcd(int a, int b) { // returns gcd of 2 numbers...
        int divisor = Math.min(a, b);
        int dividend = Math.max(a, b);
        if(divisor == 0) return dividend;
        while (true){
            int rem = dividend % divisor;
            if(rem == 0) return divisor;
            dividend = divisor;
            divisor = rem;
        }
    }
}
