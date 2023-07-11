package M2GearingUp.Math.Theory;

import java.util.Scanner;
public class LCM{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        // finding
        int lcm = lcm(arr[0], arr[1]);
        // finding lcm of adjacent 2 numbers over all elements numbers
        for (int i = 2; i < n; i++) {
            lcm = lcm(lcm, arr[i]);
        }
        System.out.println(lcm);
    }
    private static int lcm(int a, int b) { // returns lcm of 2 numbers...
        int gcd = gcd(a, b);
        return a*b / gcd;
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