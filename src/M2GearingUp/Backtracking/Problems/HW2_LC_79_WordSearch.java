package M2GearingUp.Backtracking.Problems;

import java.util.Scanner;

public class HW2_LC_79_WordSearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        char[][] board = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            String str = scn.next();
            for (int j = 0; j < cols; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        String word = scn.next();
        System.out.println(exist(board, word));
    }
    public static boolean exist(char[][] board, String word) {
        char firstChar = word.charAt(0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(firstChar == board[i][j]){
                    if(backtracking(board, word, i, j, 0)) return true;
                }
            }
        }
        return false;
    }

    private static boolean backtracking(char[][] board, String word, int i, int j, int idx) {
        if(idx == word.length()-1) {
            return true;
        }
        
        board[i][j] = '.';
        char nextChar = word.charAt(idx+1);
        // R
        if(isBound(i, j+1, board) && board[i][j+1] == nextChar && board[i][j+1] != '.') {
            if(backtracking(board, word, i, j+1, idx+1)) return true;
        }
        // D
        if(isBound(i+1, j, board) && board[i+1][j] == nextChar && board[i+1][j] != '.') {
            if(backtracking(board, word, i+1, j, idx+1)) return true;
        }
        // L
        if(isBound(i, j-1, board) && board[i][j-1] == nextChar && board[i][j-1] != '.') {
            if(backtracking(board, word, i, j-1, idx+1)) return true;
        }
        // U
        if(isBound(i-1, j, board) && board[i-1][j] == nextChar && board[i-1][j] != '.') {
            if(backtracking(board, word, i-1, j, idx+1)) return true;
        }
        char ch = word.charAt(idx);
        board[i][j] = ch;
        return false;
    }

    private static boolean isBound(int i, int j, char[][] board) {
        return i < board.length && j < board[0].length && i >= 0 && j >= 0;
    }
}

/*
TC:

3 4
ABCE
SFCS
ADEE
ABCCED
 */
