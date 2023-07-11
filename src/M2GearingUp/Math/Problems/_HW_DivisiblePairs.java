package M2GearingUp.Math.Problems;

import java.util.Scanner;

// divisible by four
public class _HW_DivisiblePairs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while (T-- > 0){
            int n = scn.nextInt();
            int mod = 4;
            int [] freq = new int[4];
            for (int i = 0; i < n; i++) {
                int a = scn.nextInt();
                freq[a%4]++;
            }
            // buckets are filled
            // edge case is buckets of 2 are taken twice as a pair same with bucket 0
            int ans = 0;

            /**
            ans += (freq[0] * (freq[0]-1)) / 2;
            ans += freq[1] * freq[3];
            ans += (freq[2] * (freq[2]-1)) / 2;
            System.out.println(ans);
            */

            // general case of mod.
            ans += (freq[0] * (freq[0]-1)) / 2;
            for (int i = 1; i <= (mod/2)-1 ; i++) {
                ans += freq[i] * freq[mod-i];
            }
            ans += (mod %2 == 0? (freq[mod/2] * (freq[mod/2]-1)) / 2: freq[mod/2] * freq[(mod/2)+1]);
            System.out.println(ans);
        }
    }
}
