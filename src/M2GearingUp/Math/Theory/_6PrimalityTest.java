package M2GearingUp.Math.Theory;

import java.util.Scanner;


public class _6PrimalityTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        if(isPrime(num)) System.out.println("Prime");
        else System.out.println("Not Prime");
    }

    private static boolean isPrime(int num) {
        if(num == 1) return false;
        int cnt = 0;
        for (int i = 2; i*i <= num; i++) {
            if(num%i == 0) {
                cnt++;
                break;
            }
        }
        return cnt==0; // this is so simple yet doesn't handle edge cases like...
    }
}
