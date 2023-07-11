package M2GearingUp.Backtracking.Theory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NQueens {
    static public List<List<String>> ans;
    static int [][] chess;
    static boolean [] ansFound;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        chess = new int[n][n];
        ansFound = new boolean[1];
        ans = new ArrayList<>();
        printNQueens(n, 0);
        System.out.println(ans);
    }

    private static void printNQueens(int n, int row) {
//        if(ansFound[0]) return;
        if(row == n) {
            ansFound[0] = true;
            List<String> config = new ArrayList<>();
            for (int r = 0; r < n; r++) {
                StringBuilder temp = new StringBuilder();
                for (int c = 0; c < n; c++) {
                    temp.append(chess[r][c] == 0 ? '.' : 'Q');
                }
                config.add(temp.toString());
            }
            ans.add(config);
            return;
        }
        for (int col = 0; col < n; col++) {
            if(isSafe(row, col, chess)){
                chess[row][col] = 1;
                printNQueens(n, row+1);
                chess[row][col] = 0;
            }
        }
    }

    private static boolean isSafe(int row, int col, int[][] chess) {
        // we only need to check a top portion only if any threat is there
        // up
        for (int r = row-1; r >= 0; r--) {
            if(chess[r][col] == 1) return false;
        }
        // topRight Diag
        for (int r = row-1, c= col+1; r >=0 && c <= chess.length-1; r--, c++) {
            if(chess[r][c] == 1) return false;
        }
        // topLeft diag
        for (int r = row-1, c= col-1; r >=0 && c>=0; r--,c--) {
            if(chess[r][c] == 1) return false;
        }
        return true;
    }
}
