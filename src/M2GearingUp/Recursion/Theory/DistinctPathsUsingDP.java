package M2GearingUp.Recursion.Theory;

import java.util.Arrays;
import java.util.Scanner;

public class DistinctPathsUsingDP {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        System.out.println(dynamicProgramming(0, 0, rows,cols));
    }

    private static int dynamicProgramming(int i, int j, int rows, int cols) {
        int [][] grid = new int[rows][cols];
        for (int r = 0; r < rows; r++) { // filling last column i = 1
            grid[r][cols-1] = 1;
        }
        for (int c = 0; c < cols; c++) { // filling last row = 1
            grid[rows-1][c] = 1;
        }
        // dynamic programming
        for (int r = rows-2; r >= 0; r--) {
            for (int c = cols-2; c >= 0; c--) {
                grid [r][c] += grid[r][c+1] + grid[r+1][c];
            }
        }
        return grid[0][0];
    }
}
