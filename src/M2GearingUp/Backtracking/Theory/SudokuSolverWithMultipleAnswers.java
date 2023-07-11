package M2GearingUp.Backtracking.Theory;

        import java.util.Arrays;
        import java.util.Scanner;

public class SudokuSolverWithMultipleAnswers {
    static char[][] copyBoard;
//    static boolean ansFound;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char[][] board = new char[9][9];
        for (int r = 0; r < 9; r++) {
            String str = scn.next();
            for (int c = 0; c < 9; c++) {
                board[r][c] = str.charAt(c);
            }
        }
        solveSudoku(board);
        System.out.println();
        for (int r = 0; r < 9; r++) {
            System.out.println(board[r]);
        }
//        System.out.println("Naku global var answer : "+ansFound);
    }
    public static void solveSudoku(char[][] board) {
//        ansFound = false;
        copyBoard = new char[9][9];
        // driver function
        // rowFreq[10], cf[], smf[]
        int[][] rowFreq = new int[9][10];
        int[][] colFreq = new int[9][10];
        int[][] subMatrixFreq = new int[9][10];
        // fill initially and send to helper func
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char ch = board[r][c];
                int val = ch - '0';
                if(ch != '.'){
                    rowFreq[r][val]++;
                }
            }
        }
        for (int c = 0; c < 9; c++) {
            for (int r = 0; r < 9; r++) {
                char ch = board[r][c];
                int val = ch - '0';
                if(ch != '.'){
                    colFreq[c][val]++;
                }
            }
        }
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char ch = board[r][c];
                int val = ch - '0';
                int matrixNum = getMatrixNumber(r, c);
                if(ch != '.'){
                    subMatrixFreq[matrixNum][val]++;
                }
            }
        }
        // now call helper function
        helper(board, 0, 0, rowFreq, colFreq, subMatrixFreq);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = copyBoard[i][j];
            }
        }
    }

    private static void helper(char[][] board, int r, int c, int[][] rowFreq, int[][] colFreq, int[][] subMatrixFreq) {
//        if(ansFound) return;
        if(r == 9){
            System.out.println("YESSSSSSS");
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    copyBoard[i][j] = board[i][j];
                    System.out.print(board[i][j]);
                }
            }
//            ansFound = true;
            return;
        }
        // elements are there, so just move forward don't do recursion here...
        char ch = board[r][c];
        if(ch != '.'){
            if(c < 8) helper(board, r, c+1, rowFreq, colFreq, subMatrixFreq);
            else helper(board, r+1, 0, rowFreq, colFreq, subMatrixFreq);
        }
        else {
            // elements are '.'
            for (int num = 1; num <= 9; num++) {
                // check for num is safe to put
                // check row, col, subMat
                if(rowFreq[r][num] == 0 && colFreq[c][num] == 0 && subMatrixFreq[getMatrixNumber(r, c)][num] == 0){
                    board[r][c] = (char)(num+'0');
                    rowFreq[r][num]++;
                    colFreq[c][num]++;
                    subMatrixFreq[getMatrixNumber(r, c)][num]++;
                    if(c < 8) helper(board, r, c+1, rowFreq, colFreq, subMatrixFreq);
                    else helper(board, r+1, 0, rowFreq, colFreq, subMatrixFreq);
//                    if(!ansFound){
//                        board[r][c] = '.';
//                        rowFreq[r][num]--;
//                        colFreq[c][num]--;
//                        subMatrixFreq[getMatrixNumber(r, c)][num]--;
//
////                        System.out.print("I"+ board[r][c]+" ");
//
//                    }
                    System.out.print("O"+ board[r][c]+" ");
                    board[r][c] = '.';
                    rowFreq[r][num]--;
                    colFreq[c][num]--;
                    subMatrixFreq[getMatrixNumber(r, c)][num]--;
                }
            }
        }
    }

    private static int getMatrixNumber(int r, int c) {
        return ((r/3)*3) + (c/3);
    }
}

/*

53..7....
6..195...
.98....6.
8...6...3
4..8.3..1
7...2...6
.6....28.
...419..5
....8..79

 */


/*
if(!ansFound){
                        board[r][c] = '.';
                        rowFreq[r][num]--;
                        colFreq[c][num]--;
                        subMatrixFreq[getMatrixNumber(r, c)][num]--;
                    }

                    EE logic yenduku work avvatam ledu kanukko bro okasari LOL...!!!
                    idid work avutundi but nenu konchem pilla pillllla mistake chesa...
                   Don't worry Be positive...+++
                   I wrote the correct logic in Leetcode  37. Sudoku Solver

 */