package M1BeginWithProgramming.cToCPP;

import java.util.Scanner;

public class CFContest5_19_23C {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- >0){
            int n = scn.nextInt();
            int [] a = new int[n];
            int min = Integer.MAX_VALUE;
            int odd = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scn.nextInt();
                min = Math.min(min, a[i]);
                if(a[i] % 2 != 0) odd++;
            }
            if(min %2 != 0) System.out.println("YES");
            else if(min %2 == 0 && odd == 0) System.out.println("YES");
            else if (min %2 == 0 && odd != 0) System.out.println("NO");
        }
    }
}
