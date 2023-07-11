package M2GearingUp.Math.Theory;

import java.util.Scanner;

public class _6EvenOddFactors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rootN =  (int)Math.sqrt(n);
        if(rootN * rootN == n) System.out.println("Odd");
        else System.out.println("Even");
    }
}
