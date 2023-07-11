package M2GearingUp.Recursion.Theory;

import java.util.Scanner;

public class DistinctPaths {
    static int ans = 0;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        boolean [][] grid = new boolean[rows][cols];
        rec(grid, 0, 0, rows, cols );
        System.out.println(ans);
    }

    private static void rec(boolean[][] grid, int i, int j, int rows, int cols) {
        if(i >= rows || j >= cols || grid[i][j]) return;
        if(i != rows-1 && j != cols-1) grid [i][j] = false;
        rec(grid, i+1, j, rows, cols);
        rec(grid, i, j+1, rows, cols);
        if(i == rows-1 && j == cols-1) ans++;
    }
}
