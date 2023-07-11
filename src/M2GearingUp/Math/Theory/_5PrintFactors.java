package M2GearingUp.Math.Theory;

import java.util.Scanner;

public class _5PrintFactors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printFactors(n);
    }

    private static void printFactors(int n) {
        int rootN =  (int)Math.sqrt(n);
        for (int i = 1; i <= rootN; i++) {
            if(n % i == 0){
                if(i*i == n) System.out.print(i+" "); // means n is perfect square
                else System.out.print(i+" "+n/i+" ");
            }
        }
    }
}
