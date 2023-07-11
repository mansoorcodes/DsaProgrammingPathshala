package M2GearingUp.Recursion.Theory;

import java.util.Scanner;

public class DistinctPathsAlternateApproaches {
    static int ans = 0;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        // using void recursion.
        countPathsVoid(0, 0, rows, cols);
        System.out.println(ans);

        // using Bottom to Top thinking
        System.out.println(countPathsBottomToTop(rows-1, cols-1));
    }

    private static int countPathsBottomToTop(int i, int j) {
        // here (i, j) is the destination I want to reach from fixed source(0, 0)
        if(i == 0 || j == 0) return 1;
        return countPathsBottomToTop(i, j-1) + countPathsBottomToTop(i-1, j);
    }

    private static void countPathsVoid(int i, int j, int rows, int cols) {
        if(i == rows-1 || j == cols-1){
            ans++;
            return;
        }
        countPathsVoid(i, j+1, rows, cols);
        countPathsVoid(i+1, j, rows, cols);
    }
}
