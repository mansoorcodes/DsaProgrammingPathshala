package M2GearingUp.Math.Theory;

import java.util.Scanner;

public class _6GFG3FactorsInRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Long L = scn.nextLong();
        Long R = scn.nextLong();
        // System.out.println(count3DivNums(L, R));
        System.out.println(count3DivNumsMoreOptimal(L,R));
    }

    private static int count3DivNumsMoreOptimal(Long L, Long R) {
        int ans = 0;
        // here 1 is not our answer it's an exception.
        long sqrtL = (long)Math.sqrt(L);
        long sqrtR = (long)Math.sqrt(R);
        if(sqrtL*sqrtL != L) sqrtL++;
        for (long i = sqrtL; i <= sqrtR; i++) {
            if(isPrime(i)) ans++;
        }
        return ans;
    }

    private static boolean isPrime(long N) {
        int sqrtN = (int)Math.sqrt(N);
        if(N == 1) return false;
        for (int i = 2; i <= sqrtN; i++) {
            if(N % i == 0) return false;
        }
        return true;
    }

    static int count3DivNums(Long L, Long R) {
        // code here
        int ans = 0;
        long sqrtL = (long)Math.sqrt(L);
        long sqrtR = (long)Math.sqrt(R);
        if(sqrtL*sqrtL != L) sqrtL++;
        for (long i = sqrtL; i <= sqrtR; i++) {
            // this is Time Limit Exceeded...
            long num = i*i;
            if(countFactors(num) == 3) ans++;
        }
        return ans;
    }
    private static long countFactors(long n) {
        long rootN =  (long)Math.sqrt(n);
        long cnt = 0;
        for (long i = 1; i <= rootN; i++) {
            if(n % i == 0){
                if(i*i == n) cnt++; // means n is perfect square
                else cnt += 2;
            }
        }
        return cnt;
    }
}
