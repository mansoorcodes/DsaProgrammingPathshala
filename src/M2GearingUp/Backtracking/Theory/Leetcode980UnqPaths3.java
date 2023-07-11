package M2GearingUp.Backtracking.Theory;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode980UnqPaths3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        int[][] grid = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                grid[i][j] = scn.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(grid));
        System.out.println(uniquePathsIII(grid));
    }
    static int ans;
    public static int uniquePathsIII(int[][] grid) {
        ans = 0;
        int cnt = 0;
        int i1 = 0, j1 = 0, i2 = 0, j2 = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    i1 = i;
                    j1 = j;
                }
                if(grid[i][j] == 2){
                    i2 = i;
                    j2 = j;
                }
                if(grid[i][j] == 0){
                    cnt++;
                }
            }
        }
        System.out.println("src: "+ i1+" "+j1+"dst: "+i2+" "+j2);
        backtracking(grid, i1, j1, i2, j2, cnt);
        return ans;
    }
    public static void backtracking (int[][] grid, int i1, int j1, int i2, int j2, int cnt){
        // you reached desti but all are not covered then return
        if(i1 == i2 && j1 == j2 && cnt > 0) return;
        if(cnt == 0 && i1 == i2 && j1 == j2) {
            System.out.println("Ikadaki vachava?");
            ans++;
            return;
        }
        // R
        if(j1 <= grid[0].length-2 && (grid[i1][j1+1] == 0 ||grid[i1][j1+1] == 2)){
            System.out.print("R ");
            System.out.println("i1, j1: "+i1+" "+j1);
            System.out.println("cnt: "+cnt);
            if(grid[i1][j1+1] == 0) {
                grid[i1][j1+1] = -1;
                backtracking(grid, i1, j1+1, i2, j2, cnt-1);
                grid[i1][j1+1] = 0;
            }
            if(grid[i1][j1+1] == 2) backtracking(grid, i1, j1+1, i2, j2, cnt);
        }
        // D
        if(i1 <= grid.length-2 && (grid[i1+1][j1] == 0 ||grid[i1+1][j1] == 2)){
            System.out.print("D ");
            System.out.println("i1, j1: "+i1+" "+j1);
            System.out.println("cnt: "+cnt);
            if(grid[i1+1][j1] == 0) {
                grid[i1+1][j1] = -1;
                backtracking(grid, i1+1, j1, i2, j2, cnt-1);
                grid[i1+1][j1] = 0;
            }
            if(grid[i1+1][j1] == 2) backtracking(grid, i1+1, j1, i2, j2, cnt);
        }
        // L
        if(j1 >= 1 && (grid[i1][j1-1] == 0 ||grid[i1][j1-1] == 2)){
            System.out.print("L ");
            System.out.println("i1, j1: "+i1+" "+j1);
            System.out.println("cnt: "+cnt);
            if(grid[i1][j1-1] == 0) {
                grid[i1][j1-1] = -1;
                backtracking(grid, i1, j1-1, i2, j2, cnt-1);
                grid[i1][j1-1] = 0;
            }
            if(grid[i1][j1-1] == 2) backtracking(grid, i1, j1-1, i2, j2, cnt);
        }
        // U
        if(i1 >= 1 && (grid[i1-1][j1] == 0 ||grid[i1-1][j1] == 2)){
            System.out.print("U ");
            System.out.println("i1, j1: "+i1+" "+j1);
            System.out.println("cnt: "+cnt);
            if(grid[i1-1][j1] == 0) {
                grid[i1-1][j1] = -1;
                backtracking(grid, i1-1, j1, i2, j2, cnt-1);
                grid[i1-1][j1] = 0;
            }
            if(grid[i1-1][j1] == 2) backtracking(grid, i1-1, j1, i2, j2, cnt);
        }
    }
}

/*

3
4
1 0 0 0
0 0 0 0
0 0 0 2

2
2
0 1
2 0

 */