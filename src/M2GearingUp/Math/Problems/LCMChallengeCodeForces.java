package M2GearingUp.Math.Problems;

import java.util.Scanner;

public class LCMChallengeCodeForces {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n<=3){
            if(n == 1){
                System.out.println(1);
            } else if (n == 2) {
                System.out.println(2);
            } else if (n == 3) {
                System.out.println(6);
            }
        }
        else {
            if(n%2 != 0){
                System.out.println((long)(n)*(n-1)*(n-2));
            } else if (n %3 == 0) {
                System.out.println((long)(n-1)*(n-2)*(n-3));
            } else {
                System.out.println((long)(n)*(n-1)*(n-3));
            }
        }
    }
}
